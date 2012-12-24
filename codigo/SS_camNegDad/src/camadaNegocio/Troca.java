package camadaNegocio;

import java.util.GregorianCalendar;

public class Troca extends Transaccao {   
    
    public static final char EU_AGUARDAR_RECEPCAO_PAGAMENTO = 9 ;
    public static final char OUTRO_AGUARDAR_RECEPCAO_PAGAMENTO = 10 ;    
    
    // v.i.
    private Anuncio anuncioComp ;
    
    // construtor
    public Troca(Anuncio anuncioComp, Anuncio anuncio, UtilizadorRegistado vendedor, UtilizadorRegistado comprador, Avaliacao avaliacao, int id, GregorianCalendar data, double valor, String modoPagamento, String morada, char estado, int quantidade) {
        super(anuncio, vendedor, comprador, avaliacao, id, data, valor, modoPagamento, morada, estado, quantidade) ;
        this.anuncioComp = anuncioComp;
    }  
    
    // m. i.
    public Anuncio getAnuncioComp() {return anuncioComp;}
    public void setAnuncioComp(Anuncio anuncioComp) {this.anuncioComp = anuncioComp;}
    
    // e, c, tS
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Troca other = (Troca) obj;
        if (!super.equals(other)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Troca{" + "anuncioComp=" + anuncioComp + super.toString() + '}';
    }
    
    @Override
    public Troca clone () {
        
        return new Troca(this.getAnuncio().clone(), this.getVendedor().clone(), this.getComprador.clone(), this.getAvaliacao().clone(), this.getId(), this.getData(), this.getValor(), this.getModoPagamento(), this.getMorada(), this.getEstado(), this.getQuantidade(), this.anuncioComp.clone()) ;
    }
}
