9 lines (5 sloc)  250 Bytes
 

package br.com.dl.dl_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dl.dl_delivery.dominio.entidades.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}