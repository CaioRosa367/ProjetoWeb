package pt.newlife;

public class Cliente {
	//Atributos
	private long id;
	private String nome;
	private int idade;
	private int numeroCartaoCidadao;
	private Contato contato = new Contato(); // classe com os dados de contato
	private SexoType sexo; //é uma classe ENUM
	private Adress endereco = new Adress(); //aponta para a classe que contem os dados de endereço do cliente
	
	//Acessores
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCC() {
		return numeroCartaoCidadao;
	}
	public void setCC(int cC) {
		numeroCartaoCidadao = cC;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	public Adress getEndereco() {
		return endereco;
	}
	public void setEndereco(Adress endereco) {
		this.endereco = endereco;
	}
	
	
	//Construtor
	public Cliente (){
		super();
	}
	public Cliente(long id, String nome, int idade, int numeroCartaoCidadao, Contato contato, SexoType sexo, Adress endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.numeroCartaoCidadao = numeroCartaoCidadao;
		this.contato = contato;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	public Cliente(long id, String nome, int idade, int numeroCartaoCidadao) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	}
	public Cliente (Cliente cliente){
		super();
		this.id = cliente.id;
		this.nome = cliente.nome;
		this.idade = cliente.idade;
		this.numeroCartaoCidadao = cliente.numeroCartaoCidadao;
		this.contato = cliente.contato;
		this.sexo = cliente.sexo;
		this.endereco = cliente.endereco;
	}
	//HashCode and EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroCartaoCidadao;
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCartaoCidadao != other.numeroCartaoCidadao)
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	//ToString com builder
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=").append(id).append(", nome=").append(nome).append(", idade=").append(idade)
				.append(", numeroCartaoCidadao=").append(numeroCartaoCidadao).append(", contato=").append(contato)
				.append(", sexo=").append(sexo).append(", endereco=").append(endereco).append("]");
		return builder.toString();
	}
}
