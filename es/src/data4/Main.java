package data4;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        ZonedDateTime dataPlusY = data.plusYears(1);
        ZonedDateTime dataMinusM = data.minusMonths(1);
        ZonedDateTime dataAddD = data.plusDays(7);


        System.out.println("Data iniziale : " + data);
        System.out.println("Anno aggiunto : " + dataPlusY);
        System.out.println("Mese sottratto : " + dataMinusM);
        System.out.println("Aggiunti 7 giorni : " + dataAddD);

    }
}
