package br.com.luciano.sgv.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.luciano.sgv.dto.PedidoDto;
import br.com.luciano.sgv.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<PedidoDto>> findAll(){
		
		List<PedidoDto> pedidos = pedidoService.findAll();
		
		return ResponseEntity.ok(pedidos);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<PedidoDto>> findById(@PathVariable Long id){
		
		List<PedidoDto> pedidos = pedidoService.findById(id);
		
		return ResponseEntity.ok(pedidos);
		
	}
	
}
