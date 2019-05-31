package J25_1;

import java.util.HashMap;

public class Koszyk {
    HashMap<String, Integer> koszyk = new HashMap<>();

    void dodajProdukt(String produkt, int ilosc) {
        koszyk.put(produkt, ilosc);
    }

}
