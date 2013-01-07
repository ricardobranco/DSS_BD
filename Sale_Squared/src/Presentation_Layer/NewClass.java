/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation_Layer;

import Business_Layer.*;


/**
 *
 * @author ricardobranco
 */
public class NewClass {
  
    public static void main(String[] args){
        
        SaleSquared s = new SaleSquared() ;
        UtilizadorRegistado u = s.encontrarUtilizadorReg("quim") ;
        System.out.println(u.getImagem().getPath()) ;
        
    }
    
}
