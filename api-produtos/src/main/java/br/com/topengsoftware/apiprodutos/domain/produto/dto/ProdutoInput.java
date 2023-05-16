package br.com.topengsoftware.apiprodutos.domain.produto.dto;

public record ProdutoInput(
        String nome,
        String descricao,
        Double valor,
        Integer quantidade
) {

    public static ProdutoInput criar(final String nome, final String descricao, final Double valor, final Integer quantidade) {
        return new ProdutoInput(nome, descricao, valor, quantidade);
    }

}
