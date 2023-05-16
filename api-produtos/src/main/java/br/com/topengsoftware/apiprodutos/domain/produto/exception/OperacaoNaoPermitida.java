package br.com.topengsoftware.apiprodutos.domain.produto.exception;

public class OperacaoNaoPermitida extends RuntimeException {

    private final String mensagem;

    public OperacaoNaoPermitida(final String mensagem) {
        this.mensagem = mensagem;
    }

}
