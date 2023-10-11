package enu;

public class Triangolo extends Forma {
    public int x;
    public int y;

    public Triangolo(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void calcolaArea() {
        int i = (x * y)/2;
        System.out.println("L' area del traingolo è " + i);
    }
}
