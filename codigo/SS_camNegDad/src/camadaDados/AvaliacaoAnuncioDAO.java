package camadaDados;

import camadaNegocio.Avaliacao ;
import java.util.* ;
import java.sql.* ;

public class AvaliacaoAnuncioDAO implements Map<Integer, Avaliacao> {
    
    // v. i.    
    private int codAnunc ;
    
    // construtor    
    public AvaliacaoAnuncioDAO (int codAnuncArg) {this.codAnunc = codAnuncArg ;}
    
    // interface Map
    public void clear () {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            //stm.executeUpdate("DELETE FROM TAlunos");
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsKey(Object key) throws NullPointerException {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT";
            ResultSet rs = stm.executeQuery(sql);
            return rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsValue(Object value) {throw new NullPointerException("public boolean containsValue(Object value) not implemented!");}    
    public Set<Map.Entry<Integer, Avaliacao>> entrySet() {throw new NullPointerException("entrySet() not implemented!");}    
    public boolean equals(Object o) {throw new NullPointerException("equals(Object o) not implemented!");}
    public Set<Integer> keySet() {throw new NullPointerException("Not implemented!");}
    public void putAll(Map<? extends Integer,? extends Avaliacao> t) {throw new NullPointerException("Not implemented!");}
    
    public Avaliacao get(Object key) {
        try {
            Avaliacao al = null;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT";
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) 
                ;
                //al = new Aluno(rs.getString(2),rs.getString(1),rs.getInt(3),rs.getInt(4));
            return al;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public int hashCode() {return ConexaoBD.getConexao().hashCode();}
    
    public boolean isEmpty() {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT");
            return !rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Avaliacao put(Integer key, Avaliacao value) {
        try {
            Avaliacao al = null;
            Statement stm = ConexaoBD.getConexao().createStatement();
            stm.executeUpdate("DELETE");
            String sql = "INSERT INTO";
            //sql += value.getNotaT()+","+value.getNotaP()+")";
            int i  = stm.executeUpdate(sql);
            //return new Aluno(value.getNumero(),value.getNome(),value.getNotaT(),value.getNotaP());
            return al ;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Avaliacao remove(Object key) {
        try {
            Integer chave = (Integer)key ;
            Avaliacao al = this.get(chave);
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "DELETE ";
            int i  = stm.executeUpdate(sql);
            return al;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public int size() {
        try {
            int i = 0;
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT");
            for (;rs.next();i++);
            return i;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Collection<Avaliacao> values() {
        try {
            Collection<Avaliacao> col = new HashSet<Avaliacao>();
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT");
            //for (;rs.next();) {
              //  col.add(new Aluno(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
            //}
            return col;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }    
}
