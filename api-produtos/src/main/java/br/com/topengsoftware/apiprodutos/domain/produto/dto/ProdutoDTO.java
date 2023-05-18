package br.com.topengsoftware.apiprodutos.domain.produto.dto;

import java.time.LocalDate;

public record ProdutoDTO(Long id, String nome, String descricao, Double valor,
                         Integer quantidade, LocalDate dataCricao) {
}
