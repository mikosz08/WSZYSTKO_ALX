package J34_1;

public class Zawodnik implements Zawody {

    String imie;
    int wiek;
    int waga;

    public Zawodnik(String imie, int wiek, int waga) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
    }

    @Override
    public String plywanie() {

        return this.imie + " plywa";
    }

    @Override
    public String skakanie() {

        return this.imie + " skacze";
    }

    @Override
    public String bieganie() {

        return this.imie + " biega";
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", waga=" + waga +
                '}';
    }
}
