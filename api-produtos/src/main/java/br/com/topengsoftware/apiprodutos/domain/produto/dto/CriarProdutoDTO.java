package br.com.topengsoftware.apiprodutos.domain.produto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

public record CriarProdutoDTO(@JsonProperty("nome") @Schema(description = "Nome do produto") String nome,
                              @JsonProperty("descricao") @Schema(description = "Descricao do produto") String descricao,
                              @JsonProperty("valor") @Schema(description = "Valor do produto") Double valor,
                              @JsonProperty("quantidade") @Schema(description = "Quantidade do produto") Integer quantidade) {
}
