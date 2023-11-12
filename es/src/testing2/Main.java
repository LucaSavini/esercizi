package testing2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {


        String text = "2002-03-01T13:00:00Z";

        try {
            System.out.println("Data iniziale : " + data(text));
            System.out.println("Data full : " + formatFull(data(text)));
            System.out.println("Data medium : " + formatMedium(data(text)));
            System.out.println("Data short : " + formatShort(data(text)));
        } catch (NullPointerException e) {
            System.out.println("L'errore è : " + e.getMessage());
        }


    }

    public static OffsetDateTime data (String text) {
        if (text == null) {
            throw new NullPointerException("Data is null");
        }
        return OffsetDateTime.parse(text);
    }

    public static String formatFull (OffsetDateTime data) {
        if (data == null) {
            throw new NullPointerException("Data is Null");
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public static String formatMedium (OffsetDateTime data) {
        if (data == null) {
            throw  new NullPointerException("Data is Null");
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String formatShort (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}

