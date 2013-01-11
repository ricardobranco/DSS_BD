package Business_Layer;

import java.util.Comparator ;

public class ComparadorAnuncTroca implements Comparator<Anuncio> {

	public static double precoAnuncTroca;

	public int compare(Anuncio a, Anuncio b) {

		if (Math.abs(a.getPreco() - precoAnuncTroca) >= Math.abs(b.getPreco()
				- precoAnuncTroca))
			return 1;
		else
			return -1;
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}