package br.com.topengsoftware.apiprodutos.domain.usuario.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

public record CriarUsuarioDTO(
        @JsonProperty("nome") @Schema(description = "Nome do usuario") String nome,
        @JsonProperty("username") @Schema(description = "Username do usuario") String username,
        @JsonProperty("password") @Schema(description = "Senha do usuario") String password) {


}
