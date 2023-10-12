public class Main {
    public static void main(String[] args) {
        Auto car = new Auto(3000, "mercedes", "adu273dy", "classe a 180");

        System.out.println("Cilindrata : " + car.getCilindrata());
        System.out.println("Marca : " + car.getMarca());
        System.out.println("Targa : " + car.getTarga());
        System.out.println("Modello : " + car.getModello());

    }
}