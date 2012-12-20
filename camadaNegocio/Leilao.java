package camadaNegocio ;

import java.util.GregorianCalendar ; 
//import java.util.Objects;

public class Leilao extends ModoVenda {

    // v. i.
    private double precoBase;
    private GregorianCalendar dataFim;
    private int nLicitacoes;
    
    // construtores
    public Leilao (double precoB, GregorianCalendar dataF, int nLicit) {
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
        if (Double.doubleToLongBits(this.precoBase) != Double.doubleToLongBits(other.getPrecoBase())) {
            return false;
        }
        if (!this.dataFim.equals(other.getDataFim())) {
            return false;
        }
        if (this.nLicitacoes != other.getnLicitacoes()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Leilao{" + "precoBase=" + this.precoBase + ", dataFim=" + this.dataFim.toString() + ", nLicitacoes=" + this.nLicitacoes + '}';
    }
    
    @Override
    public Leilao clone () {
        return new Leilao(this.precoBase, this.dataFim, this.nLicitacoes) ;
    }
    
}