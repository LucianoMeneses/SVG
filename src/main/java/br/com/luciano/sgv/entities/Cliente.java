package br.com.luciano.sgv.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.luciano.sgv.form.ClienteForm;

@Entity
@Table(name = "cli_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long id;
	
	@NotNull @NotEmpty @Length(max = 50)
	@Column(name = "cli_nome")
	private String nome;
	
	@Length(max = 50)
	@Column(name = "cli_email")
	private String email;
	
	@NotNull @NotEmpty @Length(max = 12)
	@Column(name = "cli_telefone")
	private String telefone;
	
	@NotNull @NotEmpty @Length(max = 30)
	@Column(name = "cli_cidade")
	private String cidade;
	
	@NotNull @NotEmpty @Length(max = 30)
	@Column(name = "cli_bairro")
	private String bairro;
	
	@NotNull @NotEmpty @Length(max = 40)
	@Column(name = "cli_rua")
	private String rua;
	
	@NotNull @NotEmpty @Length(max = 10)
	@Column(name = "cli_numero")
	private String numero;
	
	@Length(max = 50)
	@Column(name = "cli_complemento")
	private String complemento;
	
	@Column(name = "cli_dat_cadastro")
	private LocalDate dataCadastro = LocalDate.now();
	
	@OneToMany(mappedBy = "cliente") 
	@Column(name = "cli_pedidos")
	private List<Pedido> pedidos = new ArrayList<>(); 
	
	public Cliente () {
		
	}
	
	public Cliente(Long id, String nome, String cidade, String bairro, String rua, String numero, String complemento, String email,  String telefone, LocalDate dataCadastro, List<Pedido> pedidos) {
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.email = email;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.pedidos = pedidos;
		this.complemento = complemento;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}
	
	public Cliente (ClienteForm clienteForm) {
		id = clienteForm.getId();
		nome = clienteForm.getNome().trim();
		cidade = clienteForm.getCidade().trim();
		email = clienteForm.getEmail().trim();
		telefone = clienteForm.getTelefone().trim();
		pedidos = clienteForm.getPedidos();
		rua = clienteForm.getRua().trim();
		bairro = clienteForm.getBairro().trim();
		numero = clienteForm.getNumero().trim();
		complemento = clienteForm.getComplemento().trim();
		
	}
	
	public void setCliente (ClienteForm clienteForm) {
		
		nome = clienteForm.getNome().trim();
		cidade = clienteForm.getCidade().trim();
		email = clienteForm.getEmail().trim();
		telefone = clienteForm.getTelefone().trim();
		pedidos = clienteForm.getPedidos();
		rua = clienteForm.getRua().trim();
		bairro = clienteForm.getBairro().trim();
		numero = clienteForm.getNumero().trim();
		complemento = clienteForm.getComplemento().trim();
		
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
	
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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