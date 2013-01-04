package Business_Layer;

public class Imagem {

	// v. i.
	private String nome;
	private String path;

	// construtor
	public Imagem(String nome, String path) {

		this.nome = nome;
		this.path = path;
	}

	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
		final Imagem other = (Imagem) obj;
		if (!this.nome.equals(other.getNome())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Imagem{" + "nome=" + this.nome + ", path=" + this.path + '}';
	}

	public Imagem clone() {
		return new Imagem(this.nome, this.path);
	}
}
