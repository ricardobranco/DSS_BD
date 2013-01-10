package Business_Layer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparadorAnuncioTag implements Comparator<Tag> {

	public static Map<Tag, Integer> ocorrenciasTags = new HashMap<Tag, Integer>();

	public int compare(Tag a, Tag b) {

		if (ocorrenciasTags.get(a) >= ocorrenciasTags.get(b))
			return -1;
		else
			return 1;
	}

	public boolean equals(Object obj) {
		return this.equals(obj);
	}
}
