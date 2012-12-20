package camadaNegocio ;

import java.util.Map;
import java.util.GregorianCalendar;

public class UtilizadorRegistado extends Utilizador {

    // v. i.
    private Map<String, UtilizadorRegistado> usersSeguidos;
    private Map<Integer, Mensagem> enviadas;
    private Map<Integer, Mensagem> recebidas;
    private Map<Integer, Anuncio> anuncSeguidos;
    private Map<String, Categoria> categSeguidas;
    private Map<Integer, Transaccao> transaccoes;
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

    public Map<String, UtilizadorRegistado> getUsersSeguidos() {
        return usersSeguidos;
    }

    public void setUsersSeguidos(Map<String, UtilizadorRegistado> usersSeguidos) {
        this.usersSeguidos = usersSeguidos;
    }

    public Map<Integer, Mensagem> getEnviadas() {
        return enviadas;
    }

    public void setEnviadas(Map<Integer, Mensagem> enviadas) {
        this.enviadas = enviadas;
    }

    public Map<Integer, Mensagem> getRecebidas() {
        return recebidas;
    }

    public void setRecebidas(Map<Integer, Mensagem> recebidas) {
        this.recebidas = recebidas;
    }

    public Map<Integer, Anuncio> getAnuncSeguidos() {
        return anuncSeguidos;
    }

    public void setAnuncSeguidos(Map<Integer, Anuncio> anuncSeguidos) {
        this.anuncSeguidos = anuncSeguidos;
    }

    public Map<String, Categoria> getCategSeguidas() {
        return categSeguidas;
    }

    public void setCategSeguidas(Map<String, Categoria> categSeguidas) {
        this.categSeguidas = categSeguidas;
    }

    public Map<Integer, Transaccao> getTransaccoes() {
        return transaccoes;
    }

    public void setTransaccoes(Map<Integer, Transaccao> transaccoes) {
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