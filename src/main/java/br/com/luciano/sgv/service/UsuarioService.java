package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.luciano.sgv.dto.UsuarioDto;
import br.com.luciano.sgv.entities.Usuario;
import br.com.luciano.sgv.form.UsuarioForm;
import br.com.luciano.sgv.repositories.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDto> buscarTodos(){
		
		List<Usuario> usuarios =  usuarioRepository.findAll();
		
		return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());	
	}
	
	public List<UsuarioDto> buscarPorId(Long id){
		
		List<Usuario> usuarios = usuarioRepository.findByIdDto(id);
		
		return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
	}

	public List<UsuarioDto> cadastrar(UsuarioForm usuarioForm) {
		
		Usuario usuario = new Usuario(usuarioForm);

		usuarioRepository.save(usuario);

		List<Usuario> novoUsuario = usuarioRepository.findByIdDto(usuario.getId());

		return novoUsuario.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
	}

	public void deletar(Long id){
		
		usuarioRepository.deleteById(id);
			
	}
}