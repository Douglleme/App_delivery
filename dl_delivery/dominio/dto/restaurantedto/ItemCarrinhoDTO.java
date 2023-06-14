package br.com.dl.dl_delivery.dominio.dto.restaurantedto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ItemCarrinhoDTO {

    private Long clienteId;
    private Long id = 0L;
    private ItemCardapioDTO itemCardapio;
    private String observacoes;
    private BigDecimal preco;
    private int quantidade;

}