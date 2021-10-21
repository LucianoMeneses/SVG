package br.com.luciano.sgv.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.luciano.sgv.entities.EnumPerfilUsuario;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.entities.Usuario;

public class UsuarioDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;

	private LocalDate dataCadastro;

	private EnumPerfilUsuario perfil;

	private List<Pedido> pedidos = new ArrayList<>();
	
	public UsuarioDto() {
		
	}

	public UsuarioDto(Long id, String nome, LocalDate dataCadastro, EnumPerfilUsuario perfil, List<Pedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.perfil = perfil;
		this.pedidos = pedidos;
	}
	
	public UsuarioDto(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		dataCadastro = entity.getDataCadastro();
		perfil = entity.getPerfil();
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
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnumPerfilUsuario getPerfil() {
		return perfil;
	}

	public void setPerfil(EnumPerfilUsuario perfil) {
		this.perfil = perfil;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
