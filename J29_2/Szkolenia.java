package J29_2;

public class Szkolenia extends Oprogramowanie {

    String termin;


    public Szkolenia(String nazwa, int cena, String język, String system, String termin) {
        super(nazwa, cena, język, system);
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "Szkolenia{" +
                "termin='" + termin + '\'' +
                ", język='" + język + '\'' +
                ", system='" + system + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
