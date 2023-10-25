package esercizi;

public class Università {
    private  Docente[] docenti;

    public Università(Docente[] docenti) {
        this.docenti = docenti;
    }

    public Docente[] getDocenti() {
        return docenti;
    }

    public void setDocenti(Docente[] docenti) {
        this.docenti = docenti;
    }

    public int checkEtà(){
        int count = this.docenti[0].getEtà();
        for (int i = 0; i < this.docenti.length; i ++) {
            if(count > this.docenti[i].getEtà()){
                count = this.docenti[i].getEtà();
            }
        } return count;
    }


}
