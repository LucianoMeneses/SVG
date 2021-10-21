package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.luciano.sgv.dto.PedidoDto;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<PedidoDto> findAll(){
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		
		return pedidos.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
		
	}
	
public List<PedidoDto> findById(Long id){
		
		List<Pedido> pedidos = pedidoRepository.findByIdDto(id);
		
		return pedidos.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
		
	}
}
