package pt.newlife;

public class Adress {
	//Atributos
	private String morada;
	private String cidade;
	private String destrito;
	private int codPostal;
	
	//Acessores
	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDestrito() {
		return destrito;
	}

	public void setDestrito(String destrito) {
		this.destrito = destrito;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	
	//Construtor
		public Adress() {
			super();
		}
		public Adress(String morada, String cidade, String destrito, int codPostal ) {
			super();
			this.morada = morada;
			this.cidade = cidade;
			this.destrito = destrito;
			this.codPostal = codPostal;
		}
		public Adress(Adress endereco) {
			super();
			this.morada = endereco.morada;
			this.cidade = endereco.cidade;
			this.destrito = endereco.destrito;
			this.codPostal = endereco.codPostal;
		}
}