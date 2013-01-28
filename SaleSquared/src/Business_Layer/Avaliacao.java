package Business_Layer;

import java.util.GregorianCalendar;

public class Avaliacao {

        public static final int avaliacao = 0 ;
        public static final int report = 1 ;
    
	// v. i.
	private int id;
	private UtilizadorRegistado avaliador;
	private GregorianCalendar data;
	private double classificacao;
	private String comentario;
        private int tipo ;

	// construtor
	public Avaliacao(int id, UtilizadorRegistado avaliador,
			GregorianCalendar data, Double classificacao, String comentario, int tipo) {
		this.id = id;
		this.avaliador = avaliador;
		this.data = data;
		this.classificacao = classificacao;
		this.comentario = comentario;
                this.tipo = tipo ;
	}

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

	// get e set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		if (this.id != other.getId()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Avaliacao{" + "id=" + this.id + "avaliador="
				+ this.avaliador.toString() + ", data=" + this.data.toString()
				+ ", classificacao=" + this.classificacao + ", comentario="
				+ this.comentario + '}';
	}

	@Override
	public Avaliacao clone() {
		return new Avaliacao(this.id, this.avaliador.clone(), this.data,
				this.classificacao, this.comentario, this.tipo);
	}
}