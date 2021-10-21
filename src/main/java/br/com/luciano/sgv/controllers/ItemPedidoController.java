package br.com.luciano.sgv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciano.sgv.dto.ItemPedidoDto;
import br.com.luciano.sgv.service.ItemPedidoService;

@RestController
@RequestMapping(value = "/itenspedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService itemPedidoService;
	
	@GetMapping
	public ResponseEntity<List<ItemPedidoDto>> findAll(){
		
		List<ItemPedidoDto> itensPedido = itemPedidoService.findAll();
		
		return ResponseEntity.ok(itensPedido);
		
	}

}
