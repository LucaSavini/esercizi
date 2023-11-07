package data4;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome")).toOffsetDateTime();

        System.out.println("Data iniziale : " + data);
        System.out.println("Anno aggiunto : " + dataPlusY(data));
        System.out.println("Mese sottratto : " + dataMinusM(data));
        System.out.println("Aggiunti 7 giorni : " + dataAddD(data));

    }

    public static OffsetDateTime dataPlusY (OffsetDateTime data){
        return data.plusYears(1);
    }

    public static OffsetDateTime dataMinusM (OffsetDateTime data){
        return data.minusMonths(1);
    }
    public static OffsetDateTime dataAddD (OffsetDateTime data){
        return data.plusDays(7);
    }

}
