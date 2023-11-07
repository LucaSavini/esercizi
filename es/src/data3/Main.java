package data3;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        getYear(data);
        getMonth(data);
        dayMonth(data);
        dayWeek(data);

    }
    public static void getYear (OffsetDateTime data) {
        String dataYear = String.valueOf(data.getYear());
        System.out.println("Anno : " + dataYear);
    }
    public static void getMonth (OffsetDateTime data) {
        String dataMonth = String.valueOf(data.getMonth());
        System.out.println("Mese : " + dataMonth);
    }

    public static void dayMonth (OffsetDateTime data) {
        String dataDayMonth = String.valueOf(data.getDayOfMonth());
        System.out.println("Giorno mese : " + dataDayMonth);
    }

    public static void dayWeek (OffsetDateTime data) {
        String dataDayWeek = String.valueOf(data.getDayOfWeek());
        System.out.println("Giorno settimana : " + dataDayWeek);
    }

}
