package camadaNegocio ;

import java.util.GregorianCalendar;
//import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Anuncio {

    // v. i.
    private Map<String, Tag> tags;
    private Categoria categoria;
    private Map<Integer, Avaliacao> avaliacoes;
    private int codigo;
    private String titulo;
    private GregorianCalendar dataInser;
    private GregorianCalendar dataExpir;
    private double preco;
    private String descricao;
    private int quantidade;
    private Set<String> imagens;
    private int nVisitas;
    private boolean estadoProduto;
    private char estadoAnuncio;
    private UtilizadorRegistado anunciante ;
    
    // construtor
    public Anuncio(Map<String,Tag> tags, Categoria categoria, Map<Integer, Avaliacao> avaliacoes, int codigo, String titulo, GregorianCalendar dataInser, GregorianCalendar dataExpir, double preco, String descricao, int quantidade, Set<String> imagens, int nVisitas, boolean estadoProduto, char estadoAnuncio, UtilizadorRegistado anunciante) {
        this.tags = tags;
        this.categoria = categoria;
        this.avaliacoes = avaliacoes;
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataInser = dataInser;
        this.dataExpir = dataExpir;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.imagens = imagens;
        this.nVisitas = nVisitas;
        this.estadoProduto = estadoProduto;
        this.estadoAnuncio = estadoAnuncio;
        this.anunciante = anunciante;
    }
    
    // get e set
    public Map<String, Tag> getTags() {
        return tags;
    }

    public void setTags(Map<String, Tag> tags) {
        this.tags = tags;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Map<Integer, Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Map<Integer, Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public GregorianCalendar getDataInser() {
        return dataInser;
    }

    public void setDataInser(GregorianCalendar dataInser) {
        this.dataInser = dataInser;
    }

    public GregorianCalendar getDataExpir() {
        return dataExpir;
    }

    public void setDataExpir(GregorianCalendar dataExpir) {
        this.dataExpir = dataExpir;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Set<String> getImagens() {
        return imagens;
    }

    public void setImagens(Set<String> imagens) {
        this.imagens = imagens;
    }

    public int getnVisitas() {
        return nVisitas;
    }

    public void setnVisitas(int nVisitas) {
        this.nVisitas = nVisitas;
    }

    public boolean isEstadoProduto() {
        return estadoProduto;
    }

    public void setEstadoProduto(boolean estadoProduto) {
        this.estadoProduto = estadoProduto;
    }

    public char getEstadoAnuncio() {
        return estadoAnuncio;
    }

    public void setEstadoAnuncio(char estadoAnuncio) {
        this.estadoAnuncio = estadoAnuncio;
    }

    public UtilizadorRegistado getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(UtilizadorRegistado anunciante) {
        this.anunciante = anunciante;
    }
    
    // e, tS
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Anuncio other = (Anuncio) obj;
        if (this.codigo != other.getCodigo()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "tags=" + this.tags.toString() + ", categoria=" + this.categoria.toString() 
         + ", avaliacoes=" + this.avaliacoes.toString() + ", codigo=" + this.codigo + ", titulo=" 
         + this.titulo + ", dataInser=" + this.dataInser.toString() + ", dataExpir=" + this.dataExpir.toString() 
         + ", preco=" + this.preco + ", descricao=" + this.descricao + ", quantidade=" + this.quantidade 
         + ", imagens=" + this.imagens.toString() + ", nVisitas=" + this.nVisitas + ", estadoProduto=" 
         + this.estadoProduto + ", estadoAnuncio=" + this.estadoAnuncio + ", anunciante=" + this.anunciante.toString() + '}';
    }
}