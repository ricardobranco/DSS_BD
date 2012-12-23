package camadaNegocio ;

import java.util.GregorianCalendar ;

public class Transaccao {
    
    // v. c.
    public static final char SUCESSO = 0 ;
        
    public static final char REJEITADA = 1 ;
    public static final char REPORTADA = 6 ;
    
    public static final char COMP_AGUARDAR_RECEPCAO = 2 ;
    public static final char COMP_AGUARDAR_PAGAMENTO = 7 ;
    
    public static final char VEND_AGUARDAR_PAGAMENTO = 3 ;    
    public static final char VEND_AGUARDAR_RECEPCAO = 8 ;    
    
    public static final char COMP_AGUARDAR_ACEITACAO = 4 ;   
    public static final char VEND_AGUARDAR_ACEITACAO = 5 ;
        
    // v. i.
    private Anuncio anuncio;
    private UtilizadorRegistado vendedor;
    private UtilizadorRegistado comprador;
    private Avaliacao avaliacao;
    private int id;
    private GregorianCalendar data;
    private double valor;
    private String modoPagamento;
    private String morada;
    private char estado;
    private int quantidade;

    // construtor
    public Transaccao(Anuncio anuncio, UtilizadorRegistado vendedor, UtilizadorRegistado comprador, Avaliacao avaliacao, int id, GregorianCalendar data, double valor, String modoPagamento, String morada, char estado, int quantidade) {
        this.anuncio = anuncio;
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.avaliacao = avaliacao;
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.modoPagamento = modoPagamento;
        this.morada = morada;
        this.estado = estado;
        this.quantidade = quantidade;
    }
    
    // get and set
    public Anuncio getAnuncio() {return anuncio;}
    public void setAnuncio(Anuncio anuncio) {this.anuncio = anuncio;}
    public UtilizadorRegistado getVendedor() {return vendedor;}
    public void setVendedor(UtilizadorRegistado vendedor) {this.vendedor = vendedor;}
    public UtilizadorRegistado getComprador() {return comprador;}
    public void setComprador(UtilizadorRegistado comprador) {this.comprador = comprador;}
    public Avaliacao getAvaliacao() {return avaliacao;}
    public void setAvaliacao(Avaliacao avaliacao) {this.avaliacao = avaliacao;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public GregorianCalendar getData() {return data;}
    public void setData(GregorianCalendar data) {this.data = data;}
    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}
    public String getModoPagamento() {return modoPagamento;}
    public void setModoPagamento(String modoPagamento) {this.modoPagamento = modoPagamento;}
    public String getMorada() {return morada;}
    public void setMorada(String morada) {this.morada = morada;}
    public char getEstado() {return estado;}
    public void setEstado(char estado) {this.estado = estado;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    
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
        return "Transaccao{" + "anuncio=" + this.anuncio.toString() + ", vendedor=" + this.vendedor.toString() 
         + ", comprador=" + this.comprador.toString() + ", avaliacao=" + this.avaliacao.toString() + ", id=" 
         + this.id + ", data=" + this.data.toString() + ", valor=" + this.valor + ", modoPagamento=" 
         + this.modoPagamento + ", morada=" + this.morada + ", estado=" + this.estado + ", quantidade=" 
         + this.quantidade + '}';
    }
    /*
    @Override
    public Transaccao clone () {
        return new Transaccao(this.anuncio.clone(), this.vendedor.clone(), this.comprador.clone(), this.avaliacao.clone(),
         this.id, this.data, this.valor, this.modoPagamento, this.morada, this.estado, this.quantidade) ;
    }
    */
    
    
}