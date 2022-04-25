package br.com.luciano.sgv.form;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import br.com.luciano.sgv.entities.Cliente;
import br.com.luciano.sgv.enumerators.*;
import br.com.luciano.sgv.entities.ItemPedido;
import br.com.luciano.sgv.entities.Usuario;

public class PedidoForm {
	
	private Cliente cliente;
	
	private Usuario usuario;

	private Double valorTotal;

	private EnumFormaPagamento formaPagamento;
	
	@Column(name = "ped_status_venda")
	@Enumerated(EnumType.STRING)
	private EnumStatusVenda statusVenda = EnumStatusVenda.PENDENTE;

	private List<ItemPedido> itensPedido= new ArrayList<>();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}
}