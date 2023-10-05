public class Auto {

    private int cilindrata;

    private String marca;

    private String targa;

    private String modello;

    public Auto(int cilindrata, String marca, String targa, String modello) {      //Costruttore con requisiti minimi accettabili
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.targa = targa;
        this.modello = modello;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    public int getCilindrata() {
        return this.cilindrata;
    }

    public String getTarga() {
        return this.targa;
    }


    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModello(String Modello) {
        this.modello = modello;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", marca='" + marca + '\'' +
                ", targa=" + targa +
                ", modello='" + modello + '\'' +
                '}';
    }
}
