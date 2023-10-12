package enu;

public class Main {



    public static void main(String[] args) {

        Shape shape1 = Shape.Rettangolo;
        Shape shape2 = Shape.Triangolo;
        Rettangolo rettangolo = new Rettangolo(5, 6);
        Triangolo triangolo = new Triangolo(5, 10);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
        System.out.println("La prima forma è un " + shape1);
        System.out.println("La seconda forma è un " + shape2);
    }
}
