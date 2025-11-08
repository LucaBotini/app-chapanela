package com.lucabotini.chapanelaspringboot.exception;

public class EscolhaInvalidaException extends RuntimeException {
    public EscolhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
