package J35_1;

public class Sprinter extends Sportowiec {

    @Override
    public void przyspiesz() {
        setPredkosc(getPredkosc() + (int) (Math.random() * 11000 + 1));
    }
}
