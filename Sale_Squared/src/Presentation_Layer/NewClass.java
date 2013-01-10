/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer;

import Business_Layer.*;
import java.util.* ;
import java.io.* ;


/**
 *
 * @author ricardobranco
 */
public class NewClass {
  
    public static void main(String[] args){
        
        SaleSquared s = new SaleSquared() ;
        //s.encontrarAnuncio();
        Imagem i = new Imagem("abcd", "/Users/ricardobranco/Desktop/big_43.jpg") ;
        File f = new File(i.getPath()) ;
        if(f.exists())
            s.encontrarAnuncio(20).inserirImagem(i) ;
        //ModoVenda mv = new VendaDirecta(s.getEmSessao().getId(), 0, 100) ;
        //AnuncioVenda a = new AnuncioVenda(s.getEmSessao().getId(), "tituloo", new GregorianCalendar(), new GregorianCalendar(), 
               // "descricao", 1, 0, true, 0, s.getUsers().get("teste"), true, "condicoes", 30, 10, "correio", true, mv) ;
        //s.inserirAnuncio(a);
        //s.ultimosAnuncios() ;
        
        //UtilizadorRegistado u = s.encontrarUtilizadorReg("quim") ;
        //System.out.println(u.getImagem().getPath()) ;
        
    }
    
}
