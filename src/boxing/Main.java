package boxing;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        char z = 'a';
        Integer a = 10;
        Integer b = 12;
        Character j = 'g';


        System.out.println(stampSum(x,y));
        stampChar(z);
        System.out.println(stamSomma(a,b));
        stampCharacter(j);

    }



    public static int stampSum (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void stampChar (char z) {
        System.out.println(z);
    }

    public static Integer stamSomma (Integer a, Integer b){
        Integer sum = a + b;
        return  sum;
    }

    public static void stampCharacter (Character j) {
        System.out.println(j);
    }
}
