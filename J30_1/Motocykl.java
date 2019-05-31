package J30_1;

public class Motocykl extends PojazdKołowy {

    boolean bagaznikNaKask;

    public Motocykl(int waga, int mocSilnika, String kolor, int liczbaPasazerow, double cena, int liczbaKol, boolean bagaznikNaKask) {
        super(waga, mocSilnika, kolor, liczbaPasazerow, cena, liczbaKol);
        this.bagaznikNaKask = bagaznikNaKask;
    }
}
