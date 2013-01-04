package Business_Layer;

import java.util.GregorianCalendar;

public class Mensagem {

	// v. i.
	private int id;
	private UtilizadorRegistado emissor;
	private UtilizadorRegistado receptor;
	private GregorianCalendar dataEnvio;
	private String assunto;
	private String corpo;
	private boolean lida;

	// construtor
	public Mensagem(int id, UtilizadorRegistado emissor,
			UtilizadorRegistado receptor, GregorianCalendar dataEnvio,
			String assunto, String corpo, boolean lida) {
		this.id = id;
		this.emissor = emissor;
		this.receptor = receptor;
		this.dataEnvio = dataEnvio;
		this.assunto = assunto;
		this.corpo = corpo;
		this.lida = lida;
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
				+ ", corpo=" + this.corpo + ", lida=" + this.lida + '}';
	}

	@Override
	public Mensagem clone() {
		return new Mensagem(this.id, this.emissor.clone(),
				this.receptor.clone(), this.dataEnvio, this.assunto,
				this.corpo, this.lida);
	}
}