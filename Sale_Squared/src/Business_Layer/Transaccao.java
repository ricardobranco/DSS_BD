package Business_Layer;

import java.util.GregorianCalendar;

public class Transaccao {

	// v. c.
	public static final char SUCESSO = 0;

	public static final char EU_REJEITAR = 1;
	public static final char OUTRO_REJEITAR = 11;

	public static final char EU_REPORTAR = 6;
	public static final char OUTRO_REPORTAR = 12;

	public static final char EU_AGUARDAR_RECEPCAO = 2;
	public static final char EU_AGUARDAR_PAGAMENTO = 7;

	public static final char OUTRO_AGUARDAR_PAGAMENTO = 3;
	public static final char OUTRO_AGUARDAR_RECEPCAO = 8;

	public static final char EU_AGUARDAR_ACEITACAO = 4;
	public static final char OUTRO_AGUARDAR_ACEITACAO = 5;

	// v. i.
	private Anuncio anuncio;
	private UtilizadorRegistado vendedor;
	private UtilizadorRegistado comprador;
	// private Avaliacao avaliacao;
	private int id;
	private GregorianCalendar data;
	private double valor;
	private String modoPagamento;
	private String moradaFact;
	private String codPostalFact;
	private String localidadeFact;
	private String paisFact;
	private char estado;
	private int quantidade;

	// construtor
	public Transaccao(Anuncio anuncio, UtilizadorRegistado vendedor,
			UtilizadorRegistado comprador, /* Avaliacao avaliacao, */int id,
			GregorianCalendar data, double valor, String modoPagamento,
			String moradaFact, String codPostalFact, String localidadeFact,
			String paisFact, char estado, int quantidade) {
		this.anuncio = anuncio;
		this.vendedor = vendedor;
		this.comprador = comprador;
		// this.avaliacao = avaliacao;
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.modoPagamento = modoPagamento;
		this.moradaFact = moradaFact;
		this.codPostalFact = codPostalFact;
		this.localidadeFact = localidadeFact;
		this.paisFact = paisFact;
		this.estado = estado;
		this.quantidade = quantidade;
	}

	// get and set
	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public UtilizadorRegistado getVendedor() {
		return vendedor;
	}

	public void setVendedor(UtilizadorRegistado vendedor) {
		this.vendedor = vendedor;
	}

	public UtilizadorRegistado getComprador() {
		return comprador;
	}

	public void setComprador(UtilizadorRegistado comprador) {
		this.comprador = comprador;
	}

	/*
	 * public Avaliacao getAvaliacao() {return avaliacao;} public void
	 * setAvaliacao(Avaliacao avaliacao) {this.avaliacao = avaliacao;}
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getModoPagamento() {
		return modoPagamento;
	}

	public void setModoPagamento(String modoPagamento) {
		this.modoPagamento = modoPagamento;
	}

	public String getMorada() {
		return moradaFact;
	}

	public void setMorada(String moradaFact) {
		this.moradaFact = moradaFact;
	}

	public String getCodPostalFact() {
		return this.codPostalFact;
	}

	public void setCodPostalFact(String codPostal) {
		this.codPostalFact = codPostal;
	}

	public String getLocalidadeFact() {
		return this.localidadeFact;
	}

	public void setLocalidadeFact(String localidade) {
		this.localidadeFact = localidade;
	}

	public String getPaisFact() {
		return this.paisFact;
	}

	public void setPaisFact(String pais) {
		this.paisFact = pais;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		final Transaccao other = (Transaccao) obj;
		if (this.id != other.getId()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Transaccao{" + "anuncio=" + this.anuncio.toString()
				+ ", vendedor=" + this.vendedor.toString() + ", comprador="
				+ this.comprador.toString() + /*
											 * ", avaliacao=" +
											 * this.avaliacao.toString() +
											 */", id=" + this.id + ", data="
				+ this.data.toString() + ", valor=" + this.valor
				+ ", modoPagamento=" + this.modoPagamento + ", moradaFact="
				+ this.moradaFact + ", estado=" + this.estado + ", quantidade="
				+ this.quantidade + '}';
	}

	@Override
	public Transaccao clone() {
		return new Transaccao(((AnuncioVenda) this.anuncio).clone(),
				this.vendedor.clone(), this.comprador.clone()/*
															 * ,
															 * this.avaliacao.clone
															 * ()
															 */, this.id,
				this.data, this.valor, this.modoPagamento, this.moradaFact,
				this.codPostalFact, this.localidadeFact, this.paisFact,
				this.estado, this.quantidade);
	}
}