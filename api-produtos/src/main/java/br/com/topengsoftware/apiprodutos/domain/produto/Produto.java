package br.com.topengsoftware.apiprodutos.domain.produto;

import br.com.topengsoftware.apiprodutos.domain.produto.dto.CriarProdutoDTO;
import br.com.topengsoftware.apiprodutos.domain.produto.dto.ProdutoDTO;
import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "data-criacao")
    private OffsetDateTime dataCriacao;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double valor, Integer quantidade, OffsetDateTime dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.dataCriacao = dataCriacao;
    }

    public Produto(String nome, String descricao, Double valor, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.dataCriacao = OffsetDateTime.now();
    }

    public Produto(CriarProdutoDTO criarProdutoDTO) {
        this(criarProdutoDTO.nome(), criarProdutoDTO.descricao(),
                criarProdutoDTO.valor(), criarProdutoDTO.quantidade());
    }

    public ProdutoDTO getProdutoDTO() {
        return new ProdutoDTO(id, nome, descricao, valor, quantidade, dataCriacao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public OffsetDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(OffsetDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
