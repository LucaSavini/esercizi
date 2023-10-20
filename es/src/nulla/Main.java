package nulla;

public class Main {
    public static void main(String[] args) {
        Integer numeratore = 4;
        Integer denominatore = null;


        try {
            check(numeratore, denominatore);
        } catch (Exception e) {
            System.out.println("Leccezione è : " + e);
        }
    }


    public static void check(Integer num, Integer den) {
        if (num == null && den == null) {
            throw new ArithmeticException("Manca sia il numeratore che il denominatore");
        } else if (num != null && den != null) {
            throw new ArithmeticException("Entrambi i valori sono numeri");
        } else if (num == null) {
            throw new ArithmeticException("Manca il numeratore");
        } else throw new ArithmeticException("Manca il denominatore");


    }

}

