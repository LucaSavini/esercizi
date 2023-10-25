package Test1;

public class Main2 {
    public static void main(String[] args) {


        Docente docente1 = new Docente("Pietro","Rossi",25,1234);
        Docente docente2 = new Docente("Luca","Bianchi",28,12869);
        Docente docente3 = new Docente("Riccardo","Marrone",30,1697);



        Docente [] docenti = {docente1,docente2,docente3};
    }
}


//    Traccia Bonus:
//
//        Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome, cognome, codice ed età. La classe dovrà avere un costruttore ed i metodi accessori.
//        Scrivere poi una classe Università che rappresenti un insieme di docenti universitari tramite un Array di tipo Docente e che contenga il costruttore, i metodi accessori ed un metodo che restituisce l’età minima tra i docenti universitari.
