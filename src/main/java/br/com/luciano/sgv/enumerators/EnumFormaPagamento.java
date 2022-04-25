package br.com.luciano.sgv.enumerators;

public enum EnumFormaPagamento {
	
	DINHEIRO("Dinheiro"), 
	PIX("Pix"),
	CARTAO_CREDITO("Cartão de crédito"),
	CARTAO_DEBITO("Cartão de débito"),
	LINK("Link de pagamento");
	
	private String descricao;

	EnumFormaPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
