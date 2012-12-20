package camadaNegocio ;

import java.util.GregorianCalendar ; 
//import java.util.Objects;

public class Leilao extends ModoVenda {

    // v. i.
    private double precoBase;
    private GregorianCalendar dataFim;
    private int nLicitacoes;
    
    // construtores
    public Leilao (int id, double precoB, GregorianCalendar dataF, int nLicit) {
        super(id) ;
        this.precoBase = precoB ;
        this.dataFim = dataF ;
        this.nLicitacoes = nLicit ;
    }
    
    // get and set
    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    public GregorianCalendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(GregorianCalendar dataFim) {
        this.dataFim = dataFim;
    }

    public int getnLicitacoes() {
        return nLicitacoes;
    }

    public void setnLicitacoes(int nLicitacoes) {
        this.nLicitacoes = nLicitacoes;
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
        final Leilao other = (Leilao) obj;
        if (!super.equals(other)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Leilao{" + "precoBase=" + this.precoBase + ", dataFim=" + this.dataFim.toString() 
         + ", nLicitacoes=" + this.nLicitacoes + super.toString() + '}';
    }
    
    @Override
    public Leilao clone () {
        return new Leilao(this.getId(), this.precoBase, this.dataFim, this.nLicitacoes) ;
    }
    
}