package exception1;

public class Main {
    public static void main(String[] args) {

        int x = 11;
        check(x);
        System.out.println ("il codice non si blocca grazie al try/catch");
    }

    static void check (int x) {
        try {
            if (x > 0 && x < 10) {
                System.out.println("true");
            } else throw new ArithmeticException("x è fuori dal range");
        } catch (Exception e) {
            System.out.println("C'è stato un errore: " + e);
        }
    }

}
