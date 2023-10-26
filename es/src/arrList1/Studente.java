package arrList1;

public class Studente {
    public String nome;
    public int age;

    public Studente(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}
