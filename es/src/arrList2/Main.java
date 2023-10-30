package arrList2;

import arrList1.Studente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Pietro", 20);
        Studente studente2 = new Studente("Riccardo", 25);
        Studente studente3 = new Studente("Andrea", 29);
        Studente studente4 = new Studente("Marco", 34);
        Studente studente5 = new Studente("Antonio", 30);
        Studente studente6 = new Studente("Piero", 35);
        Studente studente7 = new Studente("Giovanni", 20);
        Studente studente8 = new Studente("Tiziano", 10);
        Studente studente9 = new Studente("Lorenzo", 24);
        Studente studente10 = new Studente("Samuele", 20);
        Studente studente11 = new Studente("Diego", 29);
        Studente studente12 = new Studente("Federico", 20);



        List<Studente> lista = new ArrayList<>(Arrays.asList(studente1,studente2,studente3,studente4,studente5,studente6,studente7,studente8,studente9,studente10,studente11,studente12));


        System.out.println("Lista iniziale : " + lista);


        lista.sort(Comparator.comparing(Studente::getAge));

        System.out.println("Lista ordinata : " + lista);


    }
}
