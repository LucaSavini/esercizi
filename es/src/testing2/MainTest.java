package testing2;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String text = "2002-03-01T13:00Z";

    @Test
    void data() { assertEquals(text, Main.data(text).toString());
    }

    @Test
    void formatFull() {
        assertEquals("venerdì 1 marzo 2002", Main.formatFull(Main.data(text)));
    }

    @Test
    void formatFullNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.formatFull(null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is Null", e.getMessage());
    }

    @Test
    void formatMedium() {
        assertEquals("1 mar 2002", Main.formatMedium(Main.data(text)));
    }

    @Test
    void formatMediumNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.formatMedium(null));
        assertEquals(NullPointerException.class, e.getClass());  // getClass prende l'exception che viene fuori, simile al NullPointerException.class
        assertEquals("Data is Null", e.getMessage());
    }

    @Test
    void formatShort() {
        assertEquals("01/03/02", Main.formatShort(Main.data(text)));;
    }

}