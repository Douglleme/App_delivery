package br.com.dl.dl_delivery.dominio.dto.restaurantedto;

import java.util.Set;

import br.com.dl.dl_delivery.dominio.entidades.restaurante.RestauranteCategoria;
import lombok.Data;

@Data
public class RestauranteSalvoDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;
    private String logotipo;
    private Integer tempoEntrega;
    private Set<RestauranteCategoria> categorias;
    
}