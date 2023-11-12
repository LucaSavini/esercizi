package testing4;

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
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void getYear() {
        int res = Main.getYear(Main.data(text));
        assertEquals(2023, res);
    }

    @Test
    void getYearNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.getYear(Main.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void getMonth() {
        String res = Main.getMonth(Main.data(text));
        assertEquals("MARCH", res);
    }

    @Test
    void getMonthNUll() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.getMonth(Main.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void dayMonth() {
        int res = Main.dayMonth(Main.data(text));
        assertEquals(1, res);
    }
    @Test
    void dayMonthNUll() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dayMonth(Main.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void dayWeek() {
        String res = Main.dayWeek(Main.data(text));
        assertEquals("WEDNESDAY", res);
    }
    @Test
    void dayWeekNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main.dayWeek(Main.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

}