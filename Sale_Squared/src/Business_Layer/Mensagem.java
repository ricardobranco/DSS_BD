package Business_Layer;

import java.util.GregorianCalendar;

public class Mensagem {

        // v. c.
        public static final int NAO_LIDA = 0 ;
        public static final int LIDA = 1 ;
        public static final int ELIMINADA = 2 ;
    
	// v. i.
	private int id;
	private UtilizadorRegistado emissor;
	private UtilizadorRegistado receptor;
	private GregorianCalendar dataEnvio;
	private String assunto;
	private String corpo;
	private int estado;

	// construtor
	public Mensagem(int id, UtilizadorRegistado emissor,
			UtilizadorRegistado receptor, GregorianCalendar dataEnvio,
			String assunto, String corpo, int estado) {
		this.id = id;
		this.emissor = emissor;
		this.receptor = receptor;
		this.dataEnvio = dataEnvio;
		this.assunto = assunto;
		this.corpo = corpo;
		this.estado = estado;
	}

	// get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
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
		if (this.id != other.getId())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mensagem{" + "id=" + this.id + "emissor="
				+ this.emissor.toString() + ", receptor="
				+ this.receptor.toString() + ", dataEnvio="
				+ this.dataEnvio.toString() + ", assunto=" + this.assunto
				+ ", corpo=" + this.corpo + ", estado=" + this.estado + '}';
	}

	@Override
	public Mensagem clone() {
		return new Mensagem(this.id, this.emissor.clone(),
				this.receptor.clone(), this.dataEnvio, this.assunto,
				this.corpo, this.estado);
	}
}