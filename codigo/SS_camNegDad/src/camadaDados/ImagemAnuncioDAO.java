package camadaDados;

import java.util.* ;
import java.sql.* ;

public class ImagemAnuncioDAO implements Set<String> {

    // v. i.
    private int codAnunc ;
    
    // construtor
    public ImagemAnuncioDAO (int codAnuncArg) {this.codAnunc = codAnuncArg ;}
    
    // interface Set
    public boolean add(String s) {
        
         try {
            boolean al = true;
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
    
    public boolean addAll(Collection<? extends String> c) {
        
        try {
            boolean al = true;
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
    
    public void clear () {
        
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            //stm.executeUpdate("DELETE FROM TAlunos");
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean contains(Object o) {
        
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT";
            ResultSet rs = stm.executeQuery(sql);
            return rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsAll(Collection<?> c) {
        
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT";
            ResultSet rs = stm.executeQuery(sql);
            return rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean equals (Object o) {throw new NullPointerException("equals(Object o) not implemented!");}
    
    public int hashCode() {return ConexaoBD.getConexao().hashCode();}
    
    public boolean isEmpty() {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT");
            return !rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Iterator<String> iterator () { throw new NullPointerException("equals(Object o) not implemented!");}
    
    public boolean remove (Object key) {
        
        try {
            String chave = (String)key ;
            boolean al = true;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "DELETE ";
            int i  = stm.executeUpdate(sql);
            return al;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean removeAll (Collection<?> c) { throw new NullPointerException("removeAll not implemented!");}
    
    public boolean retainAll (Collection<?> c) { throw new NullPointerException("retainAll not implemented!");}
        
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
    
    public Object[] toArray () { throw new NullPointerException("toArray not implemented!");}   
    
    public <String> String[] toArray(String[] a) { throw new NullPointerException("toArray not implemented!");}       
}
