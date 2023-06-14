package br.com.dl.dl_delivery.exception;

public class SenhaInvalidaException extends RuntimeException{
    
    public SenhaInvalidaException(String msg) {
        super(msg);
    }
}