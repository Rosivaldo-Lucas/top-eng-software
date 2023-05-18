package br.com.topengsoftware.apiprodutos.domain.produto;

import br.com.topengsoftware.apiprodutos.domain.produto.dto.CriarProdutoDTO;
import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoDTO;
import br.com.topengsoftware.apiprodutos.domain.produto.exception.ProdutoNaoExiste;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoDTO> listar() {
        return this.produtoRepository.findAll().stream().map(produto ->
                new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getValor(),
                        produto.getQuantidade(), produto.getDataCriacao())).collect(Collectors.toList());
    }

    public ProdutoDTO buscar(Long id) {
        final Produto produtoPersistido = this.produtoRepository.findById(id).orElseThrow(() -> new ProdutoNaoExiste(id));

        return new ProdutoDTO(produtoPersistido.getId(), produtoPersistido.getNome(), produtoPersistido.getDescricao(),
                produtoPersistido.getValor(), produtoPersistido.getQuantidade(), produtoPersistido.getDataCriacao());
    }

    public ProdutoDTO criar(CriarProdutoDTO criarProdutoDTO) {
        Produto produto = new Produto(criarProdutoDTO.nome(), criarProdutoDTO.descricao(),
                criarProdutoDTO.valor(), criarProdutoDTO.quantidade());
        produto = this.produtoRepository.save(produto);
        return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(),
                produto.getValor(), produto.getQuantidade(), produto.getDataCriacao());
    }

    public void deletar(Long id) {
        ProdutoDTO produtoBuscado = this.buscar(id);
        this.produtoRepository.deleteById(produtoBuscado.id());
    }

}
