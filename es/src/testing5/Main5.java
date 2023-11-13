package testing5;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

public class Main5 {
    public static void main(String[] args) {

        String text = "2023-03-01T13:00Z";


        try {
            System.out.println("Data iniziale : " + data(text));
            System.out.println("Anno aggiunto : " + dataPlusY(data(text)));
            System.out.println("Mese sottratto : " + dataMinusM(data(text)));
            System.out.println("Aggiunti 7 giorni : " + dataAddD(data(text)));
        } catch (NullPointerException | DateTimeParseException e ) {
            System.out.println("L'errore è : " + e.getMessage());
        }

    }

    public static OffsetDateTime data (String text) throws DateTimeParseException {
        if (text == null) {
            throw new NullPointerException("Data is null");
        }
        return OffsetDateTime.parse(text).atZoneSimilarLocal(ZoneId.of("Europe/Rome")).toOffsetDateTime();
    }

    public static String dataPlusY(OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is null");
        } return String.valueOf(data.plusYears(1));
    }

    public static String dataMinusM (OffsetDateTime data){
        if (data == null) {
            throw new NullPointerException("Data is null");
        }return String.valueOf(data.minusMonths(1));
    }

    public static String dataAddD (OffsetDateTime data){
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
        return String.valueOf(data.plusDays(7));
    }
}
