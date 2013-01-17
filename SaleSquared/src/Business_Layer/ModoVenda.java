package Business_Layer;

public abstract class ModoVenda {

	// v. c.
	// public static final char LEILAO = 0 ;
	// public static final char VENDA_DIRECTA = 1 ;

	// v. i.
	private int id;

	public ModoVenda(int id) {
		this.id = id;
	}

	// get e set
	public int getId() {
		return this.id;
	}

	public void setId(int idArg) {
		this.id = idArg;
	}
        
        // outros
        public abstract double getPreco() ;

	// e, tS
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ModoVenda other = (ModoVenda) obj;
		if (this.id != other.getId()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ModoVenda{" + "id=" + this.id + '}';
	}
}
