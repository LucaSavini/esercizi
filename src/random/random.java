package random;

import java.util.Random;

public class random{
    public static void main(String[] args) {

        String[] persone = {"Pietro", "Paola", "Antonio B.", "Luca DiG.", "Fabio",
                "Maria Grazia", "Simone", "Valeria", "Andrea M.", "Antonio T.", "Bruno", "Savini L.",
                "Andrea L.", "Giorgia", "Marc", "Riccardo G.", "Riccardo", "Tino", "Antonio I."};

        // System.out.print(persone.length);
        Random numero = new Random();
        int indice = numero.nextInt(persone.length);
        System.out.println("La persona fortunata è il numero: " + persone[indice]);
    }
}
