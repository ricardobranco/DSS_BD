package Business_Layer;

import java.util.Comparator;

public class ComparadorAnuncPreco implements Comparator<Anuncio> {

	// ordem crescente
	public int compare(Business_Layer.Anuncio a, Business_Layer.Anuncio b) {

		if (a.getPreco() <= b.getPreco())
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}