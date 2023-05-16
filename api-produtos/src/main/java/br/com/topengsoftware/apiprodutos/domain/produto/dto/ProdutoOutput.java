package br.com.topengsoftware.apiprodutos.domain.produto.dto;

import java.time.LocalDate;

public record ProdutoOutput(
        Long id,
        String nome,
        String descricao,
        Double valor,
        Integer quantidade,
        LocalDate dataCricao
) {

    public static ProdutoOutput criar(
            final Long id,
            final String nome,
            final String descricao,
            final Double valor,
            final Integer quantidade,
            final LocalDate dataCricao
    ) {
        return new ProdutoOutput(id, nome, descricao, valor, quantidade, dataCricao);
    }

}
