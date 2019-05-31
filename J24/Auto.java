package J24;

public class Auto {
    String marka;
    String model;
    String kolor;
    String silnik;

    double cena;

    public Auto() {

    }

    public Auto(String marka, String model, String kolor, String silnik, double cena) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.silnik = silnik;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", silnik='" + silnik + '\'' +
                ", cena=" + cena +
                '}';
    }
}
