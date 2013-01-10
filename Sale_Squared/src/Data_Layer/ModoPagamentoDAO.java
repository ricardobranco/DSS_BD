package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ModoPagamentoDAO implements Set<String> {

	// v. c.
	public static final String MODO_P_T = "ModoPagamento mp";

	public static final int ANUNCIO = 1;
	public static final int MODO_PAGAMENTO = 2;

	// v. i.
	private int codAnunc;

	// construtor
	public ModoPagamentoDAO(int codAnuncArg) {
		this.codAnunc = codAnuncArg;
	}

	// interface Set
	public boolean add(String s) {

		try {
			boolean res = true;
			String sql = "INSERT INTO " + MODO_P_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(ANUNCIO, this.codAnunc);
			stm.setString(MODO_PAGAMENTO, s);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean addAll(Collection<? extends String> c) {
		throw new NullPointerException("Modo_P_addAll não está implementado!");
	}

	public void clear() {

		try {
			String sql = "DELETE FROM " + MODO_P_T + " WHERE mp.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean contains(Object o) {

		try {
			String chave = (String) o;
			String sql = "SELECT * FROM " + MODO_P_T
					+ " WHERE mp.anuncio = ? AND mp.modoPagamento = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			boolean res =  rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsAll(Collection<?> c) {
		throw new NullPointerException(
				"Modo_P_containsAll não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException("Modo_P_equals não está implementado!");
	}

	public int hashCode() {
		return ConexaoBD.getConexao().hashCode();
	}

	public boolean isEmpty() {

		try {
			String sql = "SELECT * FROM " + MODO_P_T + " WHERE mp.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			boolean res = !rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Iterator<String> iterator() {

		try {
			TreeSet<String> res = new TreeSet<String>();
			String sql = "SELECT * FROM " + MODO_P_T + " WHERE mp.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getString(MODO_PAGAMENTO));
                        ConexaoBD.fecharCursor(rs, stm);
			return res.iterator();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean remove(Object key) {

		try {
			boolean res = false;
			String chave = (String) key;
			String sql = "DELETE FROM " + MODO_P_T
					+ " WHERE mp.anuncio = ? AND mp.modoPagamento = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean removeAll(Collection<?> c) {
		throw new NullPointerException(
				"Modo_P_removeAll não está implementado!");
	}

	public boolean retainAll(Collection<?> c) {
		throw new NullPointerException(
				"Modo_P_retainAll não está implementado!");
	}

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT * FROM " + MODO_P_T + " WHERE mp.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
                        ConexaoBD.fecharCursor(rs, stm);
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Object[] toArray() {
		throw new NullPointerException(
				"Modo_P_toArray não está implementado!");
	}

	@SuppressWarnings("hiding")
	public <String> String[] toArray(String[] a) {
		throw new NullPointerException(
				"Modo_P_toArray não está implementado!");
	}
}
