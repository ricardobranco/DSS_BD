package camadaNegocio ;

import java.util.GregorianCalendar;
import java.util.Map;
//import java.util.Set;
import camadaDados.* ;

public class AnuncioCompra extends Anuncio {

    
    
    // v. i.
    private Map<Integer, AnuncioVenda> respostas;
    
    
    // construtor
    public AnuncioCompra(int codigo, String titulo, GregorianCalendar dataInser, GregorianCalendar dataExpir, double preco, String descricao, int quantidade, int nVisitas, boolean estadoProduto, char estadoAnuncio, UtilizadorRegistado anunciante) {
        super(codigo, titulo, dataInser, dataExpir, preco, descricao, quantidade, nVisitas, estadoProduto, estadoAnuncio, anunciante) ;        
        this.respostas = new RespostaAnuncioCompraDAO(codigo) ;
        }
    
    public AnuncioCompra (int codigo) {
        super(codigo) ;
        this.respostas = new RespostaAnuncioCompraDAO(codigo) ;
    }
    
    // get e set
    public Map<Integer, AnuncioVenda> getRespostas() {return respostas;}
    public void setRespostas(Map<Integer, AnuncioVenda> respostas) {this.respostas = respostas ;}
    
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
   
    @Override
    public AnuncioCompra clone () {
        return new AnuncioCompra(this.getCodigo(), this.getTitulo(), this.getDataInser(), this.getDataExpir(), this.getPreco(), this.getDescricao(), this.getQuantidade(), this.getnVisitas(), this.isEstadoProduto(), this.getEstadoAnuncio(), this.getAnunciante().clone()) ;
    }
   
    
    // gestão map
    public AnuncioVenda inserirResposta(AnuncioVenda a) {return this.respostas.put(a.getCodigo(), a.clone()) ;}
    public AnuncioVenda removerResposta(int codAnunc) {return this.respostas.remove(codAnunc) ;}
    public AnuncioVenda encontrarResposta(int codAnunc) {return this.respostas.get(codAnunc) ;}
    public boolean existeResposta(int codAnunc) {return this.respostas.containsKey(codAnunc) ;}
    public boolean temRespostas() {return !this.respostas.isEmpty() ;}
    public boolean eNullRespostas () {return this.respostas == null; }
}