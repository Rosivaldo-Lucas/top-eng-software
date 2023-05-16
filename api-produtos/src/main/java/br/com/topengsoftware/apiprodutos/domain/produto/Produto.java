package br.com.topengsoftware.apiprodutos.domain.produto;

import java.time.LocalDate;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private Double valor;
    private Integer quantidade;
    private LocalDate dataCriacao;

    private Produto(
            final String nome,
            final String descricao,
            final Double valor,
            final Integer quantidade,
            final LocalDate dataCriacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.dataCriacao = dataCriacao;
    }

    public static Produto criar(
            final String nome,
            final String descricao,
            final Double valor,
            final Integer quantidade
    ) {
        final LocalDate dataCricao = LocalDate.now();

        final Produto produtoCriado = new Produto(
                nome,
                descricao,
                valor,
                quantidade,
                dataCricao
        );

        return produtoCriado;
    }

    public Long obterId() {
        return this.id;
    }

    public String obterNome() {
        return this.nome;
    }

    public String obterDescricao() {
        return this.descricao;
    }

    public Double obterValor() {
        return this.valor;
    }

    public Integer obterQuntidade() {
        return this.quantidade;
    }

    public LocalDate obterDataCriacao() {
        return this.dataCriacao;
    }

    public void atualizarNome(final String novoNome) {
        this.nome = novoNome;
    }

    public void atualizarDescricao(final String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public void atualizarValor(final Double novoValor) {
        this.valor = novoValor;
    }

    public void incrementarQuantidade(final Integer quantidade) {
        this.quantidade += quantidade;
    }

    public void decrementarQuantidade(final Integer quantidade) {
        this.quantidade -= quantidade;
    }

    public ProdutoEntity toProdutoEntity() {
        final ProdutoEntity produtoEntity = new ProdutoEntity(
                this.id,
                this.nome,
                this.descricao,
                this.valor,
                this.quantidade,
                this.dataCriacao
        );

        return produtoEntity;
    }

}
