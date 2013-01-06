package business_Layer;

import java.util.GregorianCalendar;
import java.util.Set;

import data_Layer.ModoPagamentoDAO;


public class AnuncioVenda extends Anuncio {

	// v. c.
	public static String[] MODOS_PAGAMENTO = { "PayPal",
			"Transferência Bancária", "Dinheiro", "Envio à cobranca",
			"Descrição","Cheque" };

	// v. i.
	private ModoVenda tipoVenda;
	private Set<String> modosPagamento;
	private boolean envioEstrangeiro;
	private String condicoesEnvio;
	private double precoEnvio;
	private double seguro;
	private String metodoEnvio;
	private boolean propostaTrocar;

	// construtor
	public AnuncioVenda(int codigo, String titulo, GregorianCalendar dataInser,
			GregorianCalendar dataExpir, String descricao,
			int quantidade, int nVisitas, boolean estadoProduto,
			int estadoAnuncio, UtilizadorRegistado anunciante,
			boolean envioEstrangeiro, String condicoesEnvio, double precoEnvio,
			double seguro, String metodoEnvio, boolean possivelTrocar,
			ModoVenda modoV) {
		super(codigo, titulo, dataInser, dataExpir, descricao,
				quantidade, nVisitas, estadoProduto, estadoAnuncio, anunciante);
		this.tipoVenda = modoV;
		this.modosPagamento = new ModoPagamentoDAO(codigo);
		this.envioEstrangeiro = envioEstrangeiro;
		this.condicoesEnvio = condicoesEnvio;
		this.precoEnvio = precoEnvio;
		this.seguro = seguro;
		this.metodoEnvio = metodoEnvio;
		this.propostaTrocar = possivelTrocar;

	}

	public AnuncioVenda(int codigo) {
		super(codigo);
		this.modosPagamento = new ModoPagamentoDAO(codigo);
	}

	// get e set
	public ModoVenda getTipoVenda() {
		return tipoVenda;
	}

	public void setTipoVenda(ModoVenda tipoVenda) {
		this.tipoVenda = tipoVenda;
	}

	public Set<String> getModosPagamento() {
		return modosPagamento;
	}

	public void setModosPagamento(Set<String> modosPagamento) {
		this.modosPagamento = modosPagamento;
	}

	public boolean isEnvioEstrangeiro() {
		return envioEstrangeiro;
	}

	public void setEnvioEstrangeiro(boolean envioEstrangeiro) {
		this.envioEstrangeiro = envioEstrangeiro;
	}

	public String getCondicoesEnvio() {
		return condicoesEnvio;
	}

	public void setCondicoesEnvio(String condicoesEnvio) {
		this.condicoesEnvio = condicoesEnvio;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public double getPrecoEnvio() {
		return this.precoEnvio;
	}

	public void setPrecoEnvio(double p) {
		this.precoEnvio = p;
	}

	public String getMetodoEnvio() {
		return this.metodoEnvio;
	}

	public void setMetodoEnvio(String metodoEnvio) {
		this.metodoEnvio = metodoEnvio;
	}

	public boolean getPossivelTrocar() {
		return this.propostaTrocar;
	}

	public void setPossivelTrocar(boolean b) {
		this.propostaTrocar = b;
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
		final AnuncioVenda other = (AnuncioVenda) obj;
		if (!super.equals(other)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "AnuncioVenda{" + "tipoVenda="
				+ this.tipoVenda.toString() + '}';
	}

	@Override
	public AnuncioVenda clone() {
		return new AnuncioVenda(
				this.getCodigo(),
				this.getTitulo(),
				this.getDataInser(),
				this.getDataExpir(),				
				this.getDescricao(),
				this.getQuantidade(),
				this.getnVisitas(),
				this.isEstadoProduto(),
				this.getEstadoAnuncio(),
				this.getAnunciante().clone(),
				this.envioEstrangeiro,
				this.condicoesEnvio,
				this.precoEnvio,
				this.seguro,
				this.metodoEnvio,
				this.propostaTrocar,
				(this.tipoVenda.getClass().toString().equals("Leilao") ? ((Leilao) this.tipoVenda)
						.clone() : ((VendaDirecta) this.tipoVenda).clone()));
	}

	// outros
	public void adicionarLicitacao(double valor) {

		Leilao l = (Leilao) this.tipoVenda;
		l.setnLicitacoes(l.getnLicitacoes() + 1);
		l.setPrecoActual(valor);
	}

	public void adicionarProposta() {

		VendaDirecta v = (VendaDirecta) this.tipoVenda;
		v.setnPropostas(v.getnPropostas() + 1);
	}

	// pré-condição: modo de venda é leilão
	public long calculaTempoRestanteLeilao() {
		return ((Leilao) this.tipoVenda).calculaTempoRestante();
	}
        
        public double getPreco () { return this.tipoVenda.getPreco() ;}
}
