package J35_1;

public abstract class Sportowiec {

    private int predkosc;

    public abstract void przyspiesz();

    @Override
    public String toString() {
        return "Sportowiec{" +
                "predkosc=" + predkosc +
                " m/s}";
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }
}
