package inter;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 6);
        Triangolo triangolo = new Triangolo(5, 10);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
