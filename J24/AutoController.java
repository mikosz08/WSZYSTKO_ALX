package J24;

import java.util.ArrayList;
import java.util.List;

public class AutoController {
    List<Auto> listaAut = new ArrayList<>();

    void addAuto(Auto a) {
        listaAut.add(a);
    }

    void showAuto() {

        for (Auto a : listaAut) {
            System.out.println(a);
        }

    }
}
