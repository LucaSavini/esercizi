package boxing;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;
        char z = 'a';
        Integer a = 10;
        Integer b = 12;
        Character j = 'g';
        double s = 16.3;
        Integer d = x;
        Double f = s;
        Character h = z;
        double v = f;
        int w = d;
        char t = h;


        System.out.println(stampSum(x,y));
        stampChar(z);
        System.out.println(stampSomma(a,b));
        stampCharacter(j);

        System.out.println(stampSomma(d,b));
        stampCharacter(h);
        stampChar(t);



    }



    public static int stampSum (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void stampChar (char z) {
        System.out.println(z);
    }

    public static Integer stampSomma (Integer a, Integer b){
        Integer sum = a + b;
        return  sum;
    }

    public static void stampCharacter (Character j) {
        System.out.println(j);
    }
}
