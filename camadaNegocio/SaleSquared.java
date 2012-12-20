package camadaNegocio ;

import java.util.Map;

public class SaleSquared implements SaleSquaredFacade {

    // v. i.
    Map<String, UtilizadorRegistado> users;
    Map<Integer, Anuncio> anuncios;
    Map<String, Categoria> categorias;
    Utilizador emSessao;
    
    // construtor -- dao
    public SaleSquared () {
        this.emSessao = new Utilizador() ;
    }
    
    // get e set
    public Map<String, UtilizadorRegistado> getUsers() {
        return users;
    }

    public void setUsers(Map<String, UtilizadorRegistado> users) {
        this.users = users;
    }

    public Map<Integer, Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(Map<Integer, Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public Map<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Map<String, Categoria> categorias) {
        this.categorias = categorias;
    }

    public Utilizador getEmSessao() {
        return emSessao;
    }

    public void setEmSessao(Utilizador emSessao) {
        this.emSessao = emSessao;
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
        final SaleSquared other = (SaleSquared) obj;
        if (!this.users.equals(other.getUsers())) {
            return false;
        }
        if (!this.anuncios.equals(other.getAnuncios())) {
            return false;
        }
        if (!this.categorias.equals(other.getCategorias())) {
            return false;
        }
        if (!this.emSessao.equals(other.getEmSessao())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaleSquared{" + "users=" + this.users.toString() + ", anuncios=" + this.anuncios.toString() 
         + ", categorias=" + this.categorias.toString() + ", emSessao=" + this.emSessao.toString() + '}';
    }
    /* -- clone dao 
    @Override
    public SaleSquared clone () {
        return new SaleSquared() ;
    }
    */
    
    // facade
    public int login(String uName, String pw) {
        return 0 ;
    }
    

}