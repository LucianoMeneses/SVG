package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luciano.sgv.dto.ItemPedidoDto;
import br.com.luciano.sgv.entities.ItemPedido;
import br.com.luciano.sgv.repositories.ItemPedidoRepository;

@Service
public class ItemPedidoService {

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public List<ItemPedidoDto> findAll(){
		
		List<ItemPedido> itensPedido = itemPedidoRepository.findAll();
		
		return itensPedido.stream().map(x -> new ItemPedidoDto(x)).collect(Collectors.toList());
		
	}
}
