package camadaDados;

import java.sql.* ;

public class ConexaoBD {

    // v. c.
    public static final String ip = "localhost" ;
    public static final String porta = "1521" ;
    public static final String sid = "psfdc" ;
    public static final String user = "SYSTEM" ;
    public static final String pw = "secinfanteh" ;
    public static final String url = "jdbc:oracle:thin:@" + ip + ":" + porta + ":" + sid ;
    public static Connection conexao ;
    
    // m. c.
    public static void iniciarConnexao () {
        
        try {
            conexao = DriverManager.getConnection(url, user, pw) ;
        } catch (SQLException e) {}
    }
    
    public static Connection getConexao () {return ConexaoBD.conexao ;}
}
