package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.luciano.sgv.dto.ClienteDto;
import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<ClienteDto> findAll(){
		
		List<Cliente> clientes = clienteRepository.findAll();
		
		return clientes.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
		
	}
	
	public List<ClienteDto> findById(Long id){
		
		List<Cliente> clientes = clienteRepository.findByIdDto(id);
		
		return clientes.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
		
	}
	
}
