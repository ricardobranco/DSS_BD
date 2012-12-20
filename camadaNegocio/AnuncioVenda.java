package camadaNegocio ;

import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;

public class AnuncioVenda extends Anuncio {

    // v. i.
    private ModoVenda tipoVenda;
    
    // construtor
    public AnuncioVenda(Map<String,Tag> tags, Categoria categoria, Map<Integer, Avaliacao> avaliacoes, int codigo, String titulo, GregorianCalendar dataInser, GregorianCalendar dataExpir, double preco, String descricao, int quantidade, Set<String> imagens, int nVisitas, boolean estadoProduto, char estadoAnuncio, UtilizadorRegistado anunciante, ModoVenda modoV) {
        super(tags, categoria, avaliacoes, codigo, titulo, dataInser, dataExpir, preco, descricao, quantidade, imagens, nVisitas, estadoProduto, estadoAnuncio, anunciante) ;
        this.tipoVenda = modoV ;
    }
    
    // get e set
    public ModoVenda getTipoVenda() {
        return tipoVenda;
    }

    public void setTipoVenda(ModoVenda tipoVenda) {
        this.tipoVenda = tipoVenda;
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
        return super.toString() + "AnuncioVenda{" + "tipoVenda=" + this.tipoVenda.toString() + '}';
    }
    /*
    @Override
    public AnuncioCompra clone () {
        return new AnuncioCompra(this.getTags().clone(), this.getCategoria().clone(), this.getAvaliacoes.clone(), this.getCodigo(), this.getTitulo(), this.getDataInser(), this.getDataExpir(), this.getPreco(), this.getDescricao(), this.getQuantidade(), this.getImagens().clone(), this.getnVisitas(), this.getEstadoProduto(), this.getEstadoAnuncio(), this.getAnunciante().clone(), this.respostas.clone()) ;
    }
    */
    
}