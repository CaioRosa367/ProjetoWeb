package pt.newlife;

public class Doutor {
	//Atributos
	private String codDoutor;
	private int id;
	private String nome;
	private int idade;
	private int numeroCartaoCidadao;
	
	private Adress endereco;
	private Contato contato;
	
	//Acessores
	public String getCodDoutor() {
		return codDoutor;
	}

	public void setCodDoutor(String codDoutor) {
		this.codDoutor = codDoutor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	}

	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	}

	public Adress getEndereco() {
		return endereco;
	}

	public void setEndereco(Adress endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	//Construtor
	public Doutor(){
		super();
	}
	public Doutor(String codDoutor, int id, String nome, int idade, int numeroCartaoCidadao, Adress endereco,
			Contato contato) {
		super();
		this.codDoutor = codDoutor;
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.numeroCartaoCidadao = numeroCartaoCidadao;
		this.endereco = endereco;
		this.contato = contato;
	}
	public Doutor(Doutor doutor) {
		super();
		this.codDoutor = doutor.codDoutor;
		this.id = doutor.id;
		this.nome = doutor.nome;
		this.idade = doutor.idade;
		this.numeroCartaoCidadao = doutor.numeroCartaoCidadao;
		this.endereco = doutor.endereco;
		this.contato = doutor.contato;
	}

	
}
