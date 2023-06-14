
package br.com.dl.dl_delivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dl.dl_delivery.dominio.entidades.cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    Optional<Cliente> findByEmail(String email);
}