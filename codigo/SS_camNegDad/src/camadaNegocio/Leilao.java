package camadaNegocio ;

import java.util.GregorianCalendar ; 
//import java.util.Objects;

public class Leilao extends ModoVenda {

    // v. i.
    private double precoBase;
    private GregorianCalendar dataFim;
    private int nLicitacoes;
    private double precoActual ;
    
    // construtores
    public Leilao (double precoB, GregorianCalendar dataF, int nLicit, double precoActual) {
        this.precoBase = precoB ;
        this.dataFim = dataF ;
        this.nLicitacoes = nLicit ;
        this.precoActual = precoActual ;
    }
    
    // get and set
    public double getPrecoActual() {return precoActual;}
    public void setPrecoActual(double precoActual) {this.precoActual = precoActual;} 
    public Double getPrecoBase() {return precoBase;}
    public void setPrecoBase(Double precoBase) {this.precoBase = precoBase;}
    public GregorianCalendar getDataFim() {return dataFim;}
    public void setDataFim(GregorianCalendar dataFim) {this.dataFim = dataFim;}
    public int getnLicitacoes() {return nLicitacoes;}
    public void setnLicitacoes(int nLicitacoes) {this.nLicitacoes = nLicitacoes;}
    
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
        if(!super.equals(obj))
            return false ;
        /* if(this.precoActual != other.getPrecoActual())
            return false ;
        if(this.precoBase != other.getPrecoBase())
            return false ;
        if(this.nLicitacoes != other.getnLicitacoes())
            return false ;
        if(!this.dataFim.equals(other.getDataFim()))
            return false ; */
        return true;
    }

    @Override
    public String toString() {
        return "Leilao{" + "precoBase=" + this.precoBase + ", dataFim=" + this.dataFim.toString() 
         + ", nLicitacoes=" + this.nLicitacoes + "precoActual=" + this.precoActual + super.toString() + '}';
    }
    
    @Override
    public Leilao clone () {
        return new Leilao(this.precoBase, this.dataFim, this.nLicitacoes, this.precoActual) ;
    }
    
    // outros métodos
    public long calculaTempoRestante () {
        
        GregorianCalendar agora = new GregorianCalendar();
        return this.dataFim.getTimeInMillis() - agora.getTimeInMillis() ;
    }
}