package BigDeci;

import java.math.BigDecimal;

public class Operation {
    enum OpType {
        SOMMA,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    };

    private BigDecimal bd1;
    private BigDecimal bd2;

    private OpType op;

    public Operation(BigDecimal bd1, BigDecimal bd2, OpType op) {
        this.bd1 = bd1;
        this.bd2 = bd2;
        this.op = op;
    }

    public BigDecimal getBd1() {
        return bd1;
    }

    public void setBd1(BigDecimal bd1) {
        this.bd1 = bd1;
    }

    public BigDecimal getBd2() {
        return bd2;
    }

    public void setBd2(BigDecimal bd2) {
        this.bd2 = bd2;
    }

    public OpType getOp() {
        return op;
    }

    public void setOp(OpType op) {
        this.op = op;
    }

    public BigDecimal eseguiOperazione() {

        System.out.println("L'operazione in questione è una " + op + "\nI 2 numeri sono : " + bd1 + " e " + bd2);
        switch (op) {

            case SOMMA : return sum(bd1, bd2);
            
            case SOTTRAZIONE : return sub(bd1, bd2);
            
            case MOLTIPLICAZIONE : return multi(bd1, bd2);
            
            case DIVISIONE : return  div(bd1, bd2);
            
            case MIN : return min(bd1, bd2);
            
            case MAX : return max(bd1, bd2);
            
        } return BigDecimal.ZERO;
    }


    public static BigDecimal sum (BigDecimal bd1, BigDecimal bd2) {
        return  bd1.add(bd2);
    }

    public static BigDecimal sub (BigDecimal bd1, BigDecimal bd2) {
        return bd1.subtract(bd2);
    }

    public static BigDecimal multi (BigDecimal bd1, BigDecimal bd2) {
        return bd1.multiply(bd2);
    }

    public static BigDecimal div (BigDecimal bd1, BigDecimal bd2) {
        try {
            return bd1.divide(bd2);
        } catch (Exception e) {
            throw new ArithmeticException("I valori non sonon divisibili : " + e);
        }
    }
    
    public static BigDecimal max (BigDecimal bd1, BigDecimal bd2) {
        return bd1.max(bd2);
    }

    public static BigDecimal min (BigDecimal bd1, BigDecimal bd2) {
        return bd1.min(bd2);
    }

}
