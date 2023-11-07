package date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {



        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println("Data iniziale : " + data);

        System.out.println("Data full : " + formatFull(data));
        System.out.println("Data medium : " + formatMedium(data));
        System.out.println("Data short : " + formatShort(data));


    }


    public static String formatFull (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
    public static String formatMedium (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String formatShort (OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
