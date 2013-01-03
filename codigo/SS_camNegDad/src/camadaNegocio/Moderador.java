package camadaNegocio ;

import java.util.GregorianCalendar;

public class Moderador extends UtilizadorRegistado {

    // v. i.
    private char nivelPermiss;
    
    // construtor
    public Moderador (int id, String username, String password, char estado, String email, String morada, String codPostal, String localidade, String pais, String infPessoal, String imagem, String contacto, String nome, GregorianCalendar dn, char nivelPerm) {
        super(id, username, password, estado, email, morada, codPostal, localidade, pais, infPessoal, imagem, contacto, nome, dn) ;
        this.nivelPermiss = nivelPerm ;
    }
    
    // get e set
    public char getNivelPermiss() {return nivelPermiss;}
    public void setNivelPermiss(char nivelPermiss) {this.nivelPermiss = nivelPermiss;}
    
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
        if (!this.getUsername().equals(other.getUsername())) {
            return false;
        }        
        return true;
    }

    @Override
    public String toString() {
        return "Moderador{" + "nivelPermiss=" + this.nivelPermiss + super.toString() + '}';
    }
    
    @Override
    public Moderador clone () {
        return new Moderador(this.getId(), this.getUsername(), this.getPassword(), this.getEstado(), this.getEmail(), this.getMorada(), this.getCodPostal(), this.getLocalidade(), this.getPais(), this.getInfPessoal(), this.getImagem(), this.getContacto(), this.getNome(), this.getDataNasc(), this.nivelPermiss) ;
    } 
}