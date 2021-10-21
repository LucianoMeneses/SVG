package br.com.luciano.sgv.dto;

import java.io.Serializable;

import br.com.luciano.sgv.entities.ItemPedido;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.entities.Produto;

public class ItemPedidoDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private Double precoUnitario;

	private int quantidade;

	private Pedido pedido;

	private Produto produto;
		
	public ItemPedidoDto() {
		
	}

	public ItemPedidoDto(Long id, Double precoUnitario, int quantidade, Pedido pedido, Produto produto) {
		this.id = id;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produto = produto;
	}
	
	public ItemPedidoDto(ItemPedido entity) {
		id = entity.getId();
		precoUnitario = entity.getPrecoUnitario();
		quantidade = entity.getQuantidade();
		pedido = entity.getPedido();
		produto = entity.getProduto();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
