package J30_1;

public class Samochód extends PojazdKołowy {
    String typFelg;

    public Samochód(int waga, int mocSilnika, String kolor, int liczbaPasazerow, double cena, int liczbaKol, String typFelg) {
        super(waga, mocSilnika, kolor, liczbaPasazerow, cena, liczbaKol);
        this.typFelg = typFelg;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "typFelg='" + typFelg + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", kolor='" + kolor + '\'' +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", cena=" + cena +
                '}';
    }
}
