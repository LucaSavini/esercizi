package exception4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int index = 9;
        int den = 0;

        System.out.println(Arrays.toString(fillArr(array)));
        try {
            checkIndex(array, index);
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }


        try {
            div(array, den);
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }
    }


    public static int[] fillArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 50);
        }
        return arr;
    }

    public static double div(int[] arr, int den) throws Exception {
        if (den > 0) {
            return arr[2] / den;
        } else throw new Exception("Impossibile dividere per 0");
    }

    public static void checkIndex(int[] arr, int index) throws Exception {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        if (count < index) {
            throw new Exception("L' indice x è al di fuori dell' array");
        }
    }

}
