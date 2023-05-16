package br.com.topengsoftware.apiprodutos.domain.usuario.dto;

import java.time.LocalDate;

public record UsuarioOutput(
        Long id,
        String nome,
        String username,
        LocalDate dataCriacao
) {

    public static UsuarioOutput criar(final Long id, final String nome, final String username, final LocalDate dataCriacao) {
        return new UsuarioOutput(id, nome, username, dataCriacao);
    }

}
