package esercizi;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] numeri = new int [4];
        String [] parole = {"ciao", "giorno", "notte"};
        int x = 4;

        System.out.println(Arrays.toString(fillArr(numeri)));
        System.out.println("Il valore più grande è : " + checkValMax(numeri));
        System.out.println("Il valore più piccolo è : " + checkValMin(numeri));
        System.out.println("La somma di tutti i numeri pari è : " + sumPari(numeri));
        System.out.println("Esiste almeno un elemento lungo quanto " + x + " ? " + checkString(parole,x));

    }

    public static int [] fillArr (int [] arrA){
        Random r = new Random();
        for (int i = 0; i < arrA.length; i ++) {
            arrA[i] = r.nextInt(1,10);
        } return arrA;
    }

    public static int checkValMax (int [] arr){
        int valMax = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > valMax) {
                valMax = arr[i];
            }
        } return valMax;
    }

    public static int checkValMin (int [] arr){
        int valMin = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < valMin) {
                valMin = arr[i];
            }
        } return valMin;
    }

    public static int sumPari (int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        } return sum;
    }

    public static boolean checkString (String[]arr, int x){
        for (int i = 0; i < arr.length; i ++){
            if(x == arr[i].length()){
                return  true;
            }
        } return false;
    }

}


//       Creare un programma in Java che dato un array di Stringhe abbia il seguente metodo:

//        Traccia checkpoint 1
//
//        Creare un programma in Java che dato un array di interi abbia i seguenti metodi:
//        a) Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
//        stampi l’informazione a video.
//        b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno dell’array e stampi l’informazione a video.

//
//        c) Scrivere un metodo che ricerchi se una stringa di lunghezza definita dall’utente è contenuta o meno all’iterno dell’array e che restituisca
//        true o false come risultato della ricerca.
//        Il risultato della ricerca dovrà essere stampato a video.
//
//        Traccia Bonus:
//
//
//