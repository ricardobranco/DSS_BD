package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Transaccao;
import Business_Layer.Troca;


public class TransaccaoDAO implements Map<Integer, Transaccao> {

	// v. c.
	public static final String TRANSACCAO_T = "Transaccao tra";
	public static final String TROCA_T = "Troca tro";

	public static final int ID = 1, ID_T = 1;
	public static final int DATA = 2, ANUNCIO_T = 2;
	public static final int VALOR = 3;
	public static final int MODO_PAGAMENTO = 4;
	public static final int MORADA_FACT = 5;
	public static final int COD_POSTAL_FACT = 6;
	//public static final int LOCALIDADE_FACT = 7;
	//public static final int PAIS_FACT = 8;
	public static final int ESTADO = 7;
	public static final int QUANTIDADE = 8;
	public static final int ANUNCIO = 9;
	public static final int COMPRADOR = 10;
	public static final int VENDEDOR = 11;
	public static final int TIPO = 12;
	public static final int PERTENCE = 13;

	public static final String TRANSACCAO = "A";
	public static final String TROCA = "O";

	public static final int PERTENCE_V = 0;
	public static final int PERTENCE_C = 1;
        
        public static final int LOCALIDADE = 0;
	public static final int PAIS = 1;

	// v. i.
	private String username;

	// construtor
	public TransaccaoDAO(String usernameArg) {
		this.username = usernameArg;
	}

	// interface Map
	public void clear() {
		throw new NullPointerException(
				"Transaccao_clear não está implementado!");
	}

	public boolean containsKey(Object key) {

		try {
			Integer chave = (Integer) key;
			String sql = "SELECT * FROM " + TRANSACCAO_T + " WHERE tra.id = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, chave);
			ResultSet rs = stm.executeQuery();
			boolean res =  rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Transaccao_containsValue não está implementado!");
	}

	public Set<Map.Entry<Integer, Transaccao>> entrySet() {
		throw new NullPointerException(
				"Transaccao_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Transaccao_equals não está implementado!");
	}

	public Transaccao get(Object key) {

		try {
			Integer chave = (int) key;
			Transaccao res = null;
			String sql = "SELECT * FROM " + TRANSACCAO_T + " WHERE tra.id = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
				AnuncioDAO a = new AnuncioDAO();
				String tipo = rs.getString(TIPO);
				GregorianCalendar data = new GregorianCalendar();
				rs.getTimestamp(DATA, data);
                                String locPais[] = Registo.determinarMorada(rs.getString(COD_POSTAL_FACT)) ;
				if (tipo.equals(TROCA)) {
					String sqlT = "SELECT * FROM " + TROCA_T
							+ " WHERE tro.id = ?";
					PreparedStatement stmT = ConexaoBD.getConexao()
							.prepareStatement(sqlT);
					stmT.setInt(1, chave);
					ResultSet rsT = stmT.executeQuery();
					rsT.next();                                        
					res = new Troca(a.get(rsT.getInt(ANUNCIO_T)), a.get(rs
							.getInt(ANUNCIO)), u.get(rs.getString(VENDEDOR)),
							u.get(rs.getString(COMPRADOR)), chave, data,
							rs.getDouble(VALOR), rs.getString(MODO_PAGAMENTO),
							rs.getString(MORADA_FACT),
							rs.getString(COD_POSTAL_FACT),
							locPais[LOCALIDADE],
							locPais[PAIS], (char) rs.getInt(ESTADO),
							rs.getInt(QUANTIDADE));
                                        ConexaoBD.fecharCursor(rsT, stmT);
				} else
					res = new Transaccao(a.get(rs.getInt(ANUNCIO)), u.get(rs
							.getString(VENDEDOR)), u.get(rs
							.getString(COMPRADOR)), chave, data,
							rs.getDouble(VALOR), rs.getString(MODO_PAGAMENTO),
							rs.getString(MORADA_FACT),
							rs.getString(COD_POSTAL_FACT),
							locPais[LOCALIDADE],
							locPais[PAIS], (char) rs.getInt(ESTADO),
							rs.getInt(QUANTIDADE));
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
			String sql = "SELECT id FROM " + TRANSACCAO_T
					+ " WHERE tra.vendedor = ? OR tra.comprador = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setString(2, this.username);
			ResultSet rs = stm.executeQuery();
			boolean res = !rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<Integer> keySet() {

		try {
			Set<Integer> res = new TreeSet<Integer>();
			String sql = "SELECT id FROM "
					+ TRANSACCAO_T
					+ " WHERE (tra.vendedor = ? AND tra.pertence = ?) OR (tra.comprador = ? AND tra.pertence = ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_V);
			stm.setString(3, this.username);
			stm.setInt(4, PERTENCE_C);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getInt(1));
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Transaccao put(Integer key, Transaccao value) {

		try {
			Transaccao res = null;
			boolean existe = this.containsKey(key);
			String sql;
			if (existe) {
				sql = "UPDATE "
						+ TRANSACCAO_T
						+ " SET tra.id = ?, tra.data = ?, tra.valor = ?, tra.modoPagamento = ?, tra.moradaFact = ?, tra.codPostalFact = ?, tra.estado = ?, tra.quantidade = ?, tra.anuncio = ?, tra.comprador = ?, tra.vendedor = ?, tra.tipo = ?, tra.pertence = ? WHERE tra.id = "
						+ key;
			} else
				sql = "INSERT INTO "
						+ TRANSACCAO_T
						+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			Timestamp t = new Timestamp(value.getData().getTimeInMillis());
                        Registo.validarMorada(value.getCodPostalFact(), value.getLocalidadeFact(), value.getPaisFact()) ;
			int pertence = (this.username.equals(value.getVendedor()
					.getUsername()) ? PERTENCE_V : PERTENCE_C);
			stm.setInt(ID, key);
			stm.setTimestamp(DATA, t);
			stm.setDouble(VALOR, value.getValor());
			stm.setString(MODO_PAGAMENTO, value.getModoPagamento());
			stm.setString(MORADA_FACT, value.getMorada());
			stm.setString(COD_POSTAL_FACT, value.getCodPostalFact());			
			stm.setInt(ESTADO, value.getEstado());
			stm.setInt(QUANTIDADE, value.getQuantidade());
			stm.setInt(ANUNCIO, value.getAnuncio().getCodigo());
			stm.setString(COMPRADOR, value.getComprador().getUsername());
			stm.setString(VENDEDOR, value.getVendedor().getUsername());
			stm.setInt(PERTENCE, pertence);
			if (value.getClass().getName().equals(Troca.class.getName())) {
				Troca troca = (Troca) value;
				String sqlTro;
				if (existe)
					sqlTro = "UPDATE "
							+ TROCA_T
							+ " SET tro.id = ?, tro. anuncio = ? WHERE tro.id = "
							+ key;
				else
					sqlTro = "INSERT INTO " + TROCA_T + " VALUES (?, ?)";
				PreparedStatement stmTro = ConexaoBD.getConexao()
						.prepareStatement(sqlTro);
				stmTro.setInt(ID_T, key);
				stmTro.setInt(ANUNCIO_T, troca.getAnuncioComp().getCodigo());
				stm.setString(TIPO, TROCA);
				stm.execute();
				stmTro.execute();
                                ConexaoBD.fecharCursor(null, stmTro);
			} else {
				stm.setString(TIPO, TRANSACCAO);
				stm.execute();
			}
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends Integer, ? extends Transaccao> t) {
		throw new NullPointerException(
				"Transaccao_putAll não está implementado!");
	}

	public Transaccao remove(Object key) {
		throw new NullPointerException(
				"Transaccao_remove não está implementado!");
	}

	public int size() {
		try {
			int i = 0;
			String sql = "SELECT id FROM "
					+ TRANSACCAO_T
					+ " WHERE (tra.vendedor = ? AND tra.pertence = ?) OR (tra.comprador = ? AND tra.pertence = ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_V);
			stm.setString(3, this.username);
			stm.setInt(4, PERTENCE_C);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
                        ConexaoBD.fecharCursor(rs, stm);
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Transaccao> values() {

		try {
			Collection<Transaccao> res = new ArrayList<Transaccao>();
			String sql = "SELECT * FROM "
					+ TRANSACCAO_T
					+ " WHERE (tra.vendedor = ? AND tra.pertence = ?) OR (tra.comprador = ? AND tra.pertence = ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_V);
			stm.setString(3, this.username);
			stm.setInt(4, PERTENCE_C);
			ResultSet rs = stm.executeQuery();
			UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
			AnuncioDAO a = new AnuncioDAO();
			while (rs.next()) {
				Transaccao t = null;
				String tipo = rs.getString(TIPO);
				GregorianCalendar data = new GregorianCalendar();
				int chave = rs.getInt(ID);
				rs.getTimestamp(DATA, data);
                                String locPais[] = Registo.determinarMorada(rs.getString(COD_POSTAL_FACT)) ;
				if (tipo.equals(TROCA)) {
					String sqlT = "SELECT * FROM " + TROCA_T
							+ " WHERE tro.id = ?";
					PreparedStatement stmT = ConexaoBD.getConexao()
							.prepareStatement(sqlT);
					stmT.setInt(1, chave);
					ResultSet rsT = stmT.executeQuery();
					rsT.next();
					t = new Troca(a.get(rsT.getInt(ANUNCIO_T)), a.get(rs
							.getInt(ANUNCIO)), u.get(rs.getString(VENDEDOR)),
							u.get(rs.getString(COMPRADOR)), chave, data,
							rs.getDouble(VALOR), rs.getString(MODO_PAGAMENTO),
							rs.getString(MORADA_FACT),
							rs.getString(COD_POSTAL_FACT),
							locPais[LOCALIDADE],
							locPais[PAIS], 
                                                        (char) rs.getInt(ESTADO),
							rs.getInt(QUANTIDADE));
                                        ConexaoBD.fecharCursor(rsT, stmT);
				} else
					t = new Transaccao(a.get(rs.getInt(ANUNCIO)), u.get(rs
							.getString(VENDEDOR)), u.get(rs
							.getString(COMPRADOR)), chave, data,
							rs.getDouble(VALOR), rs.getString(MODO_PAGAMENTO),
							rs.getString(MORADA_FACT),
							rs.getString(COD_POSTAL_FACT),
							locPais[LOCALIDADE],
							locPais[PAIS], (char) rs.getInt(ESTADO),
							rs.getInt(QUANTIDADE));
				res.add(t);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}