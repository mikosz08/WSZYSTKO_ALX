package J34_2;

public class Przedmiot implements Wyklad, Cwiczenia {

    private String prowadzacyCwiczenia;
    private String prowadzacyWyklad;
    private String nazwa;

    public Przedmiot(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Przedmiot{ \n" +
                "Prowadzacy Cwiczenia: '" + prowadzacyCwiczenia + "\'" +
                ", \nProwadzacyWyklad: '" + prowadzacyWyklad + "\'" +
                ", \nNazwa: '" + nazwa + '\'' +
                "\n }";
    }

    @Override
    public void addProwadzacyCwiczenia(String imie) {
        this.prowadzacyCwiczenia = imie;
    }

    @Override
    public void addProwadzacyWyklad(String imie) {
        this.prowadzacyWyklad = imie;
    }
}
