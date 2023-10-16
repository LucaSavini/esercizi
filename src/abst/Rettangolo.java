package abst;

public class Rettangolo extends Forma{
    public int x;
    public int y;

    public Rettangolo(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public void calcolaArea() {
        System.out.println("L' area del rettangolo è " + (x * y));
    }
}
