package br.com.topengsoftware.apiprodutos.domain.produto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoNaoExiste extends RuntimeException {
    public ProdutoNaoExiste(Long produtoId) {
        super("produto: " + produtoId + ", nao existe");
    }
}
