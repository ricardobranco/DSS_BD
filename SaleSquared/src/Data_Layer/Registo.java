package Data_Layer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Business_Layer.Utilizador;
import java.sql.Timestamp;
import java.util.GregorianCalendar;


public class Registo {

	// v. c.
	public static final String REGISTO_T = "Sistema s";
	public static final String UTILIZADOR_T = "Utilizador u";
        public static final String C_P_T = "CodigoPostal cp";
        public static final String LOC_T = "Localidade loc";
        public static final String PAIS_T = "Pais p" ;
        public static final String LOGIN_T = "Login l" ;
        public static final String VISITA_T = "VisitaAnuncio v" ;

	public static final String USER = "U";
	public static final String REGISTADO = "R";
        
        public static final int LOCALIDADE = 0;
	public static final int PAIS = 1;
        
        public static final int USERNAME = 1;
	public static final int DATA_LOGIN = 2;
        
        public static final int USERNAME_V = 1;
        public static final int ANUNCIO = 2;
	public static final int DATA_V = 3;


	// m. c.
	public static int registaIdMsg() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idMensagem FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idMensagem = s.idMensagem + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;                        
			return res;
		} catch (SQLException e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public static int registaIdImagem() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idImagem FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idImagem = s.idImagem + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (SQLException e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public static int registaIdTransac() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idTransaccao FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idTransaccao = s.idTransaccao + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public static int registaIdAnuncio() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idAnuncio FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idAnuncio = s.idAnuncio + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public static int registaIdAvaliacao() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idAvaliacao FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idAvaliacao = s.idAvaliacao + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
                

	public static int registaIdUtilizador() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idUtilizador FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			int res = -1;
			if (rs.next()) {
				res = rs.getInt(1);
				String sqlU = "UPDATE " + REGISTO_T
						+ " SET s.idUtilizador = s.idUtilizador + 1";
				/*
				 * String sqlUser = "INSERT INTO " + UTILIZADOR_T +
				 * " VALUES (?, ?)" ; PreparedStatement ps =
				 * ConexaoBD.getConexao().prepareStatement(sqlUser) ;
				 * ps.setInt(1, res) ; ps.execute() ; ps.setString(2, USER) ;
				 */
				stm.executeUpdate(sqlU);
			}
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

	public static int registaIdModoVenda() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idModoVenda FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idModoVenda = s.idModoVenda + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
        
        public static int registaIdPais() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idPais FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idPais = s.idPais + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}

        public static int registaIdLocalidade() {

		try {
			Statement stm = ConexaoBD.getConexao().createStatement();
			String sql = "SELECT idLocalidade FROM " + REGISTO_T;
			ResultSet rs = stm.executeQuery(sql);
			rs.next();
			int res = rs.getInt(1);
			String sqlU = "UPDATE " + REGISTO_T
					+ " SET s.idLocalidade = s.idLocalidade + 1";
			stm.executeUpdate(sqlU);
                        rs.close() ;
                        stm.close() ;
			return res;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
        
	public static void inserirUtilizador(Utilizador u) {

		try {
			String sql = "INSERT INTO " + UTILIZADOR_T + " VALUES (?, ?)";
			PreparedStatement stm = ConexaoBD.getConexao()
					.prepareStatement(sql);
			stm.setInt(1, u.getId());
			stm.setString(2, USER);
			stm.execute();
                       
                       stm.close() ;
		} catch (Exception e) {
			throw new NullPointerException(e.getMessage());
		}
	}
        
        public static void inserirPais(String pais) {
            
           try {
                String sql = "INSERT INTO " + PAIS_T + " VALUES (?, ?)" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);                
                stm.setInt(1, registaIdPais()) ;
                stm.setString(2, pais) ;
                stm.execute();  
                ConexaoBD.fecharCursor(null, stm);
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static boolean existePais(String pais) {
            
           try {
                String sql = "SELECT * FROM " + PAIS_T + " WHERE p.nome = ?" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, pais) ;
                ResultSet rs = stm.executeQuery();
                boolean res = rs.next();
                ConexaoBD.fecharCursor(rs, stm);
                return res ;                
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static int getPais(String pais) {
           
           int res = -1 ;
           try {
                String sql = "SELECT * FROM " + PAIS_T + " WHERE p.nome = ?" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, pais) ;
                ResultSet rs = stm.executeQuery();
                rs.next();
                res = rs.getInt(1) ;
                ConexaoBD.fecharCursor(rs, stm);
                return res ;                
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static int getLocalidade (String localidade) {
           
           int res = -1 ;
           try {
                String sql = "SELECT * FROM " + LOC_T + " WHERE loc.localidade = ?" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, localidade) ;
                ResultSet rs = stm.executeQuery();
                rs.next();
                res = rs.getInt(1) ;
                ConexaoBD.fecharCursor(rs, stm);
                return res ;                
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static boolean existeLocalidade(String localidade) {
            
           try {
                String sql = "SELECT * FROM " + LOC_T + " WHERE loc.localidade = ?" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, localidade) ;
                ResultSet rs = stm.executeQuery();                
                boolean res = rs.next();
                ConexaoBD.fecharCursor(rs, stm);
                return res ;
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static void inserirLocalidade(String localidade, String pais) {
            
           try {
                String sql = "INSERT INTO " + LOC_T + " VALUES (?, ?, ?)" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setInt(1, registaIdLocalidade()) ;
                stm.setString(2, localidade) ;
                stm.setInt(3, getPais(pais)) ;
                stm.execute();  
                ConexaoBD.fecharCursor(null, stm);
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static boolean existeCodPostal(String codPostal) {
            
           try {
                String sql = "SELECT * FROM " + C_P_T + " WHERE cp.codPostal = ?" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, codPostal) ;
                ResultSet rs = stm.executeQuery();                
                boolean res =  rs.next();
                ConexaoBD.fecharCursor(rs, stm);
                return res ;
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static void inserirCodPostal(String localidade, String codPostal) {
            
           try {
                String sql = "INSERT INTO " + C_P_T + " VALUES (?,?)" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
                stm.setString(1, codPostal) ;
                stm.setInt(2, getLocalidade(localidade)) ;
                stm.execute();
                ConexaoBD.fecharCursor(null, stm);
           } catch (Exception e) {
                throw new NullPointerException(e.getMessage());
		}
        }
        
        public static String[] determinarMorada (String codPostal) {
            
            try {
                String res[] = new String[2] ;
                String sql = "SELECT loc.localidade, p.nome FROM " + C_P_T + ", " + LOC_T + ", " + PAIS_T + " WHERE cp.codPostal = ? AND cp.localidade = loc.id AND loc.pais = p.id" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql) ;
                stm.setString(1, codPostal) ;
                ResultSet rs = stm.executeQuery() ;
                if(rs.next()) {
                    res[LOCALIDADE] = rs.getString(1) ;
                    res[PAIS] = rs.getString(2) ;
                }
                ConexaoBD.fecharCursor(rs, stm);
                return res ;
            } catch (Exception e) {throw new NullPointerException(e.getMessage());}
        }
        
        public static void validarMorada (String codPostal, String localidade, String pais) {
            
            try {
                if(existePais(pais) == false)
                    inserirPais(pais) ;
                if(existeLocalidade(localidade) == false)
                    inserirLocalidade(localidade, pais) ;
                if(existeCodPostal(codPostal) == false)
                    inserirCodPostal(localidade, codPostal) ;                
            } catch (Exception e) {throw new NullPointerException(e.getMessage());}
        }
        
        public static void adicionarLogin (String username, GregorianCalendar data) {
            
            try {
                String sql = "INSERT INTO " + LOGIN_T + " VALUES (?, ?)" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql) ;
                Timestamp ts = new Timestamp(data.getTimeInMillis()) ;
                stm.setString(USERNAME, username) ;
                stm.setTimestamp(DATA_LOGIN, ts);
            } catch (Exception e) {throw new NullPointerException(e.getMessage()) ;}
        }
        
        public static void adicionarVisitaAnuncio (String username, int anuncio, GregorianCalendar data) {
            
            try {
                String sql = "INSERT INTO " + VISITA_T + " VALUES (?, ?, ?)" ;
                PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql) ;
                Timestamp ts = new Timestamp(data.getTimeInMillis()) ;
                stm.setString(USERNAME_V, username) ;
                stm.setInt(ANUNCIO, anuncio) ;
                stm.setTimestamp(DATA_V, ts);
            } catch (Exception e) {throw new NullPointerException(e.getMessage()) ;}
        }

	/*
	 * public static void apagarHistoricoAnuncVis (int idUser) {
	 * 
	 * try { String sql = "DELETE FROM " +
	 * AnuncioVisitadoUtilizadorDAO.ANUNCIO_V_T + " WHERE anv.utilizador = ?" ;
	 * PreparedStatement stm = ConexaoBD.getConexao().prepareStatement(sql);
	 * stm.setInt(1, idUser) ; stm.execute(); } catch (Exception e) {throw new
	 * NullPointerException(e.getMessage());} }
	 */
}
