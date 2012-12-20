package camadaNegocio ;

import java.util.GregorianCalendar ; 
import java.util.Objects;

public class Mensagem {

    // v. i.
    UtilizadorRegistado emissor;
    UtilizadorRegistado receptor;	
    private GregorianCalendar dataEnvio;
    private String assunto;
    private String corpo;
    private boolean lida;
    
    // construtor
    public Mensagem(UtilizadorRegistado emissor, UtilizadorRegistado receptor, GregorianCalendar dataEnvio, String assunto, String corpo, boolean lida) {
        this.emissor = emissor;
        this.receptor = receptor;
        this.dataEnvio = dataEnvio;
        this.assunto = assunto;
        this.corpo = corpo;
        this.lida = lida;
    }
    
    // get e set
    public UtilizadorRegistado getEmissor() {
        return emissor;
    }

    public void setEmissor(UtilizadorRegistado emissor) {
        this.emissor = emissor;
    }

    public UtilizadorRegistado getReceptor() {
        return receptor;
    }

    public void setReceptor(UtilizadorRegistado receptor) {
        this.receptor = receptor;
    }

    public GregorianCalendar getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(GregorianCalendar dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public boolean getLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
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
        final Mensagem other = (Mensagem) obj;
        if (!this.emissor.equals(other.getEmissor())) {
            return false;
        }
        if (!this.receptor.equals(other.getReceptor())) {
            return false;
        }
        if (!this.dataEnvio.equals(other.getDataEnvio())) {
            return false;
        }
        if (!this.assunto.equals(other.getAssunto())) {
            return false;
        }
        if (!this.corpo.equals(other.getCorpo())) {
            return false;
        }
        if (this.lida != other.getLida()) {
            return false;
        }
        return true;
    }
                                                                                
    @Override
    public String toString() {
        return "Mensagem{" + "emissor=" + this.emissor.toString() + ", receptor=" + this.receptor.toString() 
        + ", dataEnvio=" + this.dataEnvio.toString() + ", assunto=" + this.assunto + ", corpo=" 
        + this.corpo + ", lida=" + this.lida + '}';
    }
    
    /* falta clone em UserRegistado
    @Override
    public Mensagem clone () {
        return new Mensagem(this.emissor.clone(), this.receptor.clone(), this.dataEnvio, this.assunto, this.corpo, this.lida) ;
    }
    */ 

}