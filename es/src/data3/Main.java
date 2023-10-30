package data3;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataYear = String.valueOf(data.getYear());

        String dataMonth = String.valueOf(data.getMonth());
        String dataDayMonth = String.valueOf(data.getDayOfMonth());
        String dataDayWeek = String.valueOf(data.getDayOfWeek());


        System.out.println("Anno : " + dataYear);
        System.out.println("Mese : " + dataMonth);
        System.out.println("Giorno mese : " + dataDayMonth);
        System.out.println("Giorno settimana : " + dataDayWeek);


    }
}
