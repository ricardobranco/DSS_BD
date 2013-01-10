package Business_Layer;

import java.util.Comparator;

public class ComparadorAnuncPreco implements Comparator<Anuncio> {

    public static final int CRESCENTE = 1;
    public static final int DECRESCENTE = -1;
    private int ord;

    public ComparadorAnuncPreco(int ord) {
        this.ord = ord;}

        // ordem crescente
    

    

    public int compare(Business_Layer.Anuncio a, Business_Layer.Anuncio b) {

        if (a.getPreco() <= b.getPreco()) {
            return -1*this.ord;
        } else {
            return 1*this.ord;
        }
    }

    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}