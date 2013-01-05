package Data_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	// v. c.
	public static final String ip = "172.21.46.80";
	public static final String porta = "1521";
	public static final String sid = "psfdc";
	public static final String user = "pedro";
	public static final String pw = "secinfanteh";
	public static final String url = "jdbc:oracle:thin:@" + ip + ":" + porta
			+ ":" + sid;
	public static Connection conexao;

	public static final String pathImagem = "/";

	// m. c.
	public static void iniciarConexao() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(url, user, pw);
			conexao.setAutoCommit(true);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}

	}

	public static Connection getConexao() {
		return ConexaoBD.conexao;
	}

	public static void terminarConexao() {

		try {
			conexao.close();
		} catch (SQLException e) {
		}
	}
}