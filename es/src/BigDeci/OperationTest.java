package BigDeci;

import org.junit.jupiter.api.Test;
import testing1.Main;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void eseguiOperazione() {
        Operation operazione = new Operation(BigDecimal.valueOf(4.5), BigDecimal.valueOf(8.9), Operation.OpType.SOMMA);
        BigDecimal atteso = new BigDecimal(13.4).setScale(1, RoundingMode.HALF_UP);
        assertEquals(atteso , operazione.eseguiOperazione());
        assertEquals(Operation.OpType.SOMMA, operazione.getOp());
    }
}