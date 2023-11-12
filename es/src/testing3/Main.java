package testing3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        String text = "2023-03-01T13:00:00Z";

        try {

            System.out.println(dataLong(data(text)));
        }catch (NullPointerException e) {
            System.out.println("L'errore è : " + e.getMessage());
        }

    }


    public static OffsetDateTime data (String text) {
        if (text == null) {
            throw new NullPointerException("Data is null");
        }
        return OffsetDateTime.parse(text);
    }

    public static String dataLong (OffsetDateTime data) {
        if (data == null) {
            throw  new NullPointerException("Data is Null");
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
