package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Categoria;


public class CategoriaDAO implements Map<String, Categoria> {

	// v. c.
	public static final String CATEGORIA_T = "Categoria cat";

	public static final int NOME = 1;
	public static final int PAI = 2;

	// construtor
	public CategoriaDAO() {
	}

	// interface Map
	public void clear() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "DELETE FROM " + CATEGORIA_T;
			stm.execute(sql);
                        ConexaoBD.fecharCursor(null, stm);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) {

		try {
			String chave = (String) key;
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT nome FROM " + CATEGORIA_T
					+ " WHERE cat.nome = '" + chave + "'";
			ResultSet rs = stm.executeQuery(sql);
			boolean res = rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Categoria_containsValue não está implementado!");
	}

	public Set<Map.Entry<String, Categoria>> entrySet() {
		throw new NullPointerException(
				"Categoria_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Categoria_equals não está implementado!");
	}

	public Categoria get(Object key) {

		try {
			String chave = (String) key;
			Categoria res = null;
			Statement stm = ConexaoBD.getConexao().createStatement();
			// String sql = "SELECT * FROM " + CATEGORIA_T +
			// " WHERE cat.nome = '" + chave + "'";
			// ResultSet rs = stm.executeQuery(sql);
			// if (rs.next()) {
			res = getAux(chave, stm);
			// }
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	private Categoria getAux(String chave, Statement stm) {

		try {
			String sql = "SELECT * FROM " + CATEGORIA_T + " WHERE cat.nome = '"
					+ chave + "'";
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				String nome = rs.getString(NOME), pai = rs.getString(PAI);
                                ConexaoBD.fecharCursor(rs, null);
				if (pai != null) 
					return new Categoria(nome, getAux(pai, stm));
				else
					return new Categoria(nome, null);
			} else {
                                ConexaoBD.fecharCursor(rs, null);
				return null;
                        }
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int hashCode() {
		return ConexaoBD.getConexao().hashCode();
	}

	public boolean isEmpty() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT nome FROM " + CATEGORIA_T);
			boolean res =  !rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<String> keySet() {

		try {
			Set<String> res = new TreeSet<String>();
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT nome FROM " + CATEGORIA_T);
			while (rs.next())
				res.add(rs.getString(1));
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Categoria put(String key, Categoria value) {

		try {
			Categoria res = null;
			String sql = "INSERT INTO " + CATEGORIA_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(NOME, key);
			stm.setString(PAI, (value.getCategoriaPai() != null ? value
					.getCategoriaPai().getNome() : null));
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends String, ? extends Categoria> t) {
		throw new NullPointerException(
				"Categoria_putALL não está implementado");
	}

	public Categoria remove(Object key) {

		try {
			Categoria res = null;
			String chave = (String) key;
			String sql = "DELETE FROM " + CATEGORIA_T + " WHERE cat.nome = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, chave);
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
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT nome FROM " + CATEGORIA_T);
			for (; rs.next(); i++)
				;
                        ConexaoBD.fecharCursor(rs, stm);
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Categoria> values() {

		try {
			Collection<Categoria> res = new ArrayList<Categoria>();
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM " + CATEGORIA_T);
			while (rs.next()) {
				Categoria c = this.get(rs.getString(NOME));
				res.add(c);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}