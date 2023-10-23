package exception3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] array = new int [3];

        System.out.println(Arrays.toString(fillArr(array)));
        try {
            div(array,0);
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }

    }

    public static int [] fillArr ( int [] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i ++){
            arr[i] = r.nextInt(1,15);
        }
        return arr;
    }

    public static double div (int [] arr, int den) {
        if ( den > 0) {
            return arr[2] / den;
        } else throw new ArithmeticException("Impossibile dividere per 0");
    }
}
