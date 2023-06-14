package br.com.dl.dl_delivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dl.dl_delivery.dominio.entidades.restaurante.Restaurante;
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{

    Optional<Restaurante> findByEmail(String email);
    
}