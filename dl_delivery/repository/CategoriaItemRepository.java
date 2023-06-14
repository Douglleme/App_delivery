
package br.com.dl.dl_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dl.dl_delivery.dominio.entidades.restaurante.CategoriaItem;

public interface CategoriaItemRepository extends JpaRepository<CategoriaItem, Long> {
    
}