package br.com.dl.dl_delivery.dominio.dto.clientedto;

import lombok.Data;

@Data
public class ClienteLoginDTO {

    private String email;
    private String senha;

}