package camadaNegocio ;

import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;

public class AnuncioCompra extends Anuncio {

    // v. i.
    Map<Integer, Anuncio> respostas;
    
    // construtor
    public AnuncioCompra(Map<String,Tag> tags, Categoria categoria, Map<Integer, Avaliacao> avaliacoes, int codigo, String titulo, GregorianCalendar dataInser, GregorianCalendar dataExpir, double preco, String descricao, int quantidade, Set<String> imagens, int nVisitas, boolean estadoProduto, char estadoAnuncio, UtilizadorRegistado anunciante, Map<Integer, Anuncio> respostas) {
        super(tags, categoria, avaliacoes, codigo, titulo, dataInser, dataExpir, preco, descricao, quantidade, imagens, nVisitas, estadoProduto, estadoAnuncio, anunciante) ;
        this.respostas = respostas ;
    }
    
    // get e set
    public Map<Integer, Anuncio> getRespostas() {
        return respostas;
    }

    public void setRespostas(Map<Integer, Anuncio> respostas) {
        this.respostas = respostas;
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
        return super.toString() + "AnuncioCompra{" + "respostas=" + respostas.toString() + '}';
    }
    /*
    @Override
    public AnuncioCompra clone () {
        return new AnuncioCompra(this.getTags().clone(), this.getCategoria().clone(), this.getAvaliacoes.clone(), this.getCodigo(), this.getTitulo(), this.getDataInser(), this.getDataExpir(), this.getPreco(), this.getDescricao(), this.getQuantidade(), this.getImagens().clone(), this.getnVisitas(), this.getEstadoProduto(), this.getEstadoAnuncio(), this.getAnunciante().clone(), this.respostas.clone()) ;
    }
    */

}