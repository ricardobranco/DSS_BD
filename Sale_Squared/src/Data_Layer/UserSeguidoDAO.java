package data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import business_Layer.UtilizadorRegistado;


public class UserSeguidoDAO implements Map<String, UtilizadorRegistado> {

	// v. c.
	public static final String USER_S_T = "UserSeguido us";

	public static final int SEGUIDOR = 1;
	public static final int SEGUIDO = 2;

	// v. i.
	private String username;

	// construtor
	public UserSeguidoDAO(String usernameArg) {
		this.username = usernameArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + USER_S_T + " WHERE us.seguidor = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.execute();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) throws NullPointerException {

		try {
			String chave = (String) key;
			String sql = "SELECT * FROM " + USER_S_T
					+ " WHERE us.seguidor = ? AND us.seguido = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			return rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"User_Seguido_containsValue não está implementado!");
	}

	public Set<Map.Entry<String, UtilizadorRegistado>> entrySet() {
		throw new NullPointerException(
				"User_Seguido_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"User_Seguido_equals não está implementado!");
	}

	public UtilizadorRegistado get(Object key) {

		try {
			UtilizadorRegistado res = null;
			String chave = (String) key;
			String sql = "SELECT * FROM " + USER_S_T
					+ " WHERE us.seguidor = ? AND us.seguido = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
				res = u.get(rs.getString(SEGUIDO));
			}
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int hashCode() {
		return ConexaoBD.getConexao().hashCode();
	}

	public boolean isEmpty() {

		try {
			String sql = "SELECT * FROM " + USER_S_T + " WHERE us.seguidor = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			return !rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<String> keySet() {

		try {
			Set<String> res = new TreeSet<String>();
			String sql = "SELECT seguido FROM " + USER_S_T
					+ " WHERE us.seguidor = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getString(1));
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public UtilizadorRegistado put(String key, UtilizadorRegistado value) {

		try {
			UtilizadorRegistado res = null;
			String sql = "INSERT INTO " + USER_S_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(SEGUIDOR, this.username);
			stm.setString(SEGUIDO, key);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends String, ? extends UtilizadorRegistado> t) {
		throw new NullPointerException(
				"User_Seguido_putAll não está implementado!");
	}

	public UtilizadorRegistado remove(Object key) {

		try {
			String chave = (String) key;
			UtilizadorRegistado res = null;
			String sql = "DELETE FROM " + USER_S_T
					+ " WHERE us.seguidor = ? AND us.seguido = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setString(2, chave);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT seguido FROM " + USER_S_T
					+ " WHERE us.seguidor = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<UtilizadorRegistado> values() {

		try {
			Collection<UtilizadorRegistado> res = new ArrayList<UtilizadorRegistado>();
			String sql = "SELECT * FROM " + USER_S_T + " WHERE us.seguidor = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
			while (rs.next()) {
				res.add(u.get(rs.getString(SEGUIDO)));
			}
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}