package Business_Layer;

//import java.util.Objects;

public class Categoria {

	// v. i.
	private String nome;
	private Categoria categoriaPai;

	// construtores
	public Categoria(String nome, Categoria catPai) {
		this.nome = nome;
		this.categoriaPai = catPai;
	}

	public Categoria(String nome) {
		this.nome = nome;
	}

	// get and set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
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
		final Categoria other = (Categoria) obj;
		if (!this.nome.equals(other.getNome())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Categoria{"
				+ "nome="
				+ this.nome
				+ (this.categoriaPai != null ? this.categoriaPai.toString()
						: "") + '}';
	}

	@Override
	public Categoria clone() {
		return new Categoria(this.nome, (this.categoriaPai == null ? null
				: this.categoriaPai.clone()));
	}
        
        // 
        public boolean eCategoriaFilho (String categoriaPai) {
            
            boolean res = false ;
            Categoria c = this.categoriaPai ;
            if(c == null)
                return false ;            
            while(c != null && !res) {
                if(c.getNome().equals(categoriaPai))
                    res = true ;
                else
                    c = c.getCategoriaPai() ;                
            }
            return res ;
        }
}