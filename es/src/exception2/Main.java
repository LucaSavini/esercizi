package exception2;

public class Main {
    public static void main(String[] args) {

        char x = 'a';
        try {
            check(x);
        } catch (Exception e) {
            System.out.println("L' eccezione è " + e);
        }
    }

    static void check (char x) throws Exception {
            if (x >= '0' && x <= '9') {
                System.out.println("Il carattere è un numero");
            } else {
                throw new Exception ("x non è un numero");
            }
    }
}
