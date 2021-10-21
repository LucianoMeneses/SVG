package br.com.luciano.sgv.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "cli_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long id;
	
	@NotNull @NotEmpty @Length(max = 100)
	@Column(name = "cli_nome")
	private String nome;
	
	@NotNull @NotEmpty @Length(max = 150)
	@Column(name = "cli_endereco")
	private String endereco;
	
	@NotNull @NotEmpty @Length(max = 50)
	@Column(name = "cli_cidade")
	private String cidade;
	
	@Length(max = 10)
	@Column(name = "cli_cep")
	private String cep;
	
	@NotNull @NotEmpty @Length(max = 15)
	@Column(name = "cli_telefone")
	private String telefone;
	
	@Column(name = "cli_dat_cadastro")
	private LocalDate dataCadastro;
	
	@OneToOne
	@JoinColumn(name = "usu_id")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "cliente") 
	@Column(name = "cli_id")
	private List<Pedido> pedidos = new ArrayList<>(); 
	
	public Cliente () {
		
	}
	
	public Cliente(Long id,String nome, String endereco, String cidade, String cep,  String telefone, LocalDate dataCadastro, Usuario usuario, List<Pedido> pedidos) {
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
}
