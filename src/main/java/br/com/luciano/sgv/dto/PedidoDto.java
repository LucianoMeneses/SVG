package br.com.luciano.sgv.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.enumerators.*;
import br.com.luciano.sgv.entities.ItemPedido;
import br.com.luciano.sgv.entities.Pedido;
import br.com.luciano.sgv.entities.Usuario;

public class PedidoDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Cliente cliente;
	
	private List<ItemPedido> itensPedido= new ArrayList<>();
	
	private Usuario usuario;

	private Double valorTotal;

	private LocalDate dataVenda = LocalDate.now();
	
	private EnumFormaPagamento formaPagamento;
	
	private EnumStatusVenda statusVenda;
	
	public PedidoDto () {
		
	}

	public PedidoDto(Long id, Cliente cliente, List<ItemPedido> itensPedido, Usuario usuario, Double valorTotal,
			LocalDate dataVenda, EnumFormaPagamento formaPagamento, EnumStatusVenda statusVenda) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.itensPedido = itensPedido;
		this.usuario = usuario;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
		this.formaPagamento = formaPagamento;
		this.statusVenda = statusVenda;
	}

	public PedidoDto(Pedido entity) {
		id = entity.getId();
		cliente = entity.getCliente();
		itensPedido = entity.getItensPedido();
		usuario = entity.getUsuario();
		valorTotal = entity.getTotal();
		dataVenda = entity.getDataVenda();
		formaPagamento = entity.getFormaPagamento();
		statusVenda = entity.getStatusVenda();
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

	public EnumFormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(EnumFormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public EnumStatusVenda getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(EnumStatusVenda statusVenda) {
		this.statusVenda = statusVenda;
	}
}