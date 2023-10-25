package hash1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        System.out.println(fillSet(cars));
        System.out.println("La grandezza del set è : " + cars.size());

    }

    public static HashSet<String> fillSet(HashSet<String>cars){
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        return cars;
    }

}
