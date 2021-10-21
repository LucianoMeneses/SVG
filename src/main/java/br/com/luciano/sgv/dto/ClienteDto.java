package br.com.luciano.sgv.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.entities.Usuario;

public class ClienteDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;
	
	private String endereco;
	
	private String cidade;
	
	private String cep;

	private String telefone;
	
	private LocalDate dataCadastro;

	private Usuario usuario;
	
	private List<Pedido> pedidos = new ArrayList<>(); 
	
	public ClienteDto() {
	
	}

	public ClienteDto(Long id, String nome, String endereco, String cidade, String cep, String telefone,
			LocalDate dataCadastro, Usuario usuario, List<Pedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.usuario = usuario;
		this.pedidos = pedidos;
	}
	
	public ClienteDto (Cliente entity) {
		id = entity.getId();
		nome = entity.getNome();
		endereco = entity.getEndereco();
		cidade = entity.getCidade();
		cep = entity.getCep();
		telefone = entity.getTelefone();
		dataCadastro = entity.getDataCadastro();
		usuario = entity.getUsuario();
		pedidos = entity.getPedidos();	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
