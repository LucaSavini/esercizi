package esercizi;

public class Main2 {
    public static void main(String[] args) {

        Docente docente1 = new Docente("Pietro", "Sasso", 40,12345);
        Docente docente2 = new Docente("Giovanni", "Rossi", 37,1236789);
        Docente docente3 = new Docente("Luca", "Bianchi", 35,16789);

        Docente [] docenti = {docente1,docente2,docente3};
        Università uni = new Università(docenti);

        System.out.println(docente1);
        System.out.println(docente2);
        System.out.println(docente3);

        System.out.println("L'età minima tra i docenti è " + uni.checkEtà());
        docente2.setEtà(33);
        System.out.println("L'età minima aggiornata tra i docenti è " + uni.checkEtà());

    }
}



//        Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome, cognome, codice ed età.
//        La classe dovrà avere un costruttore ed i metodi accessori.
//        Scrivere poi una classe Università che rappresenti un insieme di docenti universitari tramite un Array
//        di tipo Docente e che contenga il costruttore, i metodi accessori ed un metodo che restituisce l’età minima tra i docenti universitari.