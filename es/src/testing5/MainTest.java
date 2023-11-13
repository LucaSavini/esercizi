package testing5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing2.Main;


import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String text = "2023-03-01T13:00+01:00";

    @Test
    void data() {
        assertEquals(text, Main5.data(text).toString());
    }

    @Test
    void dataNull () {
        Exception e = assertThrows(NullPointerException.class, () -> Main5.data(null));
        assertEquals(NullPointerException.class, e.getClass());
    }

    @Test
    void dataPlusY() {
        assertEquals("2024-03-01T13:00+01:00", Main5.dataPlusY(Main5.data(text)));
    }

    @Test
    void testDataPlusYNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main5.dataPlusY(Main5.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void dataMinusM() {
        assertEquals("2023-02-01T13:00+01:00", Main5.dataMinusM(Main5.data(text)));
    }

    @Test
    void testdataMinusMNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main5.dataMinusM(Main5.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }

    @Test
    void dataAddD() {
        assertEquals("2023-03-08T13:00+01:00", Main5.dataAddD(Main5.data(text)));
    }

    @Test
    void testdataAddDNull() {
        Exception e = assertThrows(NullPointerException.class, () -> Main5.dataAddD(Main5.data(null)));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Data is null", e.getMessage());
    }
}