package Data_Layer;

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

import Business_Layer.Anuncio;
import Business_Layer.AnuncioCompra;
import Business_Layer.AnuncioVenda;
import Business_Layer.Leilao;
import Business_Layer.ModoVenda;
import Business_Layer.VendaDirecta;

public class AnuncioDAO implements Map<Integer, Anuncio> {

    // v. c.
    public static final String ANUNCIO_T = "Anuncio a";
    public static final String ANUNCIO_V_T = "AnuncioVenda av";
    public static final String ANUNCIO_C_T = "AnuncioCompra ac";
    public static final String MODO_VENDA_T = "ModoVenda mv";
    public static final String LEILAO_T = "Leilao l";
    public static final String VENDA_DIRECTA_T = "VendaDirecta vd";
    public static final String COMPRA = "C";
    public static final String VENDA = "V";
    public static final String LEILAO = "L";
    public static final String VENDA_DIRECTA = "D";
    public static final String NOVO = "N";
    public static final String USADO = "U";

    /*
     * public static final String ABERTO = "A" ; public static final String
     * BLOQUEADO = "B" ; public static final String ENCERRADO = "E" ;
     */
    public static final String SIM = "S";
    public static final String NAO = "N";
    public static final int ID = 1, ID_V = 1, ID_C = 1, ID_M_V = 1, ID_L = 1,
            ID_V_D = 1;
    public static final int TITULO = 2, ENVIO_E = 2, TIPO_M_V = 2,
            PRECO_BASE = 2, N_PROPOSTAS = 2, PRECO_SUGERIDO = 2;
    public static final int DATA_INS = 3, COND_E = 3, PRECO_ACTUAL = 3, PRECO_V_D = 3;
    public static final int DATA_EXP = 4, PRECO_E = 4, N_LICITACOES = 4;
    public static final int SEGURO = 5, DATA_FIM = 5;
    public static final int DESCRICAO = 5, METODO_E = 6;
    public static final int INC_MINIMO = 6;
    public static final int QUANTIDADE = 6, PROPOSTA_T = 7;
    public static final int /*N_VISITAS = 7,*/ MODO_V = 8;
    public static final int ESTADO_PROD = 7;
    public static final int ESTADO_ANUNC = 8;
    public static final int ANUNCIANTE = 9;
    public static final int TIPO_A = 10;

    // construtor
    public AnuncioDAO() {
    }

    // interface Map
    public void clear() {
        throw new NullPointerException("clear não está implementado!");
    }

    /*
     * public void clear () { try { Statement stm =
     * ConexaoBD.getConexao().createStatement();
     * stm.executeUpdate("DELETE FROM " + ANUNCIO_T); } catch (Exception e)
     * {throw new NullPointerException(e.getMessage());} }
     */
    public boolean containsKey(Object key) {

        try {
            Integer chave = (Integer) key;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT id FROM " + ANUNCIO_T + " WHERE a.id = "
                    + chave;
            ResultSet rs = stm.executeQuery(sql);
            boolean res = rs.next() ;
            rs.close();
            stm.close() ;
            return res ;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
    }

    public boolean containsValue(Object value) {
        throw new NullPointerException(
                "método containsValue não está implementado!");
    }

    public Set<Map.Entry<Integer, Anuncio>> entrySet() {
        throw new NullPointerException(
                "método entrySet não está implementado!");
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public Anuncio get(Object key) {

        Anuncio res = null;
        try {
            Integer chave = (Integer) key;
            ModoVenda mv = null;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT * FROM " + ANUNCIO_T + " WHERE a.id = "
                    + chave;
            ResultSet rs = stm.executeQuery(sql);
            // int b = rs.getMetaData().getColumnCount() ;
            if (rs.next()) {
                GregorianCalendar dataInser = new GregorianCalendar(), dataExp = new GregorianCalendar();
                boolean estadoProduto = (rs.getString(ESTADO_PROD).equals(NOVO) ? true
                        : false);
                int estadoAnuncio = rs.getInt(ESTADO_ANUNC);// (rs.getString(ESTADO_ANUNC).equals(ABERTO)
                // ? Anuncio.ABERTO
                // :
                // (rs.getString(ESTADO_ANUNC).equals(BLOQUEADO)
                // ?
                // Anuncio.BLOQUEADO
                // :
                // Anuncio.ENCERRADO))
                // ;
                UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
                rs.getTimestamp(DATA_INS, dataInser);
                rs.getTimestamp(DATA_EXP, dataExp);
                if (rs.getString(TIPO_A).equals(VENDA)) {
                    Statement stmV = ConexaoBD.getConexao().createStatement();
                    String sqlV = "SELECT * FROM " + ANUNCIO_V_T + ", "
                            + MODO_VENDA_T + " WHERE av.id = " + chave
                            + " AND av.modoVenda = mv.id";
                    ResultSet rsV = stmV.executeQuery(sqlV);
                    if (rsV.next() == false) {
                        return null;
                    }
                    //int b = rsV.getMetaData().getColumnCount();
                    //String a = rsV.getString(10) ;
                    if (rsV.getString(MODO_V + TIPO_M_V).equals(LEILAO)) {
                        // int b = rsV.getMetaData().getColumnCount();
                        Statement stmVL = ConexaoBD.getConexao()
                                .createStatement();
                        String sqlVL = "SELECT * FROM " + LEILAO_T
                                + " WHERE l.id = "
                                + rsV.getInt(MODO_V + ID_M_V);
                        ResultSet rsVL = stmVL.executeQuery(sqlVL);
                        rsVL.next();
                        GregorianCalendar dataFim = new GregorianCalendar();
                        rsVL.getTimestamp(DATA_FIM, dataFim);
                        mv = new Leilao(rsVL.getInt(ID_L),
                                rsVL.getDouble(PRECO_BASE), dataFim,
                                rsVL.getInt(N_LICITACOES),
                                rsVL.getDouble(PRECO_ACTUAL), rsVL.getDouble(INC_MINIMO));
                        rsVL.close() ;
                        stmVL.close(); 
                    } else {
                        Statement stmVVD = ConexaoBD.getConexao()
                                .createStatement();
                        String sqlVVD = "SELECT * FROM " + VENDA_DIRECTA_T
                                + " WHERE vd.id = "
                                + rsV.getInt(MODO_V + ID_M_V);
                        ResultSet rsVVD = stmVVD.executeQuery(sqlVVD);
                        rsVVD.next();
                        mv = new VendaDirecta(rsV.getInt(MODO_V + ID_M_V),
                                rsVVD.getInt(N_PROPOSTAS), rsVVD.getDouble(PRECO_V_D));
                        rsVVD.close() ;
                        stmVVD.close() ;
                    }
                    // ResultSetMetaData rsmd = rsV.getMetaData() ;
                    // int a = rsmd.getColumnCount();
                    boolean envioEstrangeiro = (rsV.getString(ENVIO_E).equals(
                            SIM) ? true : false);
                    boolean propostaTrocar = (rsV.getString(PROPOSTA_T).equals(
                            SIM) ? true : false);
                    res = new AnuncioVenda(chave, rs.getString(TITULO),
                            dataInser, dataExp,
                            rs.getString(DESCRICAO), rs.getInt(QUANTIDADE),
                            -1, estadoProduto, estadoAnuncio,
                            u.get(rs.getString(ANUNCIANTE)), envioEstrangeiro,
                            rsV.getString(COND_E), rsV.getDouble(PRECO_E),
                            rsV.getDouble(SEGURO), rsV.getString(METODO_E),
                            propostaTrocar, mv);
                    rsV.close() ;
                    stmV.close() ;
                    
                } else {
                    Statement stmC = ConexaoBD.getConexao().createStatement();
                    String sqlC = "SELECT * FROM " + ANUNCIO_C_T + " WHERE ac.id = " + chave;
                    ResultSet rsC = stmC.executeQuery(sqlC);
                    rsC.next();
                    res = new AnuncioCompra(chave, rs.getString(TITULO),
                            dataInser, dataExp,
                            rs.getString(DESCRICAO), rs.getInt(QUANTIDADE),
                            -1, estadoProduto, estadoAnuncio,
                            u.get(rs.getString(ANUNCIANTE)), rsC.getDouble(PRECO_SUGERIDO));
                    rsC.close() ;
                    stmC.close() ;
                    
                }
            }
            rs.close() ;
            stm.close() ;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        return res;
    }

    public int hashCode() {
        return ConexaoBD.getConexao().hashCode();
    }

    public boolean isEmpty() {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT id FROM " + ANUNCIO_T);
            boolean res = !rs.next() ; 
            rs.close() ;
            stm.close() ;
            return res;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
    }

    public Set<Integer> keySet() {

        Set<Integer> res = new TreeSet<Integer>();
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT id FROM " + ANUNCIO_T;
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                res.add(rs.getInt(1));
            }
            rs.close() ;
            stm.close() ;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        return res;
    }

    public Anuncio put(Integer key, Anuncio value) {

        Anuncio res = null;
        try {
            boolean existe;
            String sqlA;
            if ((existe = this.containsKey(key)) == true) {
                sqlA = "UPDATE "
                        + ANUNCIO_T
                        + " SET a.id = ?, a.titulo = ?, a.dataInsercao = ?, a.dataExp = ?, a.descricao = ?, a.quantidade = ?, a.nVisitas = ?, a.estadoProduto = ?, a.estadoAnuncio = ?, a.anunciante = ?, a.tipo = ? WHERE a.id = "
                        + key;
            } else {
                sqlA = "INSERT INTO " + ANUNCIO_T
                        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            }
            Timestamp tsDI = new Timestamp(value.getDataInser()
                    .getTimeInMillis()), tsDE = new Timestamp(value
                    .getDataExpir().getTimeInMillis());
            String estadoProduto = (value.isEstadoProduto() ? NOVO : USADO); // estadoAnuncio
            // =
            // (value.getEstadoAnuncio()
            // ==
            // Anuncio.ABERTO
            // ?
            // ABERTO
            // :
            // (value.getEstadoAnuncio()
            // ==
            // Anuncio.BLOQUEADO
            // ?
            // BLOQUEADO
            // :
            // ENCERRADO))
            // ;
            PreparedStatement stmA = ConexaoBD.getConexao().prepareStatement(
                    sqlA);
            stmA.setInt(ID, value.getCodigo());
            stmA.setString(TITULO, value.getTitulo());
            stmA.setTimestamp(DATA_INS, tsDI);
            stmA.setTimestamp(DATA_EXP, tsDE);
            //stmA.setDouble(PRECO, value.getPreco());
            stmA.setString(DESCRICAO, value.getDescricao());
            stmA.setInt(QUANTIDADE, value.getQuantidade());
            /*stmA.setInt(N_VISITAS, value.getnVisitas());*/
            stmA.setString(ESTADO_PROD, estadoProduto);
            stmA.setInt(ESTADO_ANUNC, value.getEstadoAnuncio());
            stmA.setString(ANUNCIANTE, value.getAnunciante().getUsername());
            if (value.getClass().getName().equals(AnuncioVenda.class.getName())) {
                AnuncioVenda av = (AnuncioVenda) value;
                stmA.setString(TIPO_A, VENDA);
                String sqlMV;
                if (existe) {
                    sqlMV = "UPDATE " + MODO_VENDA_T
                            + " SET mv.id = ?, mv.tipo = ? WHERE mv.id = "
                            + av.getTipoVenda().getId();
                } else {
                    sqlMV = "INSERT INTO " + MODO_VENDA_T + " VALUES (?, ?)";
                }
                PreparedStatement stmMV = ConexaoBD.getConexao()
                        .prepareStatement(sqlMV);
                if (av.getTipoVenda().getClass().getName()
                        .equals(Leilao.class.getName())) {
                    Leilao l = (Leilao) av.getTipoVenda();
                    stmMV.setInt(ID_M_V, l.getId());
                    stmMV.setString(TIPO_M_V, LEILAO);
                    String sqlL;
                    if (existe) {
                        sqlL = "UPDATE "
                                + LEILAO_T
                                + " SET l.id = ?, l.precoBase = ?, l.precoActual = ?, l.nLicitacoes = ?, l.dataFim = ?, l.incMinimo = ? WHERE l.id = "
                                + l.getId();
                    } else {
                        sqlL = "INSERT INTO " + LEILAO_T
                                + " VALUES (?, ?, ?, ?, ?, ?)";
                    }
                    PreparedStatement stmL = ConexaoBD.getConexao()
                            .prepareStatement(sqlL);
                    Timestamp tsDF = new Timestamp(l.getDataFim()
                            .getTimeInMillis());
                    stmL.setInt(ID_L, l.getId());
                    stmL.setDouble(PRECO_BASE, l.getPrecoBase());
                    stmL.setDouble(PRECO_ACTUAL, l.getPrecoActual());
                    stmL.setInt(N_LICITACOES, l.getnLicitacoes());
                    stmL.setTimestamp(DATA_FIM, tsDF);
                    stmL.setDouble(INC_MINIMO, l.getIncrementoMinimo());
                    stmMV.execute();
                    stmL.execute();
                    stmL.close() ;
                } else {
                    VendaDirecta v = (VendaDirecta) av.getTipoVenda();
                    stmMV.setInt(ID_M_V, v.getId());
                    stmMV.setString(TIPO_M_V, VENDA_DIRECTA);
                    String sqlVD;
                    if (existe) {
                        sqlVD = "UPDATE "
                                + VENDA_DIRECTA_T
                                + " SET vd.id = ?, vd.nPropostas = ?, vd.preco = ? WHERE vd.id = "
                                + v.getId();
                    } else {
                        sqlVD = "INSERT INTO " + VENDA_DIRECTA_T
                                + " VALUES (?, ?, ?)";
                    }
                    PreparedStatement stmVD = ConexaoBD.getConexao()
                            .prepareStatement(sqlVD);
                    stmVD.setInt(ID_V_D, v.getId());
                    stmVD.setInt(N_PROPOSTAS, v.getnPropostas());
                    stmVD.setDouble(PRECO_V_D, v.getPreco());
                    stmMV.execute();
                    stmVD.execute();
                    stmVD.close() ;
                }
                String sqlAV;
                if (existe) {
                    sqlAV = "UPDATE "
                            + ANUNCIO_V_T
                            + " SET av.id = ?, av.envioEstrangeiro = ?, av.condicoesEnvio = ?, av.precoEnvio = ?, av.seguro = ?, av.metodoEnvio = ?, av.propostaTrocar = ?, av.modoVenda = ? WHERE av.id = "
                            + key;
                } else {
                    sqlAV = "INSERT INTO " + ANUNCIO_V_T
                            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                }
                PreparedStatement stmAV = ConexaoBD.getConexao()
                        .prepareStatement(sqlAV);
                String envioEstrangeiro = (av.isEnvioEstrangeiro() ? SIM : NAO), propostaTrocar = (av
                        .getPossivelTrocar() ? SIM : NAO);
                stmAV.setInt(ID_V, av.getCodigo());
                stmAV.setString(ENVIO_E, envioEstrangeiro);
                stmAV.setString(COND_E, av.getCondicoesEnvio());
                stmAV.setDouble(PRECO_E, av.getPrecoEnvio());
                stmAV.setDouble(SEGURO, av.getSeguro());
                stmAV.setString(METODO_E, av.getMetodoEnvio());
                stmAV.setString(PROPOSTA_T, propostaTrocar);
                stmAV.setInt(MODO_V, av.getTipoVenda().getId());
                stmA.execute();
                stmAV.execute();
                stmAV.close() ;
            } else {
                AnuncioCompra ac = (AnuncioCompra) value;
                stmA.setString(TIPO_A, COMPRA);
                String sqlAC;
                if (existe) {
                    sqlAC = "UPDATE " + ANUNCIO_C_T
                            + " SET ac.id = ?, ac.precoSugerido = ? WHERE ac.id = " + key;
                } else {
                    sqlAC = "INSERT INTO " + ANUNCIO_C_T + " VALUES (?, ?)";
                }
                PreparedStatement stmAC = ConexaoBD.getConexao()
                        .prepareStatement(sqlAC);
                stmAC.setInt(ID_C, ac.getCodigo());
                stmAC.setDouble(PRECO_SUGERIDO, ac.getPrecoSugerido());
                stmA.execute() ;
                stmAC.execute();
                stmAC.close() ;
            }
            stmA.close() ;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
        return res;
    }

    public void putAll(Map<? extends Integer, ? extends Anuncio> t) {
        throw new NullPointerException("Not implemented!");
    }

    public Anuncio remove(Object key) {
        throw new NullPointerException("remove não está implementado!");
    }

    public int size() {

        try {
            int i = 0;
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT id FROM " + ANUNCIO_T);
            for (; rs.next(); i++)
				;
            rs.close() ;
            stm.close() ;
            return i;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
    }

    public Collection<Anuncio> values() {

        try {
            Collection<Anuncio> res = new ArrayList<Anuncio>();
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM " + ANUNCIO_T);
            while (rs.next()) {
                Anuncio a = null;
                ModoVenda mv = null;
                int chave = rs.getInt(ID);
                GregorianCalendar dataInser = new GregorianCalendar(), dataExp = new GregorianCalendar();
                boolean estadoProduto = (rs.getString(ESTADO_PROD).equals(NOVO) ? true
                        : false);
                int estadoAnuncio = rs.getInt(ESTADO_ANUNC);
                UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO();
                rs.getTimestamp(DATA_INS, dataInser);
                rs.getTimestamp(DATA_EXP, dataExp);
                
                if (rs.getString(TIPO_A).equals(VENDA)) {
                    Statement stmV = ConexaoBD.getConexao().createStatement();
                    String sqlV = "SELECT * FROM " + ANUNCIO_V_T + ", "
                            + MODO_VENDA_T + " WHERE av.id = " + chave
                            + " AND av.modoVenda = mv.id";
                    ResultSet rsV = stmV.executeQuery(sqlV);
                    rsV.next();
                    if (rsV.getString(MODO_V + TIPO_M_V).equals(LEILAO)) {
                        Statement stmVL = ConexaoBD.getConexao()
                                .createStatement();
                        String sqlVL = "SELECT * FROM " + LEILAO_T
                                + " WHERE l.id = "
                                + rsV.getInt(MODO_V + ID_M_V);
                        ResultSet rsVL = stmVL.executeQuery(sqlVL);
                        rsVL.next();
                        GregorianCalendar dataFim = new GregorianCalendar();
                        rsVL.getTimestamp(DATA_FIM, dataFim);
                        mv = new Leilao(rsV.getInt(MODO_V + ID_M_V),
                                rsVL.getDouble(PRECO_BASE), dataFim,
                                rsVL.getInt(N_LICITACOES),
                                rsVL.getDouble(PRECO_BASE), rsVL.getDouble(INC_MINIMO));
                        rsVL.close() ;
                        stmVL.close() ;
                    } else {
                        Statement stmVVD = ConexaoBD.getConexao()
                                .createStatement();
                        String sqlVVD = "SELECT * FROM " + VENDA_DIRECTA_T
                                + " WHERE vd.id = "
                                + rsV.getInt(MODO_V + ID_M_V);
                        ResultSet rsVVD = stmVVD.executeQuery(sqlVVD);
                        rsVVD.next();
                        mv = new VendaDirecta(rsV.getInt(MODO_V + ID_M_V),
                                rsVVD.getInt(N_PROPOSTAS), rsVVD.getDouble(PRECO_V_D));
                        rsVVD.close() ;
                        stmVVD.close() ;
                    }
                    boolean envioEstrangeiro = (rsV.getString(ENVIO_E).equals(
                            SIM) ? true : false), propostaTrocar = (rsV
                            .getString(PROPOSTA_T).equals(SIM) ? true : false);
                    a = new AnuncioVenda(chave, rs.getString(TITULO),
                            dataInser, dataExp, //rs.getDouble(PRECO),
                            rs.getString(DESCRICAO), rs.getInt(QUANTIDADE),
                            -1, estadoProduto, estadoAnuncio,
                            u.get(rs.getString(ANUNCIANTE)), envioEstrangeiro,
                            rsV.getString(COND_E), rsV.getDouble(PRECO_E),
                            rsV.getDouble(SEGURO), rsV.getString(METODO_E),
                            propostaTrocar, mv);
                    rsV.close() ;
                    stmV.close() ;
                } else {
                    Statement stmC = ConexaoBD.getConexao().createStatement();
                    String sqlC = "SELECT * FROM " + ANUNCIO_C_T + " WHERE ac.id = " + chave;
                    ResultSet rsC = stmC.executeQuery(sqlC);
                    rsC.next();
                    a = new AnuncioCompra(chave, rs.getString(TITULO),
                            dataInser, dataExp, //rs.getDouble(PRECO),
                            rs.getString(DESCRICAO), rs.getInt(QUANTIDADE),
                            -1, estadoProduto, estadoAnuncio,
                            u.get(rs.getString(ANUNCIANTE)), rsC.getDouble(PRECO_SUGERIDO));
                    rsC.close();
                    stmC.close() ;
                }
                res.add(a);
                
            }
            rs.close() ;
            stm.close() ;
            return res;
        } catch (Exception e) {
            throw new NullPointerException(e.getMessage());
        }
       
    }
}
