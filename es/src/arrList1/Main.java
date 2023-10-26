package arrList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Pietro", 20);
        Studente studente2 = new Studente("Riccardo", 25);
        Studente studente3 = new Studente("Andrea", 29);

        List<Studente> lista = new ArrayList<>(Arrays.asList(studente1,studente2,studente3));

        System.out.println("Lista iniziale : " + lista);

        Studente studente4 = new Studente("Marco", 34);
        Studente studente5 = new Studente("Antonio", 30);
        Studente studente6 = new Studente("Piero", 35);
        Studente studente7 = new Studente("Giovanni", 20);

        lista.add(studente4);
        lista.add(studente5);
        lista.add(studente6);
        lista.add(studente7);

        System.out.println("Lista aggiornata : " + lista);

    }
}
