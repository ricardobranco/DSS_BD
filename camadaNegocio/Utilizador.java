package camadaNegocio ;

import java.util.List ;

public class Utilizador {

    // v. i.    
    private List<Anuncio> historicoAnunc;
    
    // construtor - DAO
    public Utilizador() {
        
    }
    
    // get and set
    public List<Anuncio> getHistoricoAnunc() {
        return historicoAnunc;
    }

    public void setHistoricoAnunc(List<Anuncio> historicoAnunc) {
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
}