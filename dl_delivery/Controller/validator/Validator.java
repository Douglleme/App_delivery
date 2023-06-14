package br.com.dl.dl_delivery.controller.validator;

public interface Validator<T> {
    
    boolean validator(T t);
}