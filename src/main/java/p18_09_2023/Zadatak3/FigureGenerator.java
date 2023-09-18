package p18_09_2023.Zadatak3;

import java.util.ArrayList;

public class FigureGenerator {
    public FigureGenerator() {
    }

    public Figura generateFigure(String tipFigure) {
        Figura figura = null;
        if (tipFigure.equals("trougao")) {
             figura = new JednakostranicniTrougao(5);
        } else if (tipFigure.equals("pravougaonik")) {
             figura = new Pravougaonik(5, 10);
        }
        return figura;
    }

    public ArrayList<Figura> generateNizTrougao(int n) {
        ArrayList<Figura> trouglovi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trouglovi.add(new JednakostranicniTrougao(5));
        }
        return trouglovi;
    }

    public ArrayList<Figura> generateNizPravougaonika(int n) {
        ArrayList<Figura> pravougaonici = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pravougaonici.add(new Pravougaonik(5, 10));
        }
        return pravougaonici;
    }

    public ArrayList<Figura> generateNiz(int n) {
        ArrayList<Figura> figura = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            figura.add(new JednakostranicniTrougao(5));
        }
        for (int i = 0; i < n; i++) {
            figura.add(new Pravougaonik(5, 10));
        }
        return figura;
    }

}
