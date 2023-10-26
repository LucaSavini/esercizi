package HashMap1;

import arrList1.Studente;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       Articoli articolo1 = new Articoli("pasta",9.99);
       Articoli articolo2 = new Articoli("acqua",0.99);
       Articoli articolo3 = new Articoli("pesce",18.99);


       Map<String, Articoli> mapArticoli = new HashMap<>();

       mapArticoli.put("primo",articolo1);
       mapArticoli.put("bevanda",articolo2);
       mapArticoli.put("secondo",articolo3);
       System.out.println(mapArticoli);



        Map<String, Articoli> mapArticoli2 = Map.of("primo",articolo1, "bevanda", articolo2, "secondo" , articolo3);
        System.out.println(mapArticoli2);



        Map<String, Articoli>mapArticoli3 = Map.ofEntries(
             new AbstractMap.SimpleEntry<>("primo",articolo1),
             new AbstractMap.SimpleEntry<>("bevanda", articolo2),
             new AbstractMap.SimpleEntry<>("secondo" , articolo3)
        );
        System.out.println(mapArticoli3);

    }
}
