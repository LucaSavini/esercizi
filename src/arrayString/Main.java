package arrayString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"ciao", "Boh", "seraaa","giorno"};



        System.out.println(occ(words));
        System.out.println(minLength(words));
        counterElements(words);
        System.out.println(occChar(words));
        System.out.println(Arrays.toString(arrInt(words)));

        //Scanner scan = new Scanner(System.in);

        //richiediArr(scan);

    }

    public static int occ(String[] arr) {
        int occ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith("b")){
                occ++;
            }
        }
        return occ;
    }

    public static String minLength (String[] arr) {
        String min = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if(arr[i].length() < min.length()) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void counterElements (String [] arrA) {
        for (String s : arrA) {
            System.out.println("La lunghezza di " + s + " è " + s.length());
        }
//        for (int i = 0; i < arrA.length; i ++) {
//            System.out.println("La lunghezza di " + arrA[i] + " è " + arrA[i].length());
    }

    public static void richiediArr(Scanner scan) {
        System.out.println("Inserisci la dimensione dell' array : ");
        int dim = scan.nextInt();
        scan.nextLine();
        String [] utente = new String[dim];
        System.out.println("Inserisci valori : " );
        for (int j = 0; j < utente.length; j ++) {
            utente[j] = scan.nextLine();
        }
        System.out.println(Arrays.toString(utente));
    }

    public static int occChar (String [] arrA){
        int counter = 0;
        for (int i = 0; i < arrA.length; i ++){
            String lett = arrA[i].toLowerCase();
            if (lett.startsWith("b")) {
                counter ++;
            }
        } return counter;
    }

    public static int[] arrInt (String [] arr){
        int [] arrNum = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arrNum[i] = arr[i].length();
        }
        return arrNum;
    }

}
