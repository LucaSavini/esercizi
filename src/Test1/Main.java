package Test1;

public class Main {
    public static void main(String[] args) {
        int [] numeri = {2,6,9,13};

        System.out.println("Il numero più grande è " + valMax(numeri));
        System.out.println("Il numero più piccolo è " + valMin(numeri));
        System.out.println("La somma dell'array è " + sumPari(numeri));

        String [] words = {"ciao","sera","giorno"};

        int x = 4;

        System.out.println(checkString(words,x));
    }

    public static int valMax(int [] arr){
        int count = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if (count < arr[i]) {
                count = arr[i];
            }
        }return  count;
    }

    public static int valMin(int [] arr){
        int count = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if (count > arr[i]) {
                count = arr[i];
            }
        }return  count;
    }

    public static int sumPari(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }return sum;
    }

    public static boolean checkString(String[] arr, int x){
        for (int i = 0; i < arr.length; i ++) {
            if(x == arr[i].length()){
                return true;
            }
        }return false;

    }

}


//    Traccia checkpoint 1
//
//        Creare un programma in Java che dato un array di interi abbia i seguenti metodi:
//
//
//        a) Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
//        stampi l’informazione a video.
//
//
//        b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno dell’array e stampi l’informazione a video.
//
//
//        Creare un programma in Java che dato un array di Stringhe abbia il seguente metodo:
//
//        c) Scrivere un metodo che ricerchi se una stringa di lunghezza definita dall’utente è contenuta o meno all’iterno dell’array e che restituisca true o false come risultato della ricerca. Il risultato della ricerca dovrà essere stampato a video.
//
//