package br.com.topengsoftware.apiprodutos.domain.produto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;

public record ProdutoDTO(@JsonProperty("id") @Schema(description = "Id (identificador) do produto") Long id,
                         @JsonProperty("nome") @Schema(description = "Nome do produto") String nome,
                         @JsonProperty("descricao") @Schema(description = "Descricao do produto") String descricao,
                         @JsonProperty("valor") @Schema(description = "Valor do produto") Double valor,
                         @JsonProperty("quantidade") @Schema(description = "Quantidade do produto") Integer quantidade,
                         @JsonProperty("data_criacao") @Schema(description = "Data de criacao do produto") OffsetDateTime dataCricao) {
}
