package camadaNegocio ;

import java.util.List;
import java.util.GregorianCalendar;

public class UtilizadorRegistado extends Utilizador {

    // v. i.
    private List<UtilizadorRegistado> usersSeguidos;
    private List<Mensagem> enviadas;
    private List<Mensagem> recebidas;
    private List<Anuncio> anuncSeguidos;
    private List<Categoria> categSeguidas;
    private List<Transaccao> transaccoes;
    private String username;
    private String password;
    private char estado;
    private String email;
    private String morada;
    private String infPessoal;
    private String imagem;
    private double rating;
    private String contacto;
    private String nome;
    private GregorianCalendar dataNasc;
    
    // construtor - DAO
    public UtilizadorRegistado(String username, String password, char estado, String email, 
     String morada, String infPessoal, String imagem, double rating, String contacto, String nome, GregorianCalendar dn) {
        this.username = username;
        this.password = password;
        this.estado = estado;
        this.email = email;
        this.morada = morada;
        this.infPessoal = infPessoal;
        this.imagem = imagem;
        this.rating = rating;
        this.contacto = contacto;
        this.nome = nome;
        this.dataNasc = dn;
        // super
    }
    
    // get e set
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getInfPessoal() {
        return infPessoal;
    }

    public void setInfPessoal(String infPessoal) {
        this.infPessoal = infPessoal;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GregorianCalendar getDataNasc() {
        return this.dataNasc;
    }

    public void setIdade(GregorianCalendar dn) {
        this.dataNasc = dn;
    }

    public List<UtilizadorRegistado> getUsersSeguidos() {
        return usersSeguidos;
    }

    public void setUsersSeguidos(List<UtilizadorRegistado> usersSeguidos) {
        this.usersSeguidos = usersSeguidos;
    }

    public List<Mensagem> getEnviadas() {
        return enviadas;
    }

    public void setEnviadas(List<Mensagem> enviadas) {
        this.enviadas = enviadas;
    }

    public List<Mensagem> getRecebidas() {
        return recebidas;
    }

    public void setRecebidas(List<Mensagem> recebidas) {
        this.recebidas = recebidas;
    }

    public List<Anuncio> getAnuncSeguidos() {
        return anuncSeguidos;
    }

    public void setAnuncSeguidos(List<Anuncio> anuncSeguidos) {
        this.anuncSeguidos = anuncSeguidos;
    }

    public List<Categoria> getCategSeguidas() {
        return categSeguidas;
    }

    public void setCategSeguidas(List<Categoria> categSeguidas) {
        this.categSeguidas = categSeguidas;
    }

    public List<Transaccao> getTransaccoes() {
        return transaccoes;
    }

    public void setTransaccoes(List<Transaccao> transaccoes) {
        this.transaccoes = transaccoes;
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
        final UtilizadorRegistado other = (UtilizadorRegistado) obj;
        if (!this.username.equals(other.getUsername())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UtilizadorRegistado{" + "usersSeguidos=" + this.usersSeguidos.toString() 
        + ", enviadas=" + this.enviadas.toString() + ", recebidas=" + this.recebidas.toString() 
        + ", anuncSeguidos=" + this.anuncSeguidos.toString() + ", categSeguidas=" 
        + this.categSeguidas.toString() + ", transaccoes=" + this.transaccoes.toString() + ", username=" 
        + this.username + ", password=" + this.password + ", estado=" + this.estado + ", email=" + this.email 
        + ", morada=" + this.morada + ", infPessoal=" + this.infPessoal + ", imagem=" + this.imagem + ", rating=" 
        + this.rating + ", contacto=" + this.contacto + ", nome=" + this.nome + ", dataNasc=" 
        + this.dataNasc + super.toString() + '}';
    }
   /*
    @Override
    public UtilizadorRegistado clone () {
        
    } */
    
    
    
    
    
    

}