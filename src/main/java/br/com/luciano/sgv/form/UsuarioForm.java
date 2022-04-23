package br.com.luciano.sgv.form;

import java.util.ArrayList;
import java.util.List;
import br.com.luciano.sgv.entities.EnumPerfilUsuario;
import br.com.luciano.sgv.entities.Pedido;

public class UsuarioForm {
	
	private String nome;
	
	private EnumPerfilUsuario perfil;

	private List<Pedido> pedidos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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