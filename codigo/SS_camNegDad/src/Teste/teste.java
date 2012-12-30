package Teste;

import camadaDados.* ;
import camadaNegocio.* ;
import java.util.* ;

public class teste {

    public static void main (String[] args) {
             
        SaleSquared s  = new SaleSquared() ;   
        s.iniciarConexao() ;  
        
        //ImagemAnuncioDAO imgdao = new ImagemAnuncioDAO(5) ;
        //Imagem i = new Imagem("a5_1", ".\\hydra.jpg"), i2 = new Imagem("a5_2", ".\\desert.jpg"), i3 = new Imagem("a5_3", "chry.jpg") ;
        TransaccaoDAO asdao = new TransaccaoDAO("username4") ;
        Double d = (double)5 ;
        //Anuncio a = new AnuncioVenda(4), b = new AnuncioVenda(5), c = new AnuncioCompra(6) ;
        Transaccao a = new Transaccao(new AnuncioVenda(4), new UtilizadorRegistado("username4"), new UtilizadorRegistado("username1"), 4, new GregorianCalendar(), d++, "modo de pagamento", "morada alterada", "código", "localidade", "pais", Transaccao.EU_AGUARDAR_RECEPCAO, 1) ;
        Transaccao b = new Transaccao(new AnuncioVenda(4), new UtilizadorRegistado("username4"), new UtilizadorRegistado("username1"), 5, new GregorianCalendar(), d++, "modo de pagamento", "morada", "c alt", "localidade", "pais", Transaccao.OUTRO_AGUARDAR_ACEITACAO, 2) ;
        Transaccao c = new Troca(new AnuncioVenda(4), new AnuncioVenda(5), new UtilizadorRegistado("username4"), new UtilizadorRegistado("username1"), 6, new GregorianCalendar(), d++, "modo de pagamento", "morada", "código", "porto", "pais", Transaccao.EU_REJEITAR, 3) ;        
        
        asdao.put(a.getId(), a) ;
        asdao.put(b.getId(), b) ;
        asdao.put(c.getId(), c) ;
        
        //AnuncioDAO adao = new AnuncioDAO() ;
        //ModoVenda mv = new Leilao(s.registaIdModoVenda(), 2, new GregorianCalendar(), 0, 2 ) ;
        //Anuncio a = new AnuncioCompra(s.registaIdAnuncio(), "Anuncio1", new GregorianCalendar(), new GregorianCalendar(), 1, "descricao", 2, 3, Anuncio.NOVO, Anuncio.ABERTO, new UtilizadorRegistado("username1")) ;
        //adao.put(a.getCodigo(), a) ;
        //adao.get(5) ;
        //System.out.println(adao.get(6).getAnunciante().getUsername()) ;
        //ModoPagamentoDAO mpdao = new ModoPagamentoDAO(4) ;
        //Anuncio a = new AnuncioVenda(4), a2 = new AnuncioVenda(5) ;
        //Categoria c = new Categoria("categoriaA"), c2 = new Categoria("categoriaC") ;// t3 = new Tag("tag3") ;
        //mpdao.add("cartão") ;
        //mpdao.add("dinheiro") ;
        //rdao.put(t3.getNome(), t3) ; 
                
        for(Integer str : asdao.keySet())
            System.out.println(asdao.get(str).getVendedor().getUsername()) ; 
        /*Iterator<String> it = mpdao.iterator() ;
        System.out.println(it.getClass().getName()) ;
        for(; it.hasNext(); )
            System.out.println(it.next()) ; */
        for(Transaccao ima : asdao.values())
            System.out.println(ima.getAnuncio().getCodigo()) ;
        System.out.println(asdao.containsKey(1)) ;
        System.out.println(asdao.containsKey(4)) ;
        System.out.println(asdao.isEmpty()) ;
        System.out.println(asdao.size()) ;
        /*asdao.remove(5) ;
        System.out.println(asdao.size()) ;
        asdao.clear();
        System.out.println(asdao.size()) ;*/
        
        /*int mE = s.registaIdMsg(), mR = s.registaIdMsg() ;
        Mensagem msgE = new Mensagem(mE, new UtilizadorRegistado("username4"), new UtilizadorRegistado("username1"), new GregorianCalendar(), "assunto", "corpo", true), msgR = msgE.clone() ;
        msgR.setLida(false) ;
        msgR.setId(mR) ;
        s.enviarMensagem(msgE, msgR) ;
        s.marcarMsgComoLida("username1", 6);
        MsgEnviadaDAO medao = new MsgEnviadaDAO("username1") ;
        MsgRecebidaDAO mrdao = new MsgRecebidaDAO("username1") ;*/
        /*for(Integer inte : medao.keySet())
            System.out.println(inte) ;
        for(Mensagem m : medao.values())
            System.out.println(m.toString()) ;
        System.out.println(medao.containsKey(1)) ;
        System.out.println(medao.get(1).toString()) ;
        System.out.println(medao.size()) ;
        medao.remove(1) ;
        System.out.println(medao.size()) ;
        
        for(Integer inte : mrdao.keySet())
            System.out.println(inte) ;
        for(Mensagem m : mrdao.values())
            System.out.println(m.toString()) ;
        System.out.println(mrdao.containsKey(4)) ;
        System.out.println(mrdao.get(4).toString()) ;
        System.out.println(mrdao.size()) ;
        mrdao.clear() ;
        System.out.println(mrdao.size()) ;*/
        
        //UserSeguidoDAO usdao = new UserSeguidoDAO("username4") ;
        //usdao.put("username1", new UtilizadorRegistado("username1")) ;
        //usdao.put("username3", new UtilizadorRegistado("username3")) ;
        //usdao.clear() ;
        //CategoriaDAO catdao = new CategoriaDAO() ;
        //Categoria c = new Categoria("categoriaA"), c2 = new Categoria("categoriaB"), c3 = new Categoria("categoriaC", c) ;
        //CategoriaSeguidaDAO csdao = new CategoriaSeguidaDAO("username1") ;
        //csdao.put(c.getNome(), c) ; csdao.put(c2.getNome(), c2) ; csdao.put(c3.getNome(), c3) ;
        
        //catdao.put(c.getNome(), c) ; catdao.put(c2.getNome(), c2) ; catdao.put(c3.getNome(), c3) ;
        /*System.out.println(csdao.size()) ;
        System.out.println(csdao.get(c3.getNome()).toString()) ;
        System.out.println(csdao.remove(c.getNome())) ;
        for(String str : csdao.keySet())
            System.out.println(str) ;
        for(Categoria cat : csdao.values())
            System.out.println(cat.toString()) ;        
        System.out.println(csdao.containsKey(c2.getNome())) ;
        csdao.clear() ;
        System.out.println(csdao.size()) ;
        //s.registaUtilizador() ;
        /*UtilizadorRegistado u = new UtilizadorRegistado(2, "username1", "pw", UtilizadorRegistado.BANIDO, "email1", 
         "morada", "codPostal", "localidade", "pais", "eu sou assim!", new Imagem("username1.jpg", ".\\a.jpg"), "919", "Pedro", new GregorianCalendar()), u2 ;
        urdao.put(u.getUsername(), u) ;
        System.out.println(urdao.containsKey("abc"));
        System.out.println(urdao.size());
        System.out.println(urdao.isEmpty());
        for(UtilizadorRegistado ur :urdao.values()) 
            System.out.println(ur.getEmail());*/
        //s.inserirUtilizadorReg(u);
        //UtilizadorRegistado u2 = s.encontrarUtilizadorReg("username4") ;
        //Collection<UtilizadorRegistado> b = s.getUsers().values() ;
        //System.out.println(u2.getDataNasc().get(Calendar.MINUTE)) ;
        
    }    
}
