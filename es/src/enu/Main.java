package enu;

public class Main {



    public static void main(String[] args) {

        Shape shape1 = Shape.Rettangolo;
        Shape shape2 = Shape.Triangolo;
        Rettangolo rettangolo = new Rettangolo(5, 6, shape1);
        Triangolo triangolo = new Triangolo(5, 10, shape2);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
        System.out.println("La prima forma è un " + rettangolo.tipo);
        System.out.println("La seconda forma è un " + triangolo.tipo);
    }
}
