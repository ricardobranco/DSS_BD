package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Anuncio;


public class RespostaAnuncioCompraDAO implements Map<Integer, Anuncio> {

	// v. c.
	public static final String RESPOSTA_A_T = "RespostaAnuncio ra";

	public static final int ANUNCIO = 2;
	public static final int RESPOSTA = 1;

	// v. i.
	private int codAnunc;

	// construtor
	public RespostaAnuncioCompraDAO(int codAnuncArg) {
		this.codAnunc = codAnuncArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.execute();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) throws NullPointerException {

		try {
			Integer chave = (Integer) key;
			String sql = "SELECT * FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ? AND ra.resposta = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setInt(2, chave);
			ResultSet rs = stm.executeQuery();
			return rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Resposta_Anuncio_containsValue não está implementado!");
	}

	public Set<Map.Entry<Integer, Anuncio>> entrySet() {
		throw new NullPointerException(
				"Resposta_Anuncio_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Resposta_Anuncio_equals não está implementado!");
	}

	public Anuncio get(Object key) {

		try {
			Anuncio res = null;
			Integer chave = (Integer) key;
			String sql = "SELECT * FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ? AND ra.resposta = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setInt(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				AnuncioDAO a = new AnuncioDAO();
				res = a.get(rs.getInt(ANUNCIO));
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
			String sql = "SELECT * FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			return !rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<Integer> keySet() {

		try {
			Set<Integer> res = new TreeSet<Integer>();
			String sql = "SELECT anuncio FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getInt(1));
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Anuncio put(Integer key, Anuncio value) {

		try {
			Anuncio res = null;
			String sql = "INSERT INTO " + RESPOSTA_A_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(ANUNCIO, this.codAnunc);
			stm.setInt(RESPOSTA, key);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends Integer, ? extends Anuncio> t) {
		throw new NullPointerException(
				"Resposta_Anuncio_putAll não está implementado!");
	}

	public Anuncio remove(Object key) {

		try {
			Integer chave = (Integer) key;
			Anuncio res = null;
			String sql = "DELETE FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ? AND ra.resposta = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setInt(2, chave);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT resposta FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Anuncio> values() {

		try {
			Collection<Anuncio> res = new ArrayList<Anuncio>();
			String sql = "SELECT * FROM " + RESPOSTA_A_T
					+ " WHERE ra.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			AnuncioDAO aDao = new AnuncioDAO();
			while (rs.next()) {
				Anuncio a = aDao.get(rs.getInt(RESPOSTA));
				res.add(a);
			}
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}