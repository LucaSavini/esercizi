package testing1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   public Main testing = new Main();

    @Test
    void somma_di_due_Integer () {

        Integer res = testing.sum(1,2);
        assertEquals(3, res,"Somma di 1 + 2 dovrebbe essere 3");
    }

    @Test
     void somma_di_Integer_negativo () {

        Integer res = testing.sum(-1,2);
        assertEquals(1, res,"Somma di -1 + 2 dovrebbe essere ");
    }

    @Test
    void somma_di_null_e_Integer () {

        Integer res = testing.sum(null,2);
        assertNull(res,"Se uno dei parametri è null il risultato è null");
    }

    @Test
    void moltiplicazione_di_due_Integer () {

        Integer res = testing.multi(1,2);
        assertEquals(2, res,"moltiplicazione di 1 * 2 dovrebbe essere 2");
    }

    @Test
    void moltiplicazione_di_due_Integer_non_uno () {

        Integer res = testing.multi(5,2);
        assertEquals(10, res,"moltiplicazione di 5 * 2 dovrebbe essere 10");
    }

    @Test
    void moltiplicazione_di_null_e_Integer () {

        Integer res = testing.multi(null, 2);
        assertNull(res, "Se uno dei parametri è null il risultato è null");

    }
}