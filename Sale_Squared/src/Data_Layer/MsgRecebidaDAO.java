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

import Business_Layer.Mensagem;

public class MsgRecebidaDAO implements Map<Integer, Mensagem> {

	// v. c.
	public static final String MENSAGEM_T = "Mensagem m";

	public static final int ID = 1;
	public static final int ASSUNTO = 2;
	public static final int CORPO = 3;
	public static final int DATA_ENVIO = 4;
	public static final int ESTADO = 5;
	public static final int EMISSOR = 6;
	public static final int RECEPTOR = 7;
	public static final int PERTENCE = 8;

	/*public static final String SIM = "S";
	public static final String NAO = "N";*/

	public static final int PERTENCE_E = 0;
	public static final int PERTENCE_R = 1;

	// v. i.
	private String username;

	// construtor
	public MsgRecebidaDAO(String usernameArg) {
		this.username = usernameArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.pertence = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_R);
			stm.execute();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) {

		try {
			Integer chave = (Integer) key;
			String sql = "SELECT id FROM " + MENSAGEM_T + " WHERE m.id = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, chave);
			ResultSet rs = stm.executeQuery();
			return rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Msg_Rec_containsValue não está implementado!");
	}

	public Set<Map.Entry<Integer, Mensagem>> entrySet() {
		throw new NullPointerException(
				"Msg_Rec_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Msg_Rec_equals não está implementado!");
	}

	public Mensagem get(Object key) {
		try {
			Integer chave = (Integer) key;
			Mensagem res = null;
			String sql = "SELECT * FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.id = ? ";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				//boolean lida = (rs.getString(LIDA).equals(SIM) ? true : false);
				GregorianCalendar dataEnvio = new GregorianCalendar();
				rs.getTimestamp(DATA_ENVIO, dataEnvio);
				UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
				res = new Mensagem(rs.getInt(ID), u.get(rs.getString(EMISSOR)),
						u.get(rs.getString(RECEPTOR)), dataEnvio,
						rs.getString(ASSUNTO), rs.getString(CORPO), rs.getInt(ESTADO));
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
			String sql = "SELECT id FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.pertence = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_R);
			ResultSet rs = stm.executeQuery();
			return !rs.next();
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Set<Integer> keySet() {

		try {
			Set<Integer> res = new TreeSet<Integer>();
			String sql = "SELECT id FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.pertence = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_R);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getInt(1));
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Mensagem put(Integer key, Mensagem value) {

		try {
			Mensagem res = null;
			boolean existe = this.containsKey(key);
			String sql;
			if (existe)
				sql = "UPDATE "
						+ MENSAGEM_T
						+ " SET m.id = ?, m.assunto = ?, m.corpo = ?, m.dataEnvio = ?, m.lida = ?, m.emissor = ?, m.receptor = ?, m.pertence = ? WHERE m.id = "
						+ key;
			else
				sql = "INSERT INTO " + MENSAGEM_T
						+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			//String estado = (value.getLida() ? SIM : NAO);
			Timestamp dataEnvio = new Timestamp(value.getDataEnvio()
					.getTimeInMillis());
			stm.setInt(ID, value.getId());
			stm.setString(ASSUNTO, value.getAssunto());
			stm.setString(CORPO, value.getCorpo());
			stm.setString(EMISSOR, value.getEmissor().getUsername());
			stm.setString(RECEPTOR, value.getReceptor().getUsername());
			stm.setInt(ESTADO, value.getEstado());
			stm.setTimestamp(DATA_ENVIO, dataEnvio);
			stm.setInt(PERTENCE, PERTENCE_R);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends Integer, ? extends Mensagem> t) {
		throw new NullPointerException("Msg_Rec_putAll não implementado!");
	}

	public Mensagem remove(Object key) {

		try {
			Mensagem res = null;
			Integer chave = (Integer) key;
			String sql = "DELETE FROM " + MENSAGEM_T + " WHERE m.id = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, chave);
			stm.execute();
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT id FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.pertence = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_R);
			ResultSet rs = stm.executeQuery();
			for (; rs.next(); i++)
				;
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<Mensagem> values() {
		try {
			Collection<Mensagem> res = new ArrayList<Mensagem>();
			String sql = "SELECT * FROM " + MENSAGEM_T
					+ " WHERE m.receptor = ? AND m.pertence = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, this.username);
			stm.setInt(2, PERTENCE_R);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Mensagem m = null;
				//boolean lida = (rs.getString(LIDA).equals(SIM) ? true : false);
				GregorianCalendar dataEnvio = new GregorianCalendar();
				rs.getTimestamp(DATA_ENVIO, dataEnvio);
				UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
				m = new Mensagem(rs.getInt(ID), u.get(rs.getString(EMISSOR)),
						u.get(rs.getString(RECEPTOR)), dataEnvio,
						rs.getString(ASSUNTO), rs.getString(CORPO), rs.getInt(ESTADO));
				res.add(m);
			}
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}