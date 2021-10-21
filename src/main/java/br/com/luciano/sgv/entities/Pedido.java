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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ped_pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ped_id")
	private Long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cli_id")
	private Cliente cliente;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "usu_id")
	private Usuario usuario;
	
	@Column(name = "ped_valor_total")
	private Double valorTotal;
	
	@Column(name = "ped_dat_venda")
	private LocalDate dataVenda = LocalDate.now();
	
	@Column(name = "ped_forma_pagamento")
	@Enumerated(EnumType.STRING)
	private EnumFormaPagameto formaPagamento = EnumFormaPagameto.CARTAO_CREDITO;
	
	@Column(name = "ped_status_venda")
	@Enumerated(EnumType.STRING)
	private EnumStatusVenda statusVenda = EnumStatusVenda.PENDENTE;
	
	@OneToMany(mappedBy = "pedido")
	@Column(name = "ipt_itens")
	private List<ItemPedido> itensPedido= new ArrayList<>();
	
	public Pedido () {
		
	}

	public Pedido(Long id, Cliente cliente, Usuario usuario, Double valorTotal, LocalDate dataVenda, EnumStatusVenda statusVenda) {
		this.id = id;
		this.cliente = cliente;
		this.usuario = usuario;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
		this.statusVenda = statusVenda;
	}
	
	public Double getTotal() {
		
		Double soma = 0.0;
		
		for(ItemPedido item : itensPedido) {
			
			soma +=  item.getSubTotal();
		}
		
		return soma;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public EnumFormaPagameto getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(EnumFormaPagameto formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public EnumStatusVenda getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(EnumStatusVenda statusVenda) {
		this.statusVenda = statusVenda;
	}
}
