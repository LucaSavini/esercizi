package ered2;

public class Rettangolo extends Forma {

    public int x;
    public int y;

    public Rettangolo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println((x * y));
    }
}
