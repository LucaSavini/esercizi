package link;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("pera");
        Fruit fruit2 = new Fruit("mela");
        Fruit fruit3 = new Fruit("ciliegia");
        Fruit fruit4 = new Fruit("ananas");

        LinkedList<Fruit> list = new LinkedList<>();

        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);

        System.out.println("Lista iniziale : " + list);

        list.addFirst(new Fruit("banana"));
        list.addFirst(new Fruit("cocco"));

        System.out.println("Lista aggiornata : " + list);
    }
}
