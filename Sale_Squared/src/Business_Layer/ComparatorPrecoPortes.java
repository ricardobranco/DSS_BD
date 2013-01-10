/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Layer;

import java.util.Comparator;

/**
 *
 * @author ricardobranco
 */
public class ComparatorPrecoPortes implements Comparator<Anuncio> {
    
    public static final int CRESCENTE = 1;
    public static final int DECRESCENTE = -1;
    private int ord;
    
    public ComparatorPrecoPortes(int ord){
        this.ord=ord;
        
    }
    
    public int compare(Business_Layer.Anuncio a, Business_Layer.Anuncio b) {

		if (a.getPreco() + ((AnuncioVenda)a).getPrecoEnvio() <= b.getPreco() + ((AnuncioVenda)b).getPrecoEnvio())
			return -1*this.ord;
		else
			return 1*this.ord;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
    
    
    
}
