package BigDeci;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Operation operazione1 = new Operation(BigDecimal.valueOf(4.5), BigDecimal.valueOf(8.9), Operation.OpType.SOMMA);
        Operation operazione2 = new Operation(BigDecimal.valueOf(4.5), BigDecimal.valueOf(8.9), Operation.OpType.DIVISIONE);
        Operation operazione3 = new Operation(BigDecimal.valueOf(4.5), BigDecimal.valueOf(8.9), Operation.OpType.MAX);

        System.out.println(operazione1.eseguiOperazione());
        System.out.println(operazione2.eseguiOperazione());
        System.out.println(operazione3.eseguiOperazione());
    }

}
