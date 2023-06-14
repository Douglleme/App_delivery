package br.com.dl.dl_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dl.dl_delivery.dominio.entidades.pedido.ItemPedido;
import br.com.dl.dl_delivery.dominio.entidades.pedido.enums.ItemPedidoPK;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{
    
}