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

import br.com.luciano.sgv.dto.ClienteDto;
import br.com.luciano.sgv.form.ClienteForm;
import br.com.luciano.sgv.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDto>> buscarTodos(){
		
		List<ClienteDto> clientes = clienteService.buscarTodos();
		
		return ResponseEntity.ok(clientes);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ClienteDto>> buscarPorId(@PathVariable Long id){
		
		List<ClienteDto> clientes = clienteService.buscarPorId(id);
		
		return ResponseEntity.ok(clientes);
	}
	
	@PostMapping
	public ResponseEntity<List<ClienteDto>> cadastrar(@RequestBody ClienteForm clienteForm){
		
		List<ClienteDto> cliente = clienteService.cadastrar(clienteForm);
		
		return ResponseEntity.ok(cliente);		
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deletar(@PathVariable Long id){
		
		try {
			
			clienteService.deletar(id);
			
		} catch (EmptyResultDataAccessException e) {
			
		return new ResponseEntity<String>("Usuário não existe", HttpStatus.BAD_REQUEST);
		
		}
		
		return new ResponseEntity<String>("Usuário deletado", HttpStatus.NO_CONTENT);
	}
}