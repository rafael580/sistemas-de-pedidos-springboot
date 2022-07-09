package com.br.nelioalves.loja.service.exception;

public class ResourceNotfoundException extends RuntimeException {
    private static final Long serialVersionUID =1L;
    public ResourceNotfoundException(String msg){
        super(msg);
    }
}
