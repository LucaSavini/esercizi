package data5;

import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {

        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("la prima data è precedente alla seconda? " + check1(data1,data2));
        System.out.println("la seconda data è successiva alla prima? " + check2(data1,data2));
        System.out.println("La prima data è uguale a NOW? : " + checkData1xNow(data1));
        System.out.println("La seconda data è uguale a NOW? : " + checkData2xNow(data2));

    }

    public static boolean check1 (OffsetDateTime data1, OffsetDateTime data2) {
         return data1.isBefore(data2);
    }
    public static boolean check2 (OffsetDateTime data1, OffsetDateTime data2) {
        return data2.isAfter(data1);
    }
    public static boolean checkData1xNow (OffsetDateTime data1) {
        return data1.isEqual(OffsetDateTime.now());
    }
    public static boolean checkData2xNow (OffsetDateTime data2) {
        return data2.isEqual(OffsetDateTime.now());
    }

}
