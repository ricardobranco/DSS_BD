package camadaNegocio ;

import java.util.List;

public class SaleSquared implements SaleSquaredFacade {

    // v. i.
    List<UtilizadorRegistado> users;
    List<Anuncio> anuncios;
    List<Categoria> categorias;
    List<Tag> tags;
    Utilizador emSessao;
    
    // construtor -- dao
    public SaleSquared () {
        this.emSessao = new Utilizador() ;
    }
    
    // get e set
    public List<UtilizadorRegistado> getUsers() {
        return users;
    }

    public void setUsers(List<UtilizadorRegistado> users) {
        this.users = users;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
        if (!this.tags.equals(other.getTags())) {
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
         + ", categorias=" + this.categorias.toString() + ", tags=" + this.tags.toString() 
         + ", emSessao=" + this.emSessao.toString() + '}';
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