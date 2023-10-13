package enu;
 public class Rettangolo extends Forma {

        public int x;
        public int y;
        public final Shape tipo;

        public Rettangolo(int x, int y, Shape tipo) {
            this.x = x;
            this.y = y;
            this.tipo = tipo;
        }

        public void calcolaArea() {
            System.out.println("L' area del rettangolo è " + (x * y));
        }

 }
