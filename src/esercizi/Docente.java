package esercizi;

public class Docente {
    private String nome;

    private String cognome;

    private int età;

    private int id;

    public Docente(String nome, String cognome, int età, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + età +
                ", id=" + id +
                '}';
    }
}
