package br.com.topengsoftware.apiprodutos.domain.usuario;

import java.time.LocalDate;

public class Usuario {

    private Long id;
    private String nome;
    private String username;
    private String password;
    private LocalDate dataCriacao;

    private Usuario(
            final String nome,
            final String username,
            final String password,
            final LocalDate dataCriacao
    ) {
        this.nome = nome;
        this.username = username;
        this.password = password;
        this.dataCriacao = dataCriacao;
    }

    public static Usuario criar(
            final String nome,
            final String username,
            final String password
    ) {
        final LocalDate dataCriacao = LocalDate.now();

        return new Usuario(nome, username, password, dataCriacao);
    }

    public UsuarioEntity toUsuarioEntity() {
        return new UsuarioEntity(
                this.nome,
                this.username,
                this.password,
                this.dataCriacao
        );
    }

}
