package array1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] numeri = new int [5];
        int [] numeri2 = new int [5];
        int [] numeri3 = {4,6,8,9};
        System.out.println(Arrays.toString(fillArray(numeri)));
        System.out.println(add(numeri));
        System.out.println(Arrays.toString(confronto(numeri, numeri2)));
    }

    public static int [] fillArray (int [] arr) {   // riempie un array vuoto di 5 posizioni con numeri random tra 1 e 100
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = r.nextInt(1,100);
        }
        return arr;
    }

    public static int add(int [] arr) {     // somma tutti i valori del primo array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    public static int[] confronto (int [] arrA, int [] arrB) {    // il primo n del secondo arr è = alla somma dei primi 2 n del primo array e così via
        int sum = 0;
      for (int i = 0; i < arrA.length; i ++) {
          sum += arrA[i];
          arrB[i] = sum;
      }

      return arrB;
    }
}
