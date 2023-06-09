package br.com.dl.dl_delivery.controller.validator.impl;

import org.springframework.stereotype.Component;

import br.com.dl.dl_delivery.controller.validator.Validator;
import br.com.dl.dl_delivery.dominio.dto.clientedto.ClienteDTO;

@Component
public class ConfirmaSenhaValidatorImpl implements Validator<ClienteDTO>{

    @Override
    public boolean validator(ClienteDTO cliente) {
        return !cliente.getSenha().equals(cliente.getConfirmaSenha());
    }
    
}