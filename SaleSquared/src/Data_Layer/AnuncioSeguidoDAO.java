package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Anuncio;


public class AnuncioSeguidoDAO implements Map<Integer, Anuncio> {

	// v. c.
	public static final String ANUNCIO_S_T = "AnuncioSeguido ans";

	public static final int USERNAME = 1;
	public static final int ANUNCIO = 2;

	// v. i.
	private String username;

	// construtor
	public AnuncioSeguidoDAO(String usernameArg) {
		this.username = usernameArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) throws NullPointerException {

		try {
			Integer chave = (Integer) key;
			String sql = "SELECT * FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ? AND ans.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, chave);
			ResultSet rs = stm.executeQuery();
			boolean res = rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Anuncio_Seguido_containsValue não está implementado!");
	}

	public Set<Map.Entry<Integer, Anuncio>> entrySet() {
		throw new NullPointerException(
				"Anuncio_Seguido_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Anuncio_Seguido_equals não está implementado!");
	}

	public Anuncio get(Object key) {

		try {
			Anuncio res = null;
			Integer chave = (Integer) key;
			String sql = "SELECT * FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ? AND ans.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				AnuncioDAO a = new AnuncioDAO();
				res = a.get(rs.getInt(ANUNCIO));
			}
                        ConexaoBD.fecharCursor(rs, stm);
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
			String sql = "SELECT * FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			boolean res =  !rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<Integer> keySet() {

		try {
			Set<Integer> res = new TreeSet<Integer>();
			String sql = "SELECT anuncio FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getInt(1));
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Anuncio put(Integer key, Anuncio value) {

		try {
			Anuncio res = null;
			String sql = "INSERT INTO " + ANUNCIO_S_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(USERNAME, this.username);
			stm.setInt(ANUNCIO, value.getCodigo());
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends Integer, ? extends Anuncio> t) {
		throw new NullPointerException(
				"Anuncio_Seguido_putAll não está implementado!");
	}

	public Anuncio remove(Object key) {

		try {
			Anuncio res = null;
			Integer chave = (Integer) key;
			String sql = "DELETE FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ? AND ans.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, chave);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT anuncio FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
                        ConexaoBD.fecharCursor(rs, stm);
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Anuncio> values() {

		try {
			Collection<Anuncio> res = new ArrayList<Anuncio>();
			String sql = "SELECT * FROM " + ANUNCIO_S_T
					+ " WHERE ans.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			ResultSet rs = stm.executeQuery();
			AnuncioDAO aDao = new AnuncioDAO();
			while (rs.next()) {
				Anuncio a = aDao.get(rs.getInt(ANUNCIO));
				res.add(a);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}