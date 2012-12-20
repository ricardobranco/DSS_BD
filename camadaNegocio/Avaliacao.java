package camadaNegocio ;

import java.util.GregorianCalendar;

public class Avaliacao {

    // v. i.
    UtilizadorRegistado avaliador;
    private GregorianCalendar data;
    private double classificacao;
    private String comentario;

    // construtor
    public Avaliacao(UtilizadorRegistado avaliador, GregorianCalendar data, Double classificacao, String comentario) {
        this.avaliador = avaliador;
        this.data = data;
        this.classificacao = classificacao;
        this.comentario = comentario;
    }
    
    // get e set
    public UtilizadorRegistado getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(UtilizadorRegistado avaliador) {
        this.avaliador = avaliador;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        final Avaliacao other = (Avaliacao) obj;
        if (!this.avaliador.equals(other.getAvaliador())) {
            return false;
        }
        if (!this.data.equals(other.getData())) {
            return false;
        }
        if (Double.doubleToLongBits(this.classificacao) != Double.doubleToLongBits(other.getClassificacao())) {
            return false;
        }
        if (!this.comentario.equals(other.getComentario())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "avaliador=" + this.avaliador.toString() + ", data=" 
        + this.data.toString() + ", classificacao=" + this.classificacao + ", comentario=" + this.comentario + '}';
    }
    /* dao
    @Override
    public Avaliacao clone () {
        return new Avaliacao(this.avaliador.clone(), this.data, this.classificacao, this.comentario) ;
    }
    */
    
}