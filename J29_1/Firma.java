package J29_1;

import java.util.Scanner;

public class Firma extends PracownikController {
    String nazwaFirmy;
    Scanner sc = new Scanner(System.in);

    public Firma(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
        this.menu();
    }

    void menu() {


        while (true) {
            System.out.println("D-dodaj, U-usun, Z-zmiana kontraktu, Q-koniec");
            String answ = sc.nextLine().toUpperCase();

            if (answ.equals("Q")) {
                break;
            }

            double pensja;
            String nazwisko;
            switch (answ) {
                case "D":

                    System.out.println("Dodawanie nowego pracownika..");
                    System.out.println("Imie:");
                    String imie = sc.next();
                    System.out.println("Nazwisko");
                    nazwisko = sc.next();
                    sc.nextLine();
                    System.out.println("Rodzaj Kontraktu: \n E-etat, S-staż");
                    String kontrakt = sc.nextLine().toUpperCase();
                    if (kontrakt.equals("S")) {
                        kontrakt = "Stażysta";
                        pensja = 1000;
                        dodajPracownika(imie, nazwisko, kontrakt, pensja);
                    } else if (kontrakt.equals("E")) {
                        kontrakt = "Etatowiec";
                        System.out.println("Pensja: ");
                        pensja = sc.nextDouble();
                        sc.nextLine();
                        dodajPracownika(imie, nazwisko, kontrakt, pensja);
                    } else {
                        System.out.println("Błąd, try again.");
                    }
                    break;
                case "U":
                    System.out.println("Usuwanie śmiertelnika...");
                    System.out.println("Podaj nazwisko:");
                    nazwisko = sc.nextLine();
                    usunPracownika(nazwisko);
                    break;
                case "Z":
                    System.out.println("Edycja Kontraktu...");
                    System.out.println("Podaj Nazwisko:");
                    nazwisko = sc.nextLine();
                    System.out.println("Nowa pensja dla " + nazwisko + ": ");
                    pensja = sc.nextDouble();
                    sc.nextLine();
                    zmienKontrakt(nazwisko, pensja);
                    break;
                case "P":
                    pokazPracownika();
                    break;
            }

        }
    }
}
