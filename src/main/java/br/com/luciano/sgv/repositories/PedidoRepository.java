package br.com.luciano.sgv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.luciano.sgv.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	@Query("SELECT p FROM Pedido p WHERE p.id = :id")
	List<Pedido> findByIdDto(@Param("id") Long id);
}
