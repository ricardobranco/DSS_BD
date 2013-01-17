package Business_Layer;

//import java.util.Objects;

public class Tag {

	// v. i.
	private String nome;

	// construtores
	public Tag(String nome) {
		this.nome = nome;
	}

	// get and set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// e, c, tS
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Tag other = (Tag) obj;
		if (!this.nome.equals(other.getNome())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tag{" + "nome=" + this.nome + '}';
	}

	@Override
	public Tag clone() {
		return new Tag(this.nome);
	}
}