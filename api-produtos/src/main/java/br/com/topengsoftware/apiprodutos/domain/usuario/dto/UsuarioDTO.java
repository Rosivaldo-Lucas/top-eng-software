package br.com.topengsoftware.apiprodutos.domain.usuario.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public record UsuarioDTO(
        @JsonProperty("id") @Schema(description = "Id (identificador) do usuario") Long id,
        @JsonProperty("nome") @Schema(description = "Nome do usuario") String nome,
        @JsonProperty("username") @Schema(description = "Username do usuario") String username,
        @JsonProperty("dataCriacao") @Schema(description = "Data de criacao do usuario") LocalDate dataCriacao
) {

    public static UsuarioDTO criar(final Long id, final String nome, final String username, final LocalDate dataCriacao) {
        return new UsuarioDTO(id, nome, username, dataCriacao);
    }

}
