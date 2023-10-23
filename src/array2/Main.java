package array2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numeri = new int[6];
        int x = 6;
        System.out.println("Il primo array è : " + Arrays.toString(fillArr(numeri)));
        check(numeri,x);
    }

    public static int [] fillArr(int [] arrA) {
        Random r = new Random();
        for (int i = 0; i < arrA.length; i ++) {
            arrA[i] = r.nextInt(1, 10);
        }return arrA;
    }
     public static void check (int [] arrA, int x){

        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i < arrA.length; i ++){
            if(arrA[i] < x){
                countMin ++;
            } else if (arrA[i] > x) {
               countMax ++;
            }else {
                System.out.println("Un numero è uguale");
            }
        }
         System.out.println("i numeri maggiori di x sono " + countMax);
         System.out.println("i numeri minori di x sono " + countMin);
     }
}



   // Leggere un array di interi di 6 posizioni, leggere un ulteriore numero intero e dire quanti numeri memorizzati nell’array sono inferiori e quanti superiori dell’ultimo numero letto.