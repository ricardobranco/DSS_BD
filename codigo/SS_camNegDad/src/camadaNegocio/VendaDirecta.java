package camadaNegocio ;

public class VendaDirecta extends ModoVenda {
    
    // v. i.
    private int nPropostas;

    // construtores
    public VendaDirecta(int nPropostas) {
        this.nPropostas = nPropostas;
    }   
    
    // get and set
    public int getnPropostas() {return nPropostas;}
    public void setnPropostas(int nPropostas) {this.nPropostas = nPropostas;}
    
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
        /* if (!super.equals(other)) {
            return false; */
        return true;
    }
    
    @Override
    public String toString() {
        return "VendaDirecta{" + "nPropostas=" + this.nPropostas + '}';
    }
    
    @Override
    public VendaDirecta clone () {
        return new VendaDirecta(this.nPropostas) ;
    }
}