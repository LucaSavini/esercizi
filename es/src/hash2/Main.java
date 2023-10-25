package hash2;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<String>();
        String stringa = new String("Luca");


        System.out.println("Il set è composto da : " + fillSet(words));
        boolean result = checkElement(words,stringa);
        System.out.println("L'elemento è presente nel set? "+ result);
        if (!result){
            System.out.println("Il set aggiornato è " + words);
        }

    }

    public static HashSet<String> fillSet(HashSet<String> words){
        words.add("Pietro");
        words.add("Riccardo");
        words.add("Andrea");
        words.add("Marco");
        return words;
    }

    public static boolean checkElement (HashSet<String>words, String stringa){
        for (String element : words){
            if(stringa.equals(element)){
                return true;
            }
        } words.add(stringa);
        System.out.println();
        return false;
    }
}
