package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.luciano.sgv.dto.ClienteDto;
import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.form.ClienteForm;
import br.com.luciano.sgv.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<ClienteDto> buscarTodos() {

		List<Cliente> clientes = clienteRepository.findAll();

		return clientes.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
	}

	public List<ClienteDto> buscarPorId(Long id) {

		List<Cliente> clientes = clienteRepository.findByIdDto(id);

		return clientes.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
	}

	public List<ClienteDto> cadastrar(ClienteForm clienteForm) {

		Cliente cliente = new Cliente(clienteForm);

		clienteRepository.save(cliente);

		List<Cliente> novoCliente = clienteRepository.findByIdDto(cliente.getId());

		return novoCliente.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());

	}

	public void deletar(Long id) {

		clienteRepository.deleteById(id);

	}

	public void deletar(ClienteForm clienteForm) {
		
		System.out.println(clienteForm.getNome());

		clienteRepository.deleteById(clienteForm.getId());

	}

}
