package J34_1;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {
        ArrayList<Zawodnik> listaZawodnikow = new ArrayList<>();

        listaZawodnikow.add(new Zawodnik("Maćko", 23, 83));
        listaZawodnikow.add(new Zawodnik("Maćko1", 26, 87));
        listaZawodnikow.add(new Zawodnik("Maćko2", 27, 76));
        listaZawodnikow.add(new Zawodnik("Maćko3", 72, 57));
        listaZawodnikow.add(new Zawodnik("Maćko4", 99, 66));

        for (Zawodnik zawodnik : listaZawodnikow) {
            System.out.println(zawodnik);
            System.out.println(zawodnik.bieganie());
            System.out.println(zawodnik.plywanie());
            System.out.println(zawodnik.skakanie());
            System.out.println("---------------");
        }

    }

}
