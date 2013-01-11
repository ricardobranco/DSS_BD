package Business_Layer;

import java.util.* ;

public class ComparadorUltimosAnunc implements Comparator<Anuncio> {

	private GregorianCalendar tempoActual = new GregorianCalendar();

        
        
	public int compare(Anuncio a, Anuncio b) {

		long dA = tempoActual.getTimeInMillis()
				- a.getDataInser().getTimeInMillis();
		long dB = tempoActual.getTimeInMillis()
				- b.getDataInser().getTimeInMillis();
		if (dA >= dB)
			return 1;
		else
			return -1;
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
