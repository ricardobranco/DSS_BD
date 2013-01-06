package Business_Layer;

import java.util.GregorianCalendar;
import java.util.Map;

import Data_Layer.RespostaAnuncioCompraDAO;



public class AnuncioCompra extends Anuncio {

	// v. i.
	private Map<Integer, Anuncio> respostas;
        private double precoSugerido ;

	// construtor
	public AnuncioCompra(int codigo, String titulo,
			GregorianCalendar dataInser, GregorianCalendar dataExpir,
			String descricao, int quantidade, int nVisitas,
			boolean estadoProduto, int estadoAnuncio,
			UtilizadorRegistado anunciante, double precoS) {
		super(codigo, titulo, dataInser, dataExpir, descricao,
				quantidade, nVisitas, estadoProduto, estadoAnuncio, anunciante);
		this.respostas = new RespostaAnuncioCompraDAO(codigo);
                this.precoSugerido = precoS ;
	}

	public AnuncioCompra(int codigo) {
		super(codigo);
		this.respostas = new RespostaAnuncioCompraDAO(codigo);
	}

	// get e set
	public Map<Integer, Anuncio> getRespostas() {
		return respostas;
	}

	public void setRespostas(Map<Integer, Anuncio> respostas) {
		this.respostas = respostas;
	}

        public double getPrecoSugerido() {
            return precoSugerido;
        }

        public void setPrecoSugerido(double precoSugerido) {
            this.precoSugerido = precoSugerido;
        }        

	// e, c, tS
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final AnuncioCompra other = (AnuncioCompra) obj;
		if (!super.equals(other)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "AnuncioCompra{" + "respostas="
				+ this.respostas.toString() + this.precoSugerido + '}';
	}

	@Override
	public AnuncioCompra clone() {
		return new AnuncioCompra(this.getCodigo(), this.getTitulo(),
				this.getDataInser(), this.getDataExpir(), 
				this.getDescricao(), this.getQuantidade(), this.getnVisitas(),
				this.isEstadoProduto(), this.getEstadoAnuncio(), this
						.getAnunciante().clone(), this.precoSugerido);
	}

	// gestão map
	public Anuncio inserirResposta(Anuncio a) {
		return this.respostas.put(a.getCodigo(), a);
	}

	public Anuncio removerResposta(int codAnunc) {
		return this.respostas.remove(codAnunc);
	}

	public Anuncio encontrarResposta(int codAnunc) {
		return this.respostas.get(codAnunc);
	}

	public boolean existeResposta(int codAnunc) {
		return this.respostas.containsKey(codAnunc);
	}

	public boolean temRespostas() {
		return !this.respostas.isEmpty();
	}

	public boolean eNullRespostas() {
		return this.respostas == null;
	}
        
        public double getPreco () { return this.precoSugerido ; }
}