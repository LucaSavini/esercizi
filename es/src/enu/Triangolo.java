package enu;

public class Triangolo extends Forma {
    public int x;
    public int y;
    public Shape tipo;

    public Triangolo(int x, int y) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }


    public void calcolaArea() {
        int i = (x * y)/2;
        System.out.println("L' area del traingolo è " + i);
    }
}
