package br.com.luciano.sgv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciano.sgv.dto.ClienteDto;
import br.com.luciano.sgv.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDto>> findAll(){
		
		List<ClienteDto> clientes = clienteService.findAll();
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ClienteDto>> FindById(@PathVariable Long id){
		
		List<ClienteDto> clientes = clienteService.findById(id);
		
		return ResponseEntity.ok(clientes);
		
	}
}
