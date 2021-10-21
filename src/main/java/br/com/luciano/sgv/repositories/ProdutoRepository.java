package br.com.luciano.sgv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.luciano.sgv.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	@Query("SELECT p FROM Produto p WHERE p.id = :id")
	List<Produto> findByIdDto(@Param("id") Long id);

}
