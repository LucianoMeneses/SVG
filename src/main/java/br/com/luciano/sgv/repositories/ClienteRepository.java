package br.com.luciano.sgv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.luciano.sgv.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	@Query("SELECT c FROM Cliente c Where c.id = :id")
	List<Cliente> findByIdDto(@Param("id") Long id);
}
