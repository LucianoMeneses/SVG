package br.com.luciano.sgv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciano.sgv.dto.UsuarioDto;
import br.com.luciano.sgv.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDto>> findAll(){
		
		List<UsuarioDto> usuarios = usuarioService.findAll();
		
		return ResponseEntity.ok(usuarios);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<UsuarioDto>> findAllById(@PathVariable Long id){
		
		List<UsuarioDto> usuarios = usuarioService.findById(id);
		
		return ResponseEntity.ok(usuarios);
	}
}
