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
        return produtoRepository.findAll().stream().map(Produto::getProdutoDTO).collect(Collectors.toList());
    }

    public Produto buscar(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new ProdutoNaoExiste(id));
    }

    public ProdutoDTO criar(CriarProdutoDTO criarProdutoDTO) {
        Produto produto = new Produto(criarProdutoDTO);
        return produtoRepository.save(produto).getProdutoDTO();
    }

    public void deletar(Long id) {
        produtoRepository.delete(buscar(id));
    }

}
