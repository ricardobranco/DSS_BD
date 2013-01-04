package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Tag;

public class TagAnuncioDAO implements Map<String, Tag> {

	// v. c.
	public static final String TAG_T = "TagAnuncio tg";

	public static final int ANUNCIO = 1;
	public static final int TAG = 2;

	// v. i.
	private int codAnunc;

	// construtor
	public TagAnuncioDAO(int codAnuncArg) {
		this.codAnunc = codAnuncArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + TAG_T + " WHERE tg.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.execute();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) {

		try {
			String chave = (String) key;
			String sql = "SELECT * FROM " + TAG_T
					+ " WHERE tg.anuncio = ? AND tg.tag = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			return rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Tag_Anuncio_containsValue não está implementado!");
	}

	public Set<Map.Entry<String, Tag>> entrySet() {
		throw new NullPointerException(
				"Tag_Anuncio_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Tag_Anuncio_equals não está implementado!");
	}

	public Tag get(Object key) {

		try {
			Tag res = null;
			String chave = (String) key;
			String sql = "SELECT * FROM " + TAG_T
					+ " WHERE tg.anuncio = ? AND tg.tag = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				res = new Tag(rs.getString(TAG));
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
			String sql = "SELECT * FROM " + TAG_T + " WHERE tg.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			return !rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<String> keySet() {

		try {
			Set<String> res = new TreeSet<String>();
			String sql = "SELECT * FROM " + TAG_T + " WHERE tg.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getString(TAG));
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Tag put(String key, Tag value) {

		try {
			Tag res = null;
			String sql = "INSERT INTO " + TAG_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(ANUNCIO, this.codAnunc);
			stm.setString(TAG, key);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends String, ? extends Tag> t) {
		throw new NullPointerException("Tag_putAll não está implementado!");
	}

	public Tag remove(Object key) {

		try {
			Tag res = null;
			String chave = (String) key;
			String sql = "DELETE FROM " + TAG_T
					+ " WHERE tg.anuncio = ? AND tg.tag = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int size() {

		try {
			int res = 0;
			String sql = "SELECT * FROM " + TAG_T + " WHERE tg.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res++;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Tag> values() {

		try {
			Collection<Tag> res = new ArrayList<Tag>();
			String sql = "SELECT * FROM " + TAG_T + " WHERE tg.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(new Tag(rs.getString(TAG)));
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}
