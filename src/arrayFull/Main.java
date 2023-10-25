package arrayFull;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numeri = new int[10];
        int[] numeri2 = new int[10];
        int[] numeriInv = new int[10];
        int[] numeriSum = new int[10];
        int[] numeriPrimi = new int[10];


        int y = 4;

        System.out.println(Arrays.toString(fillArray(numeri)));
        System.out.println("La lunghezza del primo array è " + lunghezzaArrA(numeri));
        pos(numeri, y);
        System.out.println("La somma di tutti i numeri è : " + sum(numeri));
        System.out.println("Il numero più grande è : " + valMax(numeri));
        System.out.println("Il numero più piccolo è : " + valMin(numeri));
        System.out.println("La media dei numeri è : " + media(numeri));
        System.out.println("L'occorrenza del numero scelto è "+ occ(numeri, 3));
        System.out.println("Il nuovo array è " + Arrays.toString(copiaArr(numeri, numeri2)));
        System.out.println("L'occorrenza di numeri duplicati nel primo array è : " + occDupli(numeri));
        System.out.println(("Il primo array invertito e messo in ordine é : " + Arrays.toString(invert(numeri, numeriInv))));
        System.out.println("Il nuovo array che contiene la somma di tutti i valori del primo array e del secondo è " + Arrays.toString(sum2Arr(numeri, numeri2, numeriSum)));
        System.out.println("Il primo n primo di n è un n primo? : " + primo(15));
        System.out.println("il nuovo array riempito con i n primi del primo array è : " + Arrays.toString(primeNumArrA(numeri, numeriPrimi)));
        System.out.println("La somma dei n positivi del primo array è " + sumPositivi(numeri));


    }


    public static int[] fillArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-10, 10);
        }
        return arr;
    }

    public static int lunghezzaArrA(int[] arrA) {
        int counter = 0;
        for (int i = 0; i < arrA.length; i++) {
            counter++;
        }
        return counter;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int valMax(int[] arr) {
        int valMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (valMax < arr[i]) {
                valMax = arr[i];
            }
        }
        return valMax;
    }

    public static int valMin(int[] arr) {
        int valMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (valMin > arr[i]) {
                valMin = arr[i];
            }
        }
        return valMin;
    }

    public static float media(int[] arr) {
        return ((float) (sum(arr)) / arr.length);
    }

    public static int occ(int[] arr, int x) {
        int occ = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (x == arr[i]) {
                occ++;
            }
        }
        return occ;
    }

    public static int occDupli(int[] arr) {
        int occ = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                occ++;
            }
        }
        return occ;

    }

    public static int[] copiaArr(int[] arrA, int[] arrB) {
        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = arrA[i];
        }
        return arrB;
    }

    public static int[] invert(int[] arrA, int[] arrC) {
        int maxLength = arrA.length - 1;
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[maxLength];
            maxLength = maxLength - 1;
            //   -- => diminuice di 1, riassegnandolo a ogni giro del for.
        }

        return arrC;
    }

    public static int[] sum2Arr(int[] arrA, int[] arrB, int[] arrSum) {
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        for (int i = 0; i < arrA.length; i++) {
            arrSum[i] = arrA[i] + arrB[i];
        }
        return arrSum;
    }

    public static void pos(int[] arrA, int y) {
        for (int i = 0; i < arrA.length; i++) {
            if (y == arrA[i]) {
                System.out.println("l'indice del numero " + y + " é " + "[" + i + "]");
                break;
            }
        }
        System.out.println("Numero non trovato");
    }


    public static boolean primo(int n) {
        if (n == 1)
            return true;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        int divisore = 3;
        while (divisore <= Math.sqrt(n)) {
            if (n % divisore == 0)
                return false;
            divisore += 2;
        }
        return true;
    }

    public static int[] primeNumArrA(int[] arrA, int[] arrPrimo) {
        for (int i = 0; i < arrA.length; i++) {
            if (primo(arrA[i])) {
                arrPrimo[i] = arrA[i];

            }
        }
        return arrPrimo;
    }

    public static int sumPositivi(int[] arrA) {
        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] > 0) {
                sum += arrA[i];
            }

        }
        return sum;

    }

}

