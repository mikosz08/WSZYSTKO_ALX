package J37_1;

public class Imiona {

    String imie;

    public Imiona(String imie){
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return imie;
    }
}
