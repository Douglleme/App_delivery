package br.com.dl.dl_delivery.dominio.entidades.pedido.enums;

import br.com.dl.dl_delivery.dominio.entidades.pedido.Pedido;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Embeddable
public class ItemPedidoPK {
    
    @ManyToOne
    private Pedido pedido;

    private Integer ordem;
}