public class Studente {

    private String nome;

    private String cognome;

    private int id;

    public Studente(String nome, String cognome, int id) {      //Costruttore con requisiti minimi accettabili
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {                    // per convertire
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }
}
