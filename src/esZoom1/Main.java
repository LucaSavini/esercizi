package esZoom1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ciao");
        myList.add("Tino");
        myList.add("Antonio");
        myList.add("Simone");
        myList.add("Studio");
        myList.add("Develhope");
        myList.add("Ciao");

        System.out.println(myList);
        System.out.println(remover(myList, "Computer"));
        System.out.println(searcher(myList, "Ciao"));
        System.out.println("Parole uguali sono: " + coutSameWord(myList, "Ciao"));
        System.out.println(partialSearch(myList, "io"));
        System.out.println(removeSearch(myList, "ino"));
        System.out.println(replaceWord(myList));
        System.out.println(removeList(myList));

        System.out.println(myList);
    }

    public static ArrayList<String> remover(ArrayList<String> list, String wordToRemove) {
        if (list.contains(wordToRemove)) {
            list.remove(wordToRemove);
        } else {
            System.out.println("Word to remove not found.");
        }
        return list;
    }

    public static ArrayList<Integer> searcher(ArrayList<String> list, String wordToSearch) {
        ArrayList<Integer> posList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(wordToSearch)) {
                posList.add(i);
            }
        }
        return posList;
    }

    public static int coutSameWord(ArrayList<String> list, String sameWord) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(sameWord)) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<String> partialSearch(ArrayList<String> list, String wordToSearch) {
        ArrayList<String> result = new ArrayList<>();
        for (String actual : list) {
            if (actual.contains(wordToSearch)) {
                result.add(actual);
            }
        }
        return result;
    }

    public static ArrayList<String> removeSearch(ArrayList<String> list, String wordToSearch) {
        ArrayList<String> result = list;

        for (int i = 0; i < result.size(); i++) {
            if (list.get(i).contains(wordToSearch)) {
                result.remove(i);
            }
        }
        return result;
    }

    public static ArrayList<String> replaceWord(ArrayList<String> list) {
        int size = list.size() / 2;

        for (int i = 0; i < size; i++) {
            list.set(i, "---");
        }

        return list;
    }

    public static boolean removeList(ArrayList<String> list) {
        if (list.size()> 5 ) {
            list.clear();
            return true;
        } else {
            return false;
        }
    }
}







