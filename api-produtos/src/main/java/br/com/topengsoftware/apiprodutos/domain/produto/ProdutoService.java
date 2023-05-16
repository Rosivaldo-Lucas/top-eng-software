package br.com.topengsoftware.apiprodutos.domain.produto;

import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoInput;
import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoOutput;
import br.com.topengsoftware.apiprodutos.domain.produto.exception.OperacaoNaoPermitida;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(final ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoOutput> listar() {
        final List<ProdutoEntity> produtoEntities = this.produtoRepository.findAll();

        return produtoEntities.stream().map((produtoEntity) ->
                new ProdutoOutput(
                        produtoEntity.getId(),
                        produtoEntity.getNome(),
                        produtoEntity.getDescricao(),
                        produtoEntity.getValor(),
                        produtoEntity.getQuantidade(),
                        produtoEntity.getDataCriacao()
        )).collect(Collectors.toList());
    }

    public ProdutoOutput buscar(final Long id) {
        final ProdutoEntity produtoPersistido = this.produtoRepository.
                findById(id)
                .orElseThrow(() -> new OperacaoNaoPermitida(String.format("produto de id %s não encontrado.", id)));

        return ProdutoOutput.criar(
                produtoPersistido.getId(),
                produtoPersistido.getNome(),
                produtoPersistido.getDescricao(),
                produtoPersistido.getValor(),
                produtoPersistido.getQuantidade(),
                produtoPersistido.getDataCriacao()
        );
    }

    public ProdutoOutput criar(final ProdutoInput produtoInput) {
        final Produto produtoCriado = Produto.criar(
                produtoInput.nome(),
                produtoInput.descricao(),
                produtoInput.valor(),
                produtoInput.quantidade()
        );

        final ProdutoEntity produtoPersistido = this.produtoRepository.save(produtoCriado.toProdutoEntity());

        return ProdutoOutput.criar(
                produtoPersistido.getId(),
                produtoPersistido.getNome(),
                produtoPersistido.getDescricao(),
                produtoPersistido.getValor(),
                produtoPersistido.getQuantidade(),
                produtoPersistido.getDataCriacao()
        );
    }

    public void deletar(final Long id) {
        final ProdutoOutput produtoBuscado = this.buscar(id);

        this.produtoRepository.deleteById(produtoBuscado.id());
    }

}
