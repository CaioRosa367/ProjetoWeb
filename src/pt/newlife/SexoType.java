package pt.newlife;

public enum SexoType {
	M("Masculino"), F("Feminino");
	
	//Atributos
	private String descricao;
	
	//Acessores
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Construtor
	private SexoType(String descricao){
		this.descricao = descricao;
	}

	
	
}
