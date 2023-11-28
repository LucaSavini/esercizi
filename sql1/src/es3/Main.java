package es3;


public class Main {
    public static void main(String[] args) {


        JDBC.createView();
        JDBC.stamp();
        System.out.println(JDBC.studentiItaliani());
        System.out.println(JDBC.studentiTedeschi());

    }
}

