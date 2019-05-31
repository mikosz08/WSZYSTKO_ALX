package J29_1;

import java.util.ArrayList;

public class PracownikController {

    ArrayList<Pracownik> listaPracownikow = new ArrayList<>();

    void dodajPracownika(String imie, String nazwisko, String kontrakt, double pensja) {

        Pracownik p = new Pracownik(imie, nazwisko, kontrakt, pensja);
        listaPracownikow.add(p);

    }

    void pokazPracownika() {

        for (Pracownik p : listaPracownikow) {
            System.out.println(p);
        }

    }

    void usunPracownika(String nazwisko) {
        for (Pracownik s : listaPracownikow) {
            if (s.getNazwisko().equals(nazwisko)) {
                listaPracownikow.remove(s);
                break;
            }
        }
        pokazPracownika();
    }

    void zmienKontrakt(String nazwisko, double pensja) {

        for (Pracownik s : listaPracownikow) {
            if (s.getNazwisko().equals(nazwisko) && s.getKontrakt().equals("Etatowiec")) {
                s.setPensja(pensja);
            } else if (s.getNazwisko().equals(nazwisko) && s.getKontrakt().equals("Stażysta")) {
                s.setKontrakt("Etatowiec");
                s.setPensja(pensja);
            }
        }

    }

}
