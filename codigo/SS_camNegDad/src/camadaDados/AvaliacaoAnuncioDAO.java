package camadaDados;

import camadaNegocio.Avaliacao ;
import java.util.* ;
import java.sql.* ;

public class AvaliacaoAnuncioDAO implements Map<Integer, Avaliacao> {

    // v. c.
    public static final String AVALIACAO_T = "Avaliacao aval" ;
    
    public static final int ID = 1 ;
    public static final int ANUNCIO = 2 ;
    public static final int AVALIADOR = 3 ;
    public static final int CLASSIFICACAO = 4 ;
    public static final int COMENTARIO = 5 ;
    public static final int DATA = 6 ;
    
    // v. i.    
    private int codAnunc ;
    
    // construtor    
    public AvaliacaoAnuncioDAO (int codAnuncArg) {this.codAnunc = codAnuncArg ;}
    
    // interface Map
    public void clear () { throw new NullPointerException("Avaliacao_Anuncio_clear não está implementado!");}    
    
    public boolean containsKey(Object key) {
        
        try {
            Integer chave = (Integer)key ;
            String sql = "SELECT id FROM " + AVALIACAO_T + " WHERE aval.anuncio = ? AND aval.id = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; stm.setInt(2, chave) ;
            ResultSet rs = stm.executeQuery();
            return rs.next();
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsValue(Object value) {throw new NullPointerException("Avaliacao_Anuncio_containsValue não está implementado!");}    
    public Set<Map.Entry<Integer, Avaliacao>> entrySet() {throw new NullPointerException("Avaliavao_Anuncio_entrySet não está implementado!");}    
    public boolean equals(Object o) {throw new NullPointerException("Avaliacao_Anuncio_equals não está implementado!");}
    
    public Avaliacao get(Object key) {
        
        try {
            Avaliacao res = null ;
            Integer chave = (Integer)key ;
            String sql = "SELECT * FROM " + AVALIACAO_T + " WHERE aval.anuncio = ? AND aval.id = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; stm.setInt(2, chave) ;
            ResultSet rs = stm.executeQuery();
            if(rs.next()) {                
                UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO() ;
                GregorianCalendar data = new GregorianCalendar() ;
                rs.getTimestamp(DATA, data) ;
                res = new Avaliacao(chave, u.get(rs.getString(AVALIADOR)), data, rs.getDouble(CLASSIFICACAO), rs.getString(COMENTARIO)) ;
            }
            return res;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public int hashCode() {return ConexaoBD.getConexao().hashCode();}
    
    public boolean isEmpty() {
        
        try {
            String sql = "SELECT * FROM " + AVALIACAO_T + " WHERE aval.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; 
            ResultSet rs = stm.executeQuery();
            return !rs.next();
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Set<Integer> keySet() {
        
        try {
            Set<Integer> res = new TreeSet<Integer>() ;
            String sql = "SELECT id FROM " + AVALIACAO_T + " WHERE aval.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; 
            ResultSet rs = stm.executeQuery();
            while(rs.next())
                res.add(rs.getInt(1)) ;            
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Avaliacao put(Integer key, Avaliacao value) {
        
        try {
            Avaliacao res = null;
            String sql = "INSERT INTO " + AVALIACAO_T + " VALUES (?, ?, ?, ?, ?, ?)" ;
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            Timestamp t = new Timestamp(value.getData().getTimeInMillis()) ;
            stm.setInt(ID, key) ; stm.setString(COMENTARIO, value.getComentario()) ; stm.setString(AVALIADOR, value.getAvaliador().getUsername()) ;
            stm.setInt(ANUNCIO, this.codAnunc) ; stm.setDouble(CLASSIFICACAO, value.getClassificacao()) ; stm.setTimestamp(DATA, t) ;
            stm.execute();            
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public void putAll(Map<? extends Integer,? extends Avaliacao> t) {throw new NullPointerException("Avaliacao_putAll não está implementado!");} 
        
    public Avaliacao remove (Object key) { throw new NullPointerException("Avaliacao_remove não está implementado!") ;}   
    
    public int size() {
        try {
            int i = 0;
            String sql = "SELECT id FROM " + AVALIACAO_T + " WHERE aval.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; 
            ResultSet rs = stm.executeQuery();
            for (; rs.next(); i++)
                ;
            return i;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Collection<Avaliacao> values() {
        
        try {
            Collection<Avaliacao> res = new ArrayList<Avaliacao>();
            String sql = "SELECT * FROM " + AVALIACAO_T + " WHERE aval.anuncio = ?";
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, this.codAnunc) ; 
            ResultSet rs = stm.executeQuery();
            UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO() ;
            while(rs.next()) {
                Avaliacao a = null ;
                int chave = rs.getInt(ID) ;
                GregorianCalendar data = new GregorianCalendar() ;
                rs.getTimestamp(DATA, data) ;
                a = new Avaliacao(chave, u.get(rs.getString(AVALIADOR)), data, rs.getDouble(CLASSIFICACAO), rs.getString(COMENTARIO)) ;
                res.add(a) ;                
            }
            return res;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }    
}
