package br.com.luciano.sgv.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "usu_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_id")
	private Long id;
	
	@NotNull @NotEmpty @Length(max = 100)
	@Column(name = "usu_nome")
	private String nome;
	
	@Column(name = "usu_dat_cadastro")
	private LocalDate dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "usu_perfil")
	private EnumPerfilUsuario perfil;
	
	@OneToMany(mappedBy = "usuario") 
	@Column(name = "usu_pedido")
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Usuario () {
		
	}

	public Usuario(Long id, String nome, LocalDate dataCadastro, EnumPerfilUsuario perfil, List<Pedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.perfil = perfil;
		this.pedidos = pedidos;
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

}
