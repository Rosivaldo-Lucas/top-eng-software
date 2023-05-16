package br.com.topengsoftware.apiprodutos.domain.usuario.dto;

public record UsuarioInput(
        String nome,
        String username,
        String password
) {

    public static UsuarioInput criar(final String nome, final String username, final String password) {
        return new UsuarioInput(nome, username, password);
    }

}
