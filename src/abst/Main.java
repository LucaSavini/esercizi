package abst;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5, 3);
        Triangolo triangolo = new Triangolo(5, 10);

        rettangolo.calcolaArea();
        triangolo.setX(7);
        triangolo.calcolaArea();

    }
}
