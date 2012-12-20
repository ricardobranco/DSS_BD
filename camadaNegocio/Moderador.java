package camadaNegocio ;

import java.util.GregorianCalendar;

public class Moderador extends UtilizadorRegistado {

    // v. i.
    private char nivelPermiss;
    
    // construtor
    public Moderador (String username, String password, char estado, String email, String morada, String infPessoal, String imagem, double rating, String contacto, String nome, GregorianCalendar dn, char nivelPerm) {
        super(username, password, estado, email, morada, infPessoal, imagem, rating, contacto, nome, dn) ;
        this.nivelPermiss = nivelPerm ;
    }
    
    // get e set

    public char getNivelPermiss() {
        return nivelPermiss;
    }

    public void setNivelPermiss(char nivelPermiss) {
        this.nivelPermiss = nivelPermiss;
    }
    
    // c, e, tS
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moderador other = (Moderador) obj;
        if (this.nivelPermiss != other.getNivelPermiss()) {
            return false;
        }
        if (!super.equals((UtilizadorRegistado)other))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Moderador{" + "nivelPermiss=" + this.nivelPermiss + '}';
    }
    /* dao..
    @Override
    public Moderador clone () {
        return new Moderador() ;
    } 
    */ 
    
    
    

}