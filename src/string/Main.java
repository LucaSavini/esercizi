package string;

public class Main {

  public static void main(String[] args) {

      String test = "Luca";
      //System.out.println(test);
      test = "Mario";   // sovrascrizione momentanea
      System.out.println(test);
      ValoreUni valoreUni = new ValoreUni(test.toLowerCase(),20);
      StringBuilder sb = new StringBuilder();
      sb.append(valoreUni.calcoloUni());

      //String res = valoreUni.calcoloUni(x);

      System.out.println(sb);

  }

}
