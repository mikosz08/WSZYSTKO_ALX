package J35_1;

public class RunSportowiec {


    public static void main(String[] args) {

        Sprinter sp = new Sprinter();
        sp.setPredkosc(15);

        while(sp.getPredkosc() <= 299792458){
            sp.przyspiesz();
            System.out.println(sp);
        }
        System.out.println("osiągnięto prędkość światła");
    }
}
