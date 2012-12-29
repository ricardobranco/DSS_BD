package Teste;

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
        s.marcarMsgComoLida("username4", 5);
        
        //UtilizadorRegistado u = new UtilizadorRegistado(a, "username4", "password", UtilizadorRegistado.NORMAL, "email4", 
        // "morada", "codPostal", "localidade", "pais", "infPessoal", "", "contacto", "nome", new GregorianCalendar()), u2 ;
        //s.inserirUtilizadorReg(u);
        //UtilizadorRegistado u2 = s.encontrarUtilizadorReg("username4") ;
        //Collection<UtilizadorRegistado> b = s.getUsers().values() ;
        System.out.println("") ;
    }    
}
