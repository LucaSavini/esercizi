package testing4;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {


        String text = "2023-03-01T13:00:00Z";
        data(text);

        try {
            System.out.println("Anno : " + getYear(data(text)));
            System.out.println("Mese : " + getMonth(data(text)));
            System.out.println("Giorno mese : " + dayMonth(data(text)));
            System.out.println("Giorno settimana : " + dayWeek(data(text)));

        } catch (NullPointerException | DateTimeParseException e ) {
            System.out.println("L'errore è : " + e.getMessage());
        }
    }

    public static OffsetDateTime data (String text) throws DateTimeParseException {
        if (text == null) {
            throw new NullPointerException("Data is null");
        }
        return OffsetDateTime.parse(text);
    }

    public static int getYear(OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
        return data.getYear();
    }

    public static String getMonth(OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is null");
        }return String.valueOf(data.getMonth());
    }

    public static int dayMonth(OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
            return data.getDayOfMonth();
    }

    public static String dayWeek(OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
        return String.valueOf(data.getDayOfWeek());
    }

}
