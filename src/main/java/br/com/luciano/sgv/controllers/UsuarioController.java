package br.com.luciano.sgv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciano.sgv.dto.UsuarioDto;
import br.com.luciano.sgv.form.UsuarioForm;
import br.com.luciano.sgv.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDto>> buscarTodos(){
		
		List<UsuarioDto> usuarios = usuarioService.buscarTodos();
		
		return ResponseEntity.ok(usuarios);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<UsuarioDto>> buscarPorId(@PathVariable Long id){
		
		List<UsuarioDto> usuarios = usuarioService.buscarPorId(id);
		
		return ResponseEntity.ok(usuarios);
	}
	
	@PostMapping
	public ResponseEntity<List<UsuarioDto>> cadastrar(@RequestBody UsuarioForm usuarioForm){
		
		List<UsuarioDto> usuario = usuarioService.cadastrar(usuarioForm);
		
		return ResponseEntity.ok(usuario);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deletar(@PathVariable Long id){
		
		try {
			
			usuarioService.deletar(id);
			
		} catch (EmptyResultDataAccessException e) {
			
		return new ResponseEntity<String>("Usuário não existe", HttpStatus.BAD_REQUEST);
		
		}
		
		return new ResponseEntity<String>("Usuário deletado", HttpStatus.NO_CONTENT);
	}
}
