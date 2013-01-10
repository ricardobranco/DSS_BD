package Business_Layer;

import java.util.* ;


public class ComparadorTempoRest implements Comparator<Anuncio> {

	public int compare(Anuncio a, Anuncio b) {
		
		if (a.calculaTempoRestante() >= b.calculaTempoRestante())
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}
