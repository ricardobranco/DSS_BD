package camadaDados;

import camadaNegocio.Categoria ;
import java.util.* ;
import java.sql.* ;

public class CategoriaAnuncioDAO implements Map<String, Categoria> {
    
    // v. c.
    public static final String CATEGORIA_A_T = "CategoriaAnuncio cata" ;
    
    public static final int ANUNCIO = 1 ;
    public static final int CATEGORIA = 2 ;
    
    // v. i.    
    private int codAnunc ;
    
    // construtor    
    public CategoriaAnuncioDAO (int codAnuncArg) {this.codAnunc = codAnuncArg ;}
    
    // interface Map
    public void clear () { 
        
        try {            
            String sql = "DELETE FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ?" ;
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            stm.execute();            
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}        
    }
    
    public boolean containsKey(Object key) throws NullPointerException {
        
        try {
            String chave = (String)key ;
            String sql = "SELECT * FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ? AND cata.categoria = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; stm.setString(2, chave) ;
            ResultSet rs = stm.executeQuery();
            return rs.next();
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsValue(Object value) {throw new NullPointerException("Categoria_Anuncio_containsValue não está implementado!");}    
    public Set<Map.Entry<String, Categoria>> entrySet() {throw new NullPointerException("Categoria_Anuncio_entrySet não está implementado!");}    
    public boolean equals(Object o) {throw new NullPointerException("Categoria_Anuncio_equals não está implementado!");}
    
    public Categoria get(Object key) {
        
        try {
            Categoria res = null;
            String chave = (String)key ;
            String sql = "SELECT * FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ? AND cata.categoria = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; stm.setString(2, chave) ;
            ResultSet rs = stm.executeQuery();    
            if (rs.next())  {
                CategoriaDAO c = new CategoriaDAO() ;
                res = c.get(rs.getString(CATEGORIA)) ;
            }
            return res;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public int hashCode() {return ConexaoBD.getConexao().hashCode();}
    
     public boolean isEmpty() {
        
         try {
            String sql = "SELECT * FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            ResultSet rs = stm.executeQuery();  
            return !rs.next();
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Set<String> keySet() {
    
        try {
            Set<String> res = new TreeSet<String>() ;
            String sql = "SELECT categoria FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            ResultSet rs = stm.executeQuery(); 
            while(rs.next())
                res.add(rs.getString(1)) ;
            return res ;
        } catch(Exception e) {throw new NullPointerException(e.getMessage());}        
    }
    
    public Categoria put(String key, Categoria value) {
        
        try {
            Categoria res = null;
            String sql = "INSERT INTO " + CATEGORIA_A_T + " VALUES (?, ?)";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(ANUNCIO, this.codAnunc) ;
            stm.setString(CATEGORIA, key) ;
            stm.execute();
            return res ;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public void putAll(Map<? extends String,? extends Categoria> t) {throw new NullPointerException("Categoria_Anuncio_putAll não está implementado!");}
    
    public Categoria remove (Object key) { 
        
        try {            
            String chave = (String)key ;
            Categoria res = null ;
            String sql = "DELETE FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ? AND cata.categoria = ?" ;
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            stm.setString(2, chave) ;
            stm.execute();        
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}        
    }
    
    public int size() {
        
        try {
            int i = 0;
            String sql = "SELECT categoria FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            ResultSet rs = stm.executeQuery();
            for (; rs.next(); i++)
                ;
            return i;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Collection<Categoria> values() {
        
        try {
            Collection<Categoria> res = new ArrayList<Categoria>();
            String sql = "SELECT * FROM " + CATEGORIA_A_T + " WHERE cata.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ;
            ResultSet rs = stm.executeQuery();
            CategoriaDAO c = new CategoriaDAO() ;
            while(rs.next())
                res.add(c.get(rs.getString(CATEGORIA))) ;
            return res;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }    
}
