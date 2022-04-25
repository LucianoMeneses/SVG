package br.com.luciano.sgv.enumerators;

public enum EnumStatusVenda {
	
	FINALIZADO("Finalizado"), 
	PENDENTE("Pendente"), 
	CANCELADO("Cancelado"), 
	ENVIADO("Enviado");
	
	private String descricao;
	
	EnumStatusVenda(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}

