package data5;

import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {

        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");


        boolean checke1 = data1.isBefore(data2);
        boolean checke2 = data2.isAfter(data1);
        boolean check3 = data1.isEqual(OffsetDateTime.now());
        boolean check4 = data2.isEqual(OffsetDateTime.now());



        System.out.println("la prima data è precedente alla seconda? " + checke1);
        System.out.println("la seconda data è successiva alla prima? " + checke2);
        System.out.println("La prima data è uguale a NOW? : " + check3);
        System.out.println("La seconda data è uguale a NOW? : " + check4);

    }
}
