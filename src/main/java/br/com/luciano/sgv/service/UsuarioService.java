package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.luciano.sgv.dto.UsuarioDto;
import br.com.luciano.sgv.entities.Usuario;
import br.com.luciano.sgv.repositories.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDto> findAll(){
		
		List<Usuario> usuarios =  usuarioRepository.findAll();
		
		return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());	
	}
	
	public List<UsuarioDto> findById(Long id){
		
		List<Usuario> usuarios = usuarioRepository.findByIdDto(id);
		
		return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
	}
}
