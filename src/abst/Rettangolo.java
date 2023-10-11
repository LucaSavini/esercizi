package abst;

public class Rettangolo extends Forma{
    public Rettangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void calcolaArea() {
        System.out.println("L' area del rettangolo è " + (getX() * getY()));
    }
}
