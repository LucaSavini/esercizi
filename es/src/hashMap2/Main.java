package hashMap2;

import HashMap1.Articoli;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Articoli articolo1 = new Articoli("pasta",9.99);
        Articoli articolo2 = new Articoli("acqua",0.99);
        Articoli articolo3 = new Articoli("pesce",18.99);



        LinkedHashMap<String, Articoli> mapArticoli = new LinkedHashMap<>();

        mapArticoli.put("primo",articolo1);
        mapArticoli.put("bevanda",articolo2);
        mapArticoli.put("secondo",articolo3);

        List<Articoli> ordinamento = new ArrayList<>(mapArticoli.values());
        Collections.sort(ordinamento, Comparator.comparing(Articoli::getNome));

        System.out.println(ordinamento);
    }
}
