package Business_Layer;

import java.util.Comparator;

public class ComparadorAnuncNVis implements Comparator<Anuncio> {

	// ordem decrescente
	public int compare(Business_Layer.Anuncio a, Business_Layer.Anuncio b) {

		if (a.getnVisitas() >= b.getnVisitas())
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}