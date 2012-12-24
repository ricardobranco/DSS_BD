package camadaNegocio ;

import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;

public class AnuncioVenda extends Anuncio {

    // v. i.
    private ModoVenda tipoVenda;
    
    // construtor
    public AnuncioVenda(Map<String,Tag> tags, Map<String, Categoria> categorias, Map<Integer, Avaliacao> avaliacoes, int codigo, String titulo, GregorianCalendar dataInser, GregorianCalendar dataExpir, double preco, String descricao, int quantidade, Set<String> imagens, int nVisitas, boolean estadoProduto, char estadoAnuncio, UtilizadorRegistado anunciante, ModoVenda modoV) {
        super(tags, categorias, avaliacoes, codigo, titulo, dataInser, dataExpir, preco, descricao, quantidade, imagens, nVisitas, estadoProduto, estadoAnuncio, anunciante) ;
        this.tipoVenda = modoV ;
    }
    
    public AnuncioVenda (int codigo) {
        super(codigo) ;
    }
    
    // get e set
    public ModoVenda getTipoVenda() {return tipoVenda;}
    public void setTipoVenda(ModoVenda tipoVenda) {this.tipoVenda = tipoVenda;}
    
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
        return super.toString() + "AnuncioVenda{" + "tipoVenda=" + this.tipoVenda.toString() + '}';
    }
    /*
    @Override
    public AnuncioCompra clone () {
        return new AnuncioCompra(this.getTags().clone(), this.getCategoria().clone(), this.getAvaliacoes.clone(), this.getCodigo(), this.getTitulo(), this.getDataInser(), this.getDataExpir(), this.getPreco(), this.getDescricao(), this.getQuantidade(), this.getImagens().clone(), this.getnVisitas(), this.getEstadoProduto(), this.getEstadoAnuncio(), this.getAnunciante().clone(), this.respostas.clone()) ;
    }
    */
    
    // outros
    public void adicionarLicitacao (double valor) {
        
        Leilao l = (Leilao)this.tipoVenda ;
        l.setnLicitacoes(l.getnLicitacoes()+1);
        l.setPrecoActual(valor);
    }
    public void adicionarProposta () {
        
        VendaDirecta v = (VendaDirecta)this.tipoVenda ;
        v.setnPropostas(v.getnPropostas()+1);
    }
    
    // pré-condição: modo de venda é leilão
    public long calculaTempoRestanteLeilao () {return ((Leilao)this.tipoVenda).calculaTempoRestante() ;}
        
    }
    
}