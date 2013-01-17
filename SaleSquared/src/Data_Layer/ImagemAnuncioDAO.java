package Data_Layer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Business_Layer.Imagem;


public class ImagemAnuncioDAO implements Map<String, Imagem> {

	// v. c.
	public static final String IMAGEM_T = "ImagemAnuncio img";

	public static final int ANUNCIO = 1;
	public static final int IMAGEM = 2;
	public static final int NOME = 3;

	// v. i.
	private int codAnunc;

	// construtor
	public ImagemAnuncioDAO(int codAnuncArg) {
		this.codAnunc = codAnuncArg;
	}

	// interface Map
	public void clear() {

		try {
			String sql = "DELETE FROM " + IMAGEM_T + " WHERE img.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public boolean containsKey(Object key) {

		try {
			String chave = (String) key;
			String sql = "SELECT nome FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ? AND img.nome = ?";
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

	public boolean containsValue(Object value) {
		throw new NullPointerException(
				"Imagem_Anuncio_containsValue não está implementado!");
	}

	public Set<Map.Entry<String, Imagem>> entrySet() {
		throw new NullPointerException(
				"Imagem_Anuncio_entrySet não está implementado!");
	}

	public boolean equals(Object o) {
		throw new NullPointerException(
				"Imagem_Anuncio_equals não está implementado!");
	}

	public Imagem get(Object key) {

		try {
			Imagem res = null;
			String chave = (String) key;
			String sql = "SELECT * FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ? AND img.nome = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			stm.setString(2, chave);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				Blob b = rs.getBlob(IMAGEM);
				File f = new File(ConexaoBD.pathImagem + "/"
						+ rs.getString(NOME));
				if (f.exists())
					f.delete();
				f.createNewFile();
				@SuppressWarnings("resource")
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(b.getBytes(1, (int) b.length()));
				res = new Imagem(rs.getString(NOME), ConexaoBD.pathImagem
						+ "/" + rs.getString(NOME));
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
			String sql = "SELECT nome FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ?";
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

	public Set<String> keySet() {

		try {
			Set<String> res = new TreeSet<String>();
			String sql = "SELECT nome FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next())
				res.add(rs.getString(1));
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public Imagem put(String key, Imagem value) {

		try {
                    File f = new File(value.getPath());
                    if(f.exists() == false)
                        return null ;
			Imagem res = null;
			String sql = "INSERT INTO " + IMAGEM_T + " VALUES (?, ?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(ANUNCIO, this.codAnunc);
			stm.setString(NOME, key);
			FileInputStream fis = new FileInputStream(f);
			stm.setBlob(IMAGEM, fis);
			stm.execute();
                        ConexaoBD.fecharCursor(null, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public void putAll(Map<? extends String, ? extends Imagem> t) {
		throw new NullPointerException(
				"Imagem_Anuncio_putAll não está implementado!");
	}

	public Imagem remove(Object key) {

		try {
			String chave = (String) key;
			Imagem res = null;
			String sql = "DELETE FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ? AND img.nome = ?";
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

	public int size() {

		try {
			int i = 0;
			String sql = "SELECT nome FROM " + IMAGEM_T
					+ " WHERE img.anuncio = ?";
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

	public Collection<Imagem> values() {

		try {
			Collection<Imagem> res = new ArrayList<Imagem>();
			String sql = "SELECT * FROM " + IMAGEM_T + " WHERE img.anuncio = ?";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, this.codAnunc);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Imagem i = null;
				Blob b = rs.getBlob(IMAGEM);
				File f = new File(ConexaoBD.pathImagem + "/"
						+ rs.getString(NOME));
				if (f.exists())
					f.delete();
				f.createNewFile();
				@SuppressWarnings("resource")
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(b.getBytes(1, (int) b.length()));
				i = new Imagem(rs.getString(NOME), ConexaoBD.pathImagem + "/"
						+ rs.getString(NOME));
				res.add(i);
			}
                        ConexaoBD.fecharCursor(rs, stm);
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}