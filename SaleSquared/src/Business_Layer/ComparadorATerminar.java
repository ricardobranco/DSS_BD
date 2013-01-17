/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_Layer;

import java.util.Comparator;
import java.util.GregorianCalendar;

/**
 *
 * @author ricardobranco
 */
public class ComparadorATerminar
        implements Comparator<Anuncio> {
    
    private GregorianCalendar tempoActual = new GregorianCalendar();

	public int compare(Anuncio a, Anuncio b) {

		long dA = tempoActual.getTimeInMillis()
				- a.getDataExpir().getTimeInMillis();
		long dB = tempoActual.getTimeInMillis()
				- b.getDataExpir().getTimeInMillis();
		if (dA >= dB)
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
    
    
    
}
