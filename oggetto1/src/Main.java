public class Main {
    public static void main(String[] args) {
        Studente student = new Studente("Luca", "Rossi", 12345);

        System.out.println("nome : " + student.getNome());
        System.out.println("cognnome : " + student.getCognome());
        System.out.println("id : " + student.getId());
    }
}