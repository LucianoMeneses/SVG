package br.com.luciano.sgv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.luciano.sgv.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("SELECT u FROM Usuario u WHERE u.id = :id")
	List<Usuario> findByIdDto(@Param("id") Long id);
}
