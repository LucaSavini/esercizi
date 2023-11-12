package testing1;

public class Main {
    public static void main(String[] args) {

    }

    public static Integer sum(Integer x, Integer y){
        if (x == null || y == null){
            return null;
        }
        return  x + y;
    }

    public static Integer multi(Integer x, Integer y){
        if (x == null || y == null){
            return null;
        }
        return x * y;
    }
}
