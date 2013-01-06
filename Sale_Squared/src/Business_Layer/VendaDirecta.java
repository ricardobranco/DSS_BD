package Business_Layer;

public class VendaDirecta extends ModoVenda {

	// v. i.
	private int nPropostas;
        private double preco ;

	// construtores
	public VendaDirecta(int id, int nPropostas, double preco) {

		super(id);
		this.nPropostas = nPropostas;
                this.preco = preco ;
	}

	// get and set
	public int getnPropostas() {
		return nPropostas;
	}

	public void setnPropostas(int nPropostas) {
		this.nPropostas = nPropostas;
	}

        public double getPreco() {
            return this.preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
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
		final VendaDirecta other = (VendaDirecta) obj;
		if (!super.equals(other))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VendaDirecta{" + "nPropostas=" + this.nPropostas + "preco=" + this.preco 
				+ super.toString() + '}';
	}

	@Override
	public VendaDirecta clone() {
		return new VendaDirecta(this.getId(), this.nPropostas, this.preco);
	}
}