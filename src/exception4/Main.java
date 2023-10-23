package exception4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        int x = 55;
        int den = 0;

        System.out.println(Arrays.toString(fillArr(array)));
        try {
            divConInt(array, x, den);
        } catch (ArithmeticException c) {
            System.out.println("L'errore della seconda funzione è " + c);
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }


        try {
            div(array, den);
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }
    }


    public static int [] fillArr ( int [] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i ++){
            arr[i] = r.nextInt(1,50);
        }
        return arr;
    }

    public static double div (int [] arr, int den) throws Exception {
        if ( den > 0) {
            return arr[2] / den;
        } else throw new Exception("Impossibile dividere per 0");
    }

    public static double divConInt (int [] arr, int x, int den) throws Exception {
        if (x < arr.length && x >= 0) {
            System.out.println("X è nell' array");
            return div(arr, den);
        } else  throw new ArithmeticException("X è al di fuori dell' array");
    }
}
