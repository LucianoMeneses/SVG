package br.com.luciano.sgv.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.luciano.sgv.form.ProdutoForm;

@Entity
@Table(name = "pro_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_id")
	private Long id;
	
	@NotNull @NotEmpty @Length(max = 100)
	@Column(name = "pro_nome")
	private String nome;
	
	@Length(max = 150)
	@Column(name = "pro_descricao")
	private String descricao;
	
	@NotNull
	@Column(name = "pro_preco")
	private Double preco;
	
	@Column(name = "pro_dat_cadastro")
	private LocalDate dataCadastro = LocalDate.now();
	
	@Enumerated(EnumType.STRING)
	@Column(name = "pro_tamanho")
	private EnumTamanho tamanho;
	
	public Produto() {
		
	}

	public Produto(Long id, String nome, String descricao, Double preco, LocalDate dataCadastro, EnumTamanho tamanho) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.dataCadastro = dataCadastro;
		this.tamanho = tamanho;
	}
	
	public Produto(ProdutoForm produtoForm) {
		nome = produtoForm.getNome();
		descricao = produtoForm.getDescricao();
		preco = produtoForm.getPreco();
		tamanho = produtoForm.getTamanho();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnumTamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(EnumTamanho tamanho) {
		this.tamanho = tamanho;
	}
}