package esercizi;

public class Università2 {


    public static int checkEtà(Docente[] docenti){
        int count = docenti[0].getEtà();
        for (int i = 0; i < docenti.length; i ++) {
            if(count > docenti[i].getEtà()){
                count = docenti[i].getEtà();
            }
        } return count;
    }
}

