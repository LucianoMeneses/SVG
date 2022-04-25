package br.com.luciano.sgv.enumerators;

public enum EnumPerfilUsuario {

	ADMINISTRADOR("Administrador"), 
	VENDEDOR("Vendedor");
	
	private String descricao;
	
	private EnumPerfilUsuario(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
