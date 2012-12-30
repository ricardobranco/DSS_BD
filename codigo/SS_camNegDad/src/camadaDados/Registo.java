package camadaDados;

import java.sql.* ;

public class Registo {
    
    // v. c.
    public static final String REGISTO_T = "Sistema s" ;
    public static final String UTILIZADOR_T = "Utilizador u" ;
    
    public static final String USER = "U" ;
    public static final String REGISTADO = "R" ;
    
    // m. c.
    public static int registaIdMsg () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT idMensagem FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idMensagem = s.idMensagem + 1" ;
            stm.executeUpdate(sqlU) ;
            return res ;
        } catch (SQLException e) {throw new NullPointerException(e.getMessage());}
    }
    
    public static int registaIdTransac () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT idTransaccao FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idTransaccao = s.idTransaccao + 1" ;
            stm.executeUpdate(sqlU) ;
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public static int registaIdAnuncio () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT idAnuncio FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idAnuncio = s.idAnuncio + 1" ;
            stm.executeUpdate(sqlU) ;
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public static int registaIdAvaliacao () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT idAvaliacao FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idAvaliacao = s.idAvaliacao + 1" ;
            stm.executeUpdate(sqlU) ;
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public static int registaIdUtilizador () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();            
            String sql = "SELECT idUtilizador FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idUtilizador = s.idUtilizador + 1" ;
            String sqlUser = "INSERT INTO " + UTILIZADOR_T + " VALUES (?, ?)" ;
            PreparedStatement ps = ConexaoBD.getConexao().prepareStatement(sqlUser) ;            
            ps.setInt(1, res) ;
            ps.setString(2, USER) ;
            stm.executeUpdate(sqlU) ;
            ps.execute() ;
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public static int registaIdModoVenda () {
    
        try {            
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT idModoVenda FROM " + REGISTO_T ;
            ResultSet rs = stm.executeQuery(sql);
            rs.next() ;
            int res = rs.getInt(1) ;
            String sqlU = "UPDATE " + REGISTO_T + " SET s.idModoVenda = s.idModoVenda + 1" ;
            stm.executeUpdate(sqlU) ;
            return res ;
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }    
    
    /*public static void apagarHistoricoAnuncVis (int idUser) { 
        
        try {            
            String sql = "DELETE FROM " + AnuncioVisitadoUtilizadorDAO.ANUNCIO_V_T + " WHERE anv.utilizador = ?" ;
            PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
            stm.setInt(1, idUser) ;
            stm.execute();            
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}        
    }*/   
}
