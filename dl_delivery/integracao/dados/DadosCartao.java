package br.com.dl.dl_delivery.integracao.dados;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

public class DadosCartao {

    @Getter @Setter
    @Pattern(regexp = "\\d{16}", message = "Número cartão inválido")
    private String numeroCartao;
}