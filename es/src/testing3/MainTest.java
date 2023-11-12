package testing3;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String text = "2023-03-01T13:00Z";


    @Test
    void data() {
        assertEquals(text, Main.data(text).toString());
    }
    @Test
    void dataNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.data(null));
        assertEquals(NullPointerException.class, e.getClass());
    }

    @Test
    void testDataLong () {
        assertEquals("1 marzo 2023", Main.dataLong(Main.data(text)));
    }


    @Test
    void testDataLongNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dataLong(Main.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }


}