package br.com.topengsoftware.apiprodutos.domain.produto;

import br.com.topengsoftware.apiprodutos.domain.produto.dto.CriarProdutoDTO;
import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @Operation(summary = "Listar produtos")
    @ApiResponse(description = "Listagem de produtos", responseCode = "200")
    @GetMapping
    public List<ProdutoDTO> listar() {
        return produtoService.listar();
    }

    @Operation(summary = "Buscar produto por Id")
    @ApiResponse(description = "Produto", responseCode = "200")
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProdutoDTO buscar(@PathVariable Long id) {
        return produtoService.buscar(id).getProdutoDTO();
    }

    @Operation(summary = "Criar produto")
    @ApiResponse(description = "Novo Produto Criado", responseCode = "201")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProdutoDTO> criar(@RequestBody CriarProdutoDTO criarProdutoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.criar(criarProdutoDTO));
    }

    @Operation(summary = "Deletar produto")
    @ApiResponse(description = "Produto Deletado", responseCode = "201", content = @Content(schema = @Schema()))
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

}
