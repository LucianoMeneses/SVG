package br.com.luciano.sgv.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.entities.Pedido;

public class ClienteDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;
	
	private String email;
	
	private String telefone;
	
	private String cidade;
	
	private String bairro;
	
	private String rua;
	
	private String numero;
	
	private String complemento;
	
	private LocalDate dataCadastro;
	
	private List<Pedido> pedidos = new ArrayList<>(); 
	
	public ClienteDto() {
	
	}

	public ClienteDto(Long id, String nome, String email, String cidade, String complemento, String bairro, String rua,String numero, String telefone,
			LocalDate dataCadastro, List<Pedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.dataCadastro = dataCadastro;
		this.pedidos = pedidos;
		this.complemento = complemento;
	}
	
	public ClienteDto (Cliente entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
		telefone = entity.getTelefone();
		cidade = entity.getCidade();
		bairro = entity.getBairro();
		rua = entity.getRua();
		numero = entity.getNumero();
		dataCadastro = entity.getDataCadastro();
		pedidos = entity.getPedidos();
		complemento = entity.getComplemento();
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}