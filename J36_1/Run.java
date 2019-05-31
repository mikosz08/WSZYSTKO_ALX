package J36_1;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {
        ArrayList<Figury> lista = new ArrayList<>();

        Kwadrat k = new Kwadrat();
        Kolo ko = new Kolo();
        Figury f = new Kolo();

        lista.add(k);
        lista.add(ko);
        lista.add(f);

        for (Figury figura : lista) {
            System.out.println(figura);
        }
    }
}
