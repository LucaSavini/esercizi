package abst;

public class Triangolo extends Forma{
    public Triangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void calcolaArea() {
        int i = (x * y)/2;
        System.out.println("L' area del traingolo è " + i);
    }
}
