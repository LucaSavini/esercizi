package string;

public class Main {

  public static void main(String[] args) {

      String test = "Luca";
      //System.out.println(test);
      test = "Mario";   // sovrascrizione momentanea
      System.out.println(test);
      ValoreUni valoreUni = new ValoreUni(test.toLowerCase(),2);
      StringBuilder sb = new StringBuilder();
      sb.append(valoreUni.calcoloUni());



      System.out.println(sb);

  }

}



