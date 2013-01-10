package Data_Layer;

//import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Imagem;
import Business_Layer.UtilizadorRegistado;

//import javax.swing.ImageIcon;


public class UtilizadorRegistadoDAO implements Map<String, UtilizadorRegistado> {

	// v. c.
	public static final String U_R_T = "UtilizadorRegistado ur";
        public static final String C_P_T = "CodigoPostal cp";
        public static final String LOC_T = "Localidade loc";
        public static final String PAIS_T = "Pais p" ;

	public static final int ID = 1;
	public static final int USERNAME = 2;
	public static final int PASSWORD = 3;
	public static final int ESTADO = 4;
	public static final int EMAIL = 5;
	public static final int MORADA = 6;
	public static final int COD_POSTAL = 7;	
	public static final int INFORMACAO_P = 8;
	public static final int IMAGEM = 9;
	public static final int CONTACTO = 10;
	public static final int NOME = 11;
	public static final int DATA_NASC = 12;
	public static final int NOME_IMAGEM = 13;
        public static final int DATA_REG = 14 ;
        
        public static final int LOCALIDADE = 0;
	public static final int PAIS = 1;

	/*
	 * public static final String NORMAL = "N" ; public static final String
	 * BANIDO = "B" ; public static final String PROIBIDO_ANUNC = "P" ; public
	 * static final String REPORTADO = "R" ;
	 */

	// construtor
	public UtilizadorRegistadoDAO() {
	}

	// interface Map
	public void clear() {
		throw new NullPointerException("U_R_clear não está implementado!");
	}

	public boolean containsKey(Object key) {

		try {
			String chave = (String) key;
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT username FROM " + U_R_T
					+ " WHERE ur.username = '" + chave + "'";
			ResultSet rs = stm.executeQuery(sql);
			boolean res = rs.next();
                        ConexaoBD.fecharCursor(rs, stm);
                        return res ;
		} catch (Exception e) {throw new NullPointerException(e.getMessage());}
	}

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"U_R_containsValue não está implementado!");
	}

	public Set<Map.Entry<String, UtilizadorRegistado>> entrySet() {
		throw new NullPointerException("U_R_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException("U_R_equals não está implementado");
	}
        
        

	public UtilizadorRegistado get(Object key) {
		try {
			String chave = (String) key;
			UtilizadorRegistado res = null;
			String sql = "SELECT * FROM " + U_R_T + " WHERE ur.username = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setString(1, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				int estado = rs.getInt(ESTADO); 
				GregorianCalendar dataNasc = new GregorianCalendar(), dataRegisto = new GregorianCalendar();
				rs.getTimestamp(DATA_NASC, dataNasc);
                                rs.getTimestamp(DATA_REG, dataRegisto) ;
				Imagem pathImg = receberImagem(rs);
                                String locPais[] = {"", ""} ;
                                if(rs.getString(COD_POSTAL) != null) 
                                    locPais = Registo.determinarMorada(rs.getString(COD_POSTAL)) ;
				res = new UtilizadorRegistado(rs.getInt(ID),
						rs.getString(USERNAME), rs.getString(PASSWORD), estado,
						rs.getString(EMAIL), rs.getString(MORADA),
						rs.getString(COD_POSTAL), locPais[LOCALIDADE],
						locPais[PAIS], rs.getString(INFORMACAO_P),
						pathImg, rs.getString(CONTACTO), rs.getString(NOME),
						dataNasc, dataRegisto);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	private Imagem receberImagem(ResultSet rs) {

		try {
			if (rs.getBlob(IMAGEM) == null)
				return new Imagem("", "");
			String res = ConexaoBD.pathImagem + "/"
					+ rs.getString(NOME_IMAGEM);
			File f = new File(res);
			if (f.exists())
				f.delete();
			f.createNewFile();
			Blob b = rs.getBlob(IMAGEM);
			byte bytes[] = new byte[(int) b.length()];
			FileOutputStream fos = new FileOutputStream(f);
			b.getBinaryStream().read(bytes);
			fos.write(bytes);
			return new Imagem(rs.getString(NOME_IMAGEM), res);
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
			ResultSet rs = stm.executeQuery("SELECT username FROM " + U_R_T);
			boolean res = !rs.next();
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
			ResultSet rs = stm.executeQuery("SELECT username FROM " + U_R_T);
			while (rs.next())
				res.add(rs.getString(1));
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}    

	public UtilizadorRegistado put(String key, UtilizadorRegistado value) {

		try {
			UtilizadorRegistado res = null;
			boolean existe = this.containsKey(key);
			String sql;
			if (existe)
				sql = "UPDATE "
						+ U_R_T
						+ " SET ur.id = ?, ur.username = ?, ur.password = ?, ur.estado = ?, ur.email = ?, ur.morada = ?, ur.codPostal = ?, ur.infPessoal = ?, ur.imagem = ?, ur.contacto = ?, ur.nome = ?, ur.dataNasc = ?, ur.nomeImagem = ? WHERE ur.username = '"
						+ key + "'";
			else
				sql = "INSERT INTO "
						+ U_R_T
						+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			File f = new File(value.getImagem().getPath());
			Timestamp dataNasc = new Timestamp(value.getDataNasc()
					.getTimeInMillis());
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			int estado = value.getEstado(); 
                        Registo.validarMorada(value.getCodPostal(), value.getLocalidade(), value.getPais()) ;
			stm.setInt(ID, value.getId());
			stm.setString(USERNAME, value.getUsername());
			stm.setString(PASSWORD, value.getPassword());
			stm.setInt(ESTADO, estado);
			stm.setString(EMAIL, value.getEmail());
			stm.setString(MORADA, value.getMorada());
			stm.setString(COD_POSTAL, value.getCodPostal());
			stm.setString(INFORMACAO_P, value.getInfPessoal());
			if (f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				/*
				 * byte b[] = new byte[fis.available()] ; fis.read(b); Blob bl =
				 * ConexaoBD.getConexao().createBlob() ; bl.setBytes(1, b);
				 */
				stm.setBlob(IMAGEM, fis);
				stm.setString(NOME_IMAGEM, value.getImagem().getNome());
			} else {
				stm.setBlob(IMAGEM, (Blob) null);
				stm.setString(NOME_IMAGEM, "");
			}
			stm.setString(CONTACTO, value.getContacto());
			stm.setString(NOME, value.getNome());
			stm.setTimestamp(DATA_NASC, dataNasc);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends String, ? extends UtilizadorRegistado> t) {
		throw new NullPointerException("U_R_putAll não está implementado!");
	}

	public UtilizadorRegistado remove(Object key) {
		throw new NullPointerException("U_R_remove não está implementado!");
	}

	public int size() {
		try {
			int i = 0;
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT username FROM " + U_R_T);
			for (; rs.next(); i++)
				;
                        ConexaoBD.fecharCursor(rs, stm);
			return i;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Collection<UtilizadorRegistado> values() {
		try {
			Collection<UtilizadorRegistado> res = new ArrayList<UtilizadorRegistado>();
			Statement stm = ConexaoBD.getConexao().createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM " + U_R_T);
			while (rs.next()) {
				UtilizadorRegistado u = null;
				int estado = rs.getInt(ESTADO); 
				GregorianCalendar dataNasc = new GregorianCalendar(), dataRegisto = new GregorianCalendar();
				rs.getTimestamp(DATA_NASC, dataNasc);
                                rs.getTimestamp(DATA_REG, dataRegisto) ;
				Imagem pathImg = receberImagem(rs);
                                String locPais[] = {"", ""} ;
                                if(rs.getString(COD_POSTAL) != null) 
                                    locPais = Registo.determinarMorada(rs.getString(COD_POSTAL)) ;
				u = new UtilizadorRegistado(rs.getInt(ID),
						rs.getString(USERNAME), rs.getString(PASSWORD), estado,
						rs.getString(EMAIL), rs.getString(MORADA),
						rs.getString(COD_POSTAL), locPais[LOCALIDADE],
						locPais[PAIS], rs.getString(INFORMACAO_P),
						pathImg, rs.getString(CONTACTO), rs.getString(NOME),
						dataNasc, dataRegisto);
				res.add(u);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}