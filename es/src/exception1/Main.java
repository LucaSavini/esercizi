package exception1;

public class Main {
    public static void main(String[] args) {

        int x = 12;
        int min = 0;
        int max = 10;

        try {
            check(x, min, max);
        } catch (ArithmeticException e) {
            System.out.println("Errore : " + e);
        }

    }

    static void check (int x, int min, int max) {
            if (x > min && x < max) {
                System.out.println("x è nel range");
            } else throw new ArithmeticException("x è fuori dal range");

        }
    }


