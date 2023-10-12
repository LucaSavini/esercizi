package arrList1;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<Persona> arrli = new ArrayList<Persona>();
        Persona p = new Persona();
        p.setCognome("Pippo");
        Persona p1 = new Persona();
        p1.setCognome("Pluto");
        Persona p2 = new Persona();
        p2.setCognome("Paperino");


        arrli.add(p);
        arrli.add(p1);
        arrli.add(p2);


        System.out.println("contenuto array");
// stampa il contenuto dell'array
        for (int i = 0; i < arrli.size(); i++)
            System.out.println(arrli.get(i).getCognome() + " ");
// rimuove l'elemento in posizione 1
        arrli.remove(1);
        System.out.println("NUOVO contenuto array");


// stampa il nuovo contenuto dell'array
        for (int i = 0; i < arrli.size(); i++)
            System.out.println(arrli.get(i).getCognome() + " ");
    }
}



