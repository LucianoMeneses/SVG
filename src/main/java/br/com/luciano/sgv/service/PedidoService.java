package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luciano.sgv.dto.PedidoDto;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.form.PedidoForm;
import br.com.luciano.sgv.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<PedidoDto> buscarTodos() {

		List<Pedido> pedidos = pedidoRepository.findAll();

		return pedidos.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
	}

	public List<PedidoDto> buscarPorId(Long id) {

		List<Pedido> pedidos = pedidoRepository.findByIdDto(id);

		return pedidos.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
	}
	
	public List<PedidoDto> cadastrar(PedidoForm pedidoform){
		
		Pedido pedido = new Pedido(pedidoform);
				
		pedidoRepository.save(pedido);
		
		List<Pedido> novoPedido = pedidoRepository.findByIdDto(pedido.getId());
		
		return novoPedido.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
		
	}
}
