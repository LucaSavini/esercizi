package link;

public class Fruit {
    private String nome;

    public Fruit(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
