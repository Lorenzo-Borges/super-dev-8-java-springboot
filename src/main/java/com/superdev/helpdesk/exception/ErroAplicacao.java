package com.superdev.helpdesk.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ErroAplicacao extends RuntimeException{
    // Atributo protegidos com final para n permitir a mudança
    // Com Getter (que permitirá somente a leitura), sem Setter + final

    private final HttpStatus status;
    private final String codigo;

    // Constructor
    protected ErroAplicacao(HttpStatus status, String codigo, String mensagem){
        // Passando para o constructor que a classe Pai (RuntimeException) a mensagem

        super(mensagem);
        this.status = status;
        this.codigo = codigo;
    }
}
