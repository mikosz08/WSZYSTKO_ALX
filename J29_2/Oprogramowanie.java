package J29_2;

public class Oprogramowanie extends Produkt {

    String język;
    String system;

    public Oprogramowanie(String nazwa, int cena, String język, String system) {
        super(nazwa, cena);
        this.język = język;
        this.system = system;
    }
}
