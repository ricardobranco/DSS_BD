package camadaDados;

import java.util.* ;
import java.sql.* ;
import camadaNegocio.* ;

public class AnuncioDAO implements Map<Integer, Anuncio> {
    
    // v. c.
    public static final String ANUNCIO_T = "Anuncio a" ;    
    public static final String ANUNCIO_V_T = "AnuncioVenda av" ;  
    public static final String ANUNCIO_C_T = "AnuncioCompra ac" ;  
    public static final String MODO_VENDA_T = "ModoVenda mv" ;  
    public static final String LEILAO_T = "Leilao l" ;  
    public static final String VENDA_DIRECTA_T = "VendaDirecta vd" ;  
    
    public static final String COMPRA = "C" ;
    public static final String VENDA = "V" ;
    public static final String LEILAO = "L" ;
    public static final String VENDA_DIRECTA = "D" ;
    
    public static final String NOVO = "N" ;
    public static final String USADO = "U" ;
    
    public static final String ABERTO = "A" ;
    public static final String BLOQUEADO = "B" ;
    public static final String ENCERRADO = "E" ;
    
    public static final String SIM = "S" ;
    public static final String NAO = "N" ;
    
    public static final int ID = 1, ID_V = 1, ID_C = 1, ID_M_V = 1, ID_L = 1, ID_V_D = 1 ;
    public static final int TITULO = 2, ENVIO_E = 2, TIPO_M_V = 2, PRECO_BASE = 2, N_PROPOSTAS = 2 ;
    public static final int DATA_INS = 3, COND_E = 3, PRECO_ACTUAL = 3 ;
    public static final int DATA_EXP = 4, PRECO_E = 4, N_LICITACOES = 4 ;
    public static final int PRECO = 5, SEGURO = 5, DATA_FIM = 5 ;
    public static final int DESCRICAO = 6, METODO_E = 6 ;
    public static final int QUANTIDADE = 7, PROPOSTA_T = 7 ;
    public static final int N_VISITAS = 8, MODO_V = 8 ;
    public static final int ESTADO_PROD = 9 ;
    public static final int ESTADO_ANUNC = 10 ;
    public static final int ANUNCIANTE = 11 ;
    public static final int TIPO_A = 12 ;    
    
    // construtor    
    public AnuncioDAO () {}
    
    // interface Map
    public void clear () {throw new NullPointerException("clear não está implementado!");}
    /* public void clear () {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            stm.executeUpdate("DELETE FROM " + ANUNCIO_T);
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    } */
    
    public boolean containsKey(Object key) {
       
        try {
            Integer chave = (Integer)key ;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT id FROM " + ANUNCIO_T + " WHERE a.id = " + chave ;
            ResultSet rs = stm.executeQuery(sql);
            return rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public boolean containsValue(Object value) {throw new NullPointerException("método containsValue não está implementado!");}    
    public Set<Map.Entry<Integer, Anuncio>> entrySet() {throw new NullPointerException("método entrySet não está implementado!");}    
    public boolean equals(Object o) {return super.equals(o) ;}
    
    public Anuncio get(Object key) {
        
        Anuncio res = null;
        try {
            Integer chave = (Integer)key ;            
            ModoVenda mv = null ;
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT * FROM " + ANUNCIO_T + " WHERE a.id = " + chave ;
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                GregorianCalendar dataInser = new GregorianCalendar(), dataExp = new GregorianCalendar() ;
                boolean estadoProduto = (rs.getString(ESTADO_PROD).equals(NOVO) ? true : false) ;
                char estadoAnuncio = (rs.getString(ESTADO_ANUNC).equals(ABERTO) ? Anuncio.ABERTO : (rs.getString(ESTADO_ANUNC).equals(BLOQUEADO) ? Anuncio.BLOQUEADO : Anuncio.ENCERRADO)) ;
                UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO() ;
                rs.getTimestamp(DATA_INS, dataInser) ;
                rs.getTimestamp(DATA_EXP, dataExp) ;
                if(rs.getString(TIPO_A).equals(VENDA)) {                    
                    String sqlV = "SELECT * FROM " + ANUNCIO_V_T + ", " + MODO_VENDA_T + " WHERE av.id = " + chave + " AND av.modoVenda = mv.id" ;
                    ResultSet rsV = stm.executeQuery(sqlV) ;
                    rsV.next() ;                        
                    if(rsV.getString(MODO_V + TIPO_M_V).equals(LEILAO)) {
                        String sqlVL = "SELECT * FROM " + LEILAO_T + " WHERE l.id = " + rsV.getInt(MODO_V + ID_M_V) ;
                        ResultSet rsVL = stm.executeQuery(sqlVL) ;
                        rsVL.next() ;
                        GregorianCalendar dataFim = new GregorianCalendar() ;
                        rsVL.getTimestamp(DATA_FIM, dataFim) ;
                        mv = new Leilao(rsVL.getDouble(PRECO_BASE), dataFim, rsVL.getInt(N_LICITACOES), rsVL.getDouble(PRECO_BASE)) ;
                    }
                    else {
                        String sqlVVD = "SELECT * FROM " + VENDA_DIRECTA_T + " WHERE vd.id = " + rsV.getInt(MODO_V + ID_M_V) ;
                        ResultSet rsVVD = stm.executeQuery(sqlVVD) ;
                        rsVVD.next() ;
                        mv = new VendaDirecta(rsVVD.getInt(N_PROPOSTAS)) ;                        
                    }                    
                    boolean envioEstrangeiro = (rsV.getString(ENVIO_E).equals(SIM) ? true : false), propostaTrocar = (rsV.getString(PROPOSTA_T).equals(SIM) ? true : false) ;                                        
                    res = new AnuncioVenda(chave, rs.getString(TITULO), dataInser, dataExp, rs.getDouble(PRECO), rs.getString(DESCRICAO), rs.getInt(QUANTIDADE), rs.getInt(N_VISITAS), estadoProduto, estadoAnuncio, u.get(rs.getString(ANUNCIANTE)), envioEstrangeiro, rsV.getString(COND_E), rsV.getDouble(PRECO_E), rsV.getDouble(SEGURO), rsV.getString(METODO_E), propostaTrocar, mv) ;
                }
                else {
                    res = new AnuncioCompra(chave, rs.getString(TITULO), dataInser, dataExp, rs.getDouble(PRECO), rs.getString(DESCRICAO), rs.getInt(QUANTIDADE), rs.getInt(N_VISITAS), estadoProduto, estadoAnuncio, u.get(rs.getString(ANUNCIANTE))) ;
                }
            }            
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
        return res;
    }
    
    public int hashCode() {return ConexaoBD.getConexao().hashCode();}
    
    public boolean isEmpty() {
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT id FROM " + ANUNCIO_T);
            return !rs.next();
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Set<Integer> keySet() {
    
        Set<Integer> res = new TreeSet<Integer>() ;
        try {
            Statement stm = ConexaoBD.getConexao().createStatement();
            String sql = "SELECT id FROM " + ANUNCIO_T ;
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
                res.add(rs.getInt(1)) ;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
        return res ;
    }
    
    public Anuncio put(Integer key, Anuncio value) {
        
        Anuncio res = null ;
        try {            
            //res = this.get(key) ;    
            Timestamp tsDI = new Timestamp(value.getDataInser().getTimeInMillis()), tsDE = new Timestamp(value.getDataExpir().getTimeInMillis()) ;
            String estadoProduto = (value.isEstadoProduto() ? NOVO : USADO), estadoAnuncio = (value.getEstadoAnuncio() == Anuncio.ABERTO ? ABERTO : (value.getEstadoAnuncio() == Anuncio.BLOQUEADO ? BLOQUEADO : ENCERRADO)) ;
            PreparedStatement stmA = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + ANUNCIO_T + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmA.setInt(ID, value.getCodigo()) ;
            stmA.setString(TITULO, value.getTitulo()) ;
            stmA.setTimestamp(DATA_INS, tsDI) ;
            stmA.setTimestamp(DATA_EXP, tsDE) ;
            stmA.setDouble(PRECO, value.getPreco()) ;
            stmA.setString(DESCRICAO, value.getDescricao()) ;
            stmA.setInt(QUANTIDADE, value.getQuantidade()) ;
            stmA.setInt(N_VISITAS, value.getnVisitas()) ;
            stmA.setString(ESTADO_PROD, estadoProduto) ;
            stmA.setString(ESTADO_ANUNC, estadoAnuncio) ;
            stmA.setString(ANUNCIANTE, value.getAnunciante().getUsername()) ;
            if(value.getClass().toString().equals("AnuncioVenda")) {
                AnuncioVenda av = (AnuncioVenda)value ;
                stmA.setString(TIPO_A, VENDA) ;
                PreparedStatement stmMV = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + MODO_VENDA_T + " VALUES (?, ?)");
                if(av.getTipoVenda().getClass().toString().equals("Leilao")) {
                    Leilao l = (Leilao)av.getTipoVenda() ;                    
                    stmMV.setInt(ID_M_V, l.getId()) ;
                    stmMV.setString(TIPO_M_V, LEILAO);
                    PreparedStatement stmL = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + LEILAO_T + " VALUES (?, ?, ?, ?, ?)");
                    Timestamp tsDF = new Timestamp(l.getDataFim().getTimeInMillis()) ;
                    stmL.setInt(ID_L, l.getId()) ;
                    stmL.setDouble(PRECO_BASE, l.getPrecoBase()) ;
                    stmL.setDouble(PRECO_ACTUAL, l.getPrecoActual()) ;
                    stmL.setInt(N_LICITACOES, l.getnLicitacoes()) ;
                    stmL.setTimestamp(DATA_FIM, tsDF);
                    stmMV.execute() ;
                    stmL.execute() ;
                }
                else {
                    VendaDirecta v = (VendaDirecta)av.getTipoVenda() ;
                    stmMV.setInt(ID_M_V, v.getId()) ;
                    stmMV.setString(TIPO_M_V, VENDA_DIRECTA);
                    PreparedStatement stmVD = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + VENDA_DIRECTA_T + " VALUES (?, ?)");
                    stmVD.setInt(ID_V_D, v.getId()) ;
                    stmVD.setInt(N_PROPOSTAS, v.getnPropostas()) ;
                    stmMV.execute() ;
                    stmVD.execute() ;
                }
                PreparedStatement stmAV = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + ANUNCIO_V_T + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                String envioEstrangeiro = (av.isEnvioEstrangeiro() ? SIM : NAO), propostaTrocar = (av.getPossivelTrocar() ? SIM : NAO) ;
                stmAV.setInt(ID_V, av.getCodigo()) ;
                stmAV.setString(ENVIO_E, envioEstrangeiro);
                stmAV.setString(COND_E, av.getCondicoesEnvio());
                stmAV.setDouble(PRECO_E, av.getPrecoEnvio());
                stmAV.setDouble(SEGURO, av.getSeguro());
                stmAV.setString(METODO_E, av.getMetodoEnvio()) ;
                stmAV.setString(PROPOSTA_T, propostaTrocar) ;
                stmAV.setInt(MODO_V, av.getTipoVenda().getId()) ;
                stmA.execute() ;
                stmAV.execute() ;
            }
            else {
                AnuncioCompra ac = (AnuncioCompra)value ;
                stmA.setString(TIPO_A, COMPRA) ;
                PreparedStatement stmAC = ConexaoBD.getConexao().prepareStatement("INSERT INTO " + ANUNCIO_C_T + " VALUES (?)");
                stmAC.setInt(ID_C, ac.getCodigo()) ;
                stmA.execute() ;
                stmAC.execute() ;
            }
        } catch (Exception e) {throw new NullPointerException(e.getMessage());}
        return res ;
    }
    
    public void putAll(Map<? extends Integer,? extends Anuncio> t) {throw new NullPointerException("Not implemented!");}
        
    public Anuncio remove(Object key) {throw new NullPointerException("remove não está implementado!") ;}
    
    public int size() {
        
        try {
            int i = 0;
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT id FROM " + ANUNCIO_T);
            for (; rs.next(); i++)
                ;
            return i;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
    
    public Collection<Anuncio> values() {
        
        try {
            Collection<Anuncio> res = new ArrayList<Anuncio>();
            Statement stm = ConexaoBD.getConexao().createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM " + ANUNCIO_T);
            while(rs.next()) {
                Anuncio a = null ;
                ModoVenda mv = null ;
                int chave = rs.getInt(ID) ;
                GregorianCalendar dataInser = new GregorianCalendar(), dataExp = new GregorianCalendar() ;
                boolean estadoProduto = (rs.getString(ESTADO_PROD).equals(NOVO) ? true : false) ;
                char estadoAnuncio = (rs.getString(ESTADO_ANUNC).equals(ABERTO) ? Anuncio.ABERTO : (rs.getString(ESTADO_ANUNC).equals(BLOQUEADO) ? Anuncio.BLOQUEADO : Anuncio.ENCERRADO)) ;
                UtilizadorRegistadoDAO u = new UtilizadorRegistadoDAO() ;
                rs.getTimestamp(DATA_INS, dataInser) ;
                rs.getTimestamp(DATA_EXP, dataExp) ;
                if(rs.getString(TIPO_A).equals(VENDA)) {                    
                    String sqlV = "SELECT * FROM " + ANUNCIO_V_T + ", " + MODO_VENDA_T + " WHERE av.id = " + chave + " AND av.modoVenda = mv.id" ;
                    ResultSet rsV = stm.executeQuery(sqlV) ;
                    rsV.next() ;                        
                    if(rsV.getString(MODO_V + TIPO_M_V).equals(LEILAO)) {
                        String sqlVL = "SELECT * FROM " + LEILAO_T + " WHERE l.id = " + rsV.getInt(MODO_V + ID_M_V) ;
                        ResultSet rsVL = stm.executeQuery(sqlVL) ;
                        rsVL.next() ;
                        GregorianCalendar dataFim = new GregorianCalendar() ;
                        rsVL.getTimestamp(DATA_FIM, dataFim) ;
                        mv = new Leilao(rsVL.getDouble(PRECO_BASE), dataFim, rsVL.getInt(N_LICITACOES), rsVL.getDouble(PRECO_BASE)) ;
                    }
                    else {
                        String sqlVVD = "SELECT * FROM " + VENDA_DIRECTA_T + " WHERE vd.id = " + rsV.getInt(MODO_V + ID_M_V) ;
                        ResultSet rsVVD = stm.executeQuery(sqlVVD) ;
                        rsVVD.next() ;
                        mv = new VendaDirecta(rsVVD.getInt(N_PROPOSTAS)) ;                        
                    }                    
                    boolean envioEstrangeiro = (rsV.getString(ENVIO_E).equals(SIM) ? true : false), propostaTrocar = (rsV.getString(PROPOSTA_T).equals(SIM) ? true : false) ;                                        
                    a = new AnuncioVenda(chave, rs.getString(TITULO), dataInser, dataExp, rs.getDouble(PRECO), rs.getString(DESCRICAO), rs.getInt(QUANTIDADE), rs.getInt(N_VISITAS), estadoProduto, estadoAnuncio, u.get(rs.getString(ANUNCIANTE)), envioEstrangeiro, rsV.getString(COND_E), rsV.getDouble(PRECO_E), rsV.getDouble(SEGURO), rsV.getString(METODO_E), propostaTrocar, mv) ;
                }
                else {
                    a = new AnuncioCompra(chave, rs.getString(TITULO), dataInser, dataExp, rs.getDouble(PRECO), rs.getString(DESCRICAO), rs.getInt(QUANTIDADE), rs.getInt(N_VISITAS), estadoProduto, estadoAnuncio, u.get(rs.getString(ANUNCIANTE))) ;
                }
                res.add(a) ;
            }
            return res;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}
    }
}

