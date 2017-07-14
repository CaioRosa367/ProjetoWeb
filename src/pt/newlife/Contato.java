package pt.newlife;

public class Contato {
	//Atributos
	private String email;
	private String telefone;
	private String telemovel;
	
	//Acessores
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelemovel() {
		return telemovel;
	}

	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}
	
	//Construtor
		public Contato() {
			super();
		}
		public Contato(String email, String telefone, String telemovel) {
			super();
			this.email = email;
			this.telefone = telefone;
			this.telemovel = telemovel;
		}
		public Contato(Contato contato) {
			super();
			this.email = contato.email;
			this.telefone = contato.telefone;
			this.telemovel = contato.telemovel;
		}

		//ToString
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			//o metodo append retorna um instancia do proprio buffer, por isso essa chamada em cascata
			builder.append("Contato [ email=")
			.append(email)
			.append(", telefone= ")
			.append(telefone)
			.append(", telemovel= ")
			.append(telemovel)
			.append(" ]");
			return builder.toString();
		}
		
		//conceitos novos de reescrita "HASHCODE" e "EQUALS", metodos para teste de conteudo da instancia
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
			result = prime * result + ((telemovel == null) ? 0 : telemovel.hashCode());
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
			Contato other = (Contato) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (telefone == null) {
				if (other.telefone != null)
					return false;
			} else if (!telefone.equals(other.telefone))
				return false;
			if (telemovel == null) {
				if (other.telemovel != null)
					return false;
			} else if (!telemovel.equals(other.telemovel))
				return false;
			return true;
		}
		
}