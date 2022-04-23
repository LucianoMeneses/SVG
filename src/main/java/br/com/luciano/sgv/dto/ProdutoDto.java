package br.com.luciano.sgv.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.luciano.sgv.entities.EnumTamanho;
import br.com.luciano.sgv.entities.Produto;

public class ProdutoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;

	private String descricao;

	private Double preco;

	private LocalDate dataCadastro;

	private EnumTamanho tamanho;

	public ProdutoDto() {

	}

	public ProdutoDto(Long id, String nome, String descricao, Double preco, LocalDate dataCadastro,
			EnumTamanho tamanho) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.dataCadastro = dataCadastro;
		this.tamanho = tamanho;
	}

	public ProdutoDto(Produto entity) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		preco = entity.getPreco();
		dataCadastro = entity.getDataCadastro();
		tamanho = entity.getTamanho();
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