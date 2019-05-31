package J30_1;

public class PojazdKołowy extends Pojazd {

    int liczbaKol;

    public PojazdKołowy(int waga, int mocSilnika, String kolor, int liczbaPasazerow, double cena, int liczbaKol) {
        super(waga, mocSilnika, kolor, liczbaPasazerow, cena);
        this.liczbaKol = liczbaKol;
    }
}
