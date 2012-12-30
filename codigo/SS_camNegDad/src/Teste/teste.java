package Teste;

import camadaDados.* ;
import camadaNegocio.* ;
import java.util.* ;

public class teste {

    public static void main (String[] args) {
             
        SaleSquared s  = new SaleSquared() ;   
        s.iniciarConexao() ;  
        /*int mE = s.registaIdMsg(), mR = s.registaIdMsg() ;
        Mensagem msgE = new Mensagem(mE, new UtilizadorRegistado("username3"), new UtilizadorRegistado("username4"), new GregorianCalendar(), "assunto", "corpo", true), msgR = msgE.clone() ;
        msgR.setLida(false) ;
        msgR.setId(mR) ;
        s.enviarMensagem(msgE, msgR) ;*/
        UserSeguidoDAO usdao = new UserSeguidoDAO("username4") ;
        usdao.remove("username1") ;
        System.out.println(usdao.size()) ;
        
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
