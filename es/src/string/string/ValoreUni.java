package string;

public class ValoreUni {
    public String stringa;
    public int x;
    public ValoreUni(String stringa, int x) {
        this.stringa = stringa;
        this.x = x;
    }

    public String calcoloUni() {
        if (x >= 0 && x < stringa.length()) {
            int calcolo = stringa.charAt(x);   //int al posto di char è auto-casting
            StringBuilder sb = new StringBuilder();
            sb.append(calcolo);

            return sb.toString();

        } else {
            return "Hai sbagliato";
        }
    }
}
