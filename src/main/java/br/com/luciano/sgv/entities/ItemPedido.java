package br.com.luciano.sgv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "itp_item_pedido")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itp_id")
	private Long id;
	
	@Column(name = "itp_preco_unitario")
	private Double precoUnitario;
	
	@Column(name = "itp_quantidade")
	private int quantidade;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ped_id")
	private Pedido pedido;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pro_id")
	private Produto produto;
	
	public ItemPedido () {
		
	}

	public ItemPedido(Long id, Double precoUnitario, int quantidade, Pedido pedido, Produto produto) {
		this.id = id;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produto = produto;
	}
	
	public Double getSubTotal() {
		
		return quantidade * precoUnitario;
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
