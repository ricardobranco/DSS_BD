package business_Layer;

import java.util.Map;

import data_Layer.AnuncioVisitadoUtilizadorDAO;


public class Utilizador {

	// v. i.
	private Map<Integer, Anuncio> historicoAnunc;
	private int id;

	// construtor - DAO
	public Utilizador() {
	}

	public Utilizador(int id) {

		this.historicoAnunc = new AnuncioVisitadoUtilizadorDAO(id);
		this.id = id;
	}

	// get and set
	public Map<Integer, Anuncio> getHistoricoAnunc() {
		return historicoAnunc;
	}

	public void setHistoricoAnunc(Map<Integer, Anuncio> historicoAnunc) {
		this.historicoAnunc = historicoAnunc;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int idArg) {
		this.id = idArg;
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
		if (this.id != other.getId()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Utilizador{" + "historicoAnunc="
				+ this.historicoAnunc.toString() + "id=" + this.id + '}';
	}

	@Override
	public Utilizador clone() {
		return new Utilizador(this.id);
	}

	// gestão maps
	public Anuncio inserirAnuncVisit(Anuncio a) {
		return this.historicoAnunc.put(a.getCodigo(), (a.getClass().toString()
				.equals("AnuncioVenda") ? ((AnuncioVenda) a).clone()
				: ((AnuncioCompra) a).clone()));
	}

	public Anuncio removerAnuncVisit(int codAnunc) {
		return this.historicoAnunc.remove(codAnunc);
	}

	public Anuncio encontrarAnuncVisit(int codAnunc) {
		return this.historicoAnunc.get(codAnunc);
	}

	public boolean existeAnuncVisit(int codAnunc) {
		return this.historicoAnunc.containsKey(codAnunc);
	}

	public boolean temAnuncVisits() {
		return !this.historicoAnunc.isEmpty();
	}

	public boolean eNullAnuncVisits() {
		return this.historicoAnunc == null;
	}

	public void limparAnuncVisits() {
		this.historicoAnunc.clear();
	}
}