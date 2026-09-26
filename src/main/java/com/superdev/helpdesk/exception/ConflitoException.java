package com.superdev.helpdesk.exception;

import org.springframework.http.HttpStatus;

public class ConflitoException extends ErroAplicacao {
    public ConflitoException(String mensagem){
        super(HttpStatus.CONFLICT, "Conflito", mensagem);
    }
}
