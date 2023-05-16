package br.com.topengsoftware.apiprodutos.domain.produto;

import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoInput;
import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(final ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoOutput>> listar() {
        final List<ProdutoOutput> produtos = this.produtoService.listar();

        return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoOutput> buscar(@PathVariable Long id) {
        final ProdutoOutput produto = this.produtoService.buscar(id);

        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }

    @PostMapping
    public ResponseEntity<ProdutoOutput> criar(@RequestBody final ProdutoInput produtoInput) {
        final ProdutoOutput produtoCriado = this.produtoService.criar(produtoInput);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoCriado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable final Long id) {
        this.produtoService.deletar(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
