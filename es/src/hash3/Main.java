package hash3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<String>();
        String stringa = new String("Luca");

        System.out.println("Set originale : " );
        fillSet(words);
        System.out.println("Set aggiornato : " + checkSet(words,stringa));
    }

    public static HashSet<String> fillSet(HashSet<String> words){
        words.add("Pietro");
        words.add("Riccardo");
        words.add("Andrea");
        words.add("Marco");
        words.add("Luca");
        return words;
    }

    public static HashSet<String> checkSet (HashSet<String> words, String stringa){
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (stringa.equals(element)){
                iterator.remove();
            }
        }
        return words;
    }
}
