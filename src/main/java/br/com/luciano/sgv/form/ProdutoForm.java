package br.com.luciano.sgv.form;

import br.com.luciano.sgv.entities.EnumTamanho;

public class ProdutoForm {
	
	private String nome;

	private String descricao;
	
	private Double preco;
	
	private EnumTamanho tamanho;

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

	public EnumTamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(EnumTamanho tamanho) {
		this.tamanho = tamanho;
	}
}