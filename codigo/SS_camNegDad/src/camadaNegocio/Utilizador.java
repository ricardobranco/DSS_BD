package camadaNegocio ;

import java.util.Map;

public class Utilizador {

    // v. i.    
    private Map<Integer, Anuncio> historicoAnunc;
    
    // construtor - DAO
    public Utilizador() {
        
    }
    
    // get and set
    public Map<Integer, Anuncio> getHistoricoAnunc() {
        return historicoAnunc;
    }

    public void setHistoricoAnunc(Map<Integer, Anuncio> historicoAnunc) {
        this.historicoAnunc = historicoAnunc;
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
        final Utilizador other = (Utilizador) obj;
        if (!this.historicoAnunc.equals(other.getHistoricoAnunc())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "historicoAnunc=" + this.historicoAnunc.toString() + '}';
    }
    
/*      
    @Override
    public Utilizador clone () {
        return new Utilizador() ;
    }
    */
    
    // gestão maps
    public Anuncio inserirAnuncVisit(Anuncio a) {return this.historicoAnunc.put(a.getCodigo(), a.clone()) ;}
    public Anuncio removerAnuncVisit(int codAnunc) {return this.historicoAnunc.remove(codAnunc) ;}
    public Anuncio encontrarAnuncVisit(int codAnunc) {return this.historicoAnunc.get(codAnunc) ;}
    public boolean existeAnuncVisit(int codAnunc) {return this.historicoAnunc.containsKey(codAnunc) ;}
    public boolean temAnuncVisits() {return !this.historicoAnunc.isEmpty() ;}
    public boolean eNullAnuncVisits () {return this.historicoAnunc == null; }
    public void limparAnuncVisits() {this.historicoAnunc.clear();}
}