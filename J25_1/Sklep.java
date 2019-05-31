package J25_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Koszyk> koszyki = new ArrayList<>();

        HashMap<String, Double> asortyment = new HashMap<>();

        asortyment.put("sok", 1.50);
        asortyment.put("hermanmiuller", 1.70);
        asortyment.put("bułeczka", 0.55);

        System.out.println(asortyment);
        while (true) {

            System.out.println("Czy chcesz kontynuowac jako nowy klient [T/N]");
            String answ = sc.nextLine();

            if (answ.equals("T")) {

                Koszyk koszykKlienta = new Koszyk();

                while (true) {

                    System.out.println("Co chcesz kupić?");
                    String nazwaProduktu = sc.nextLine();

                    if (nazwaProduktu.equals("")) {
                        koszyki.add(koszykKlienta);
                        break;
                    } else {

                        System.out.println("Wybrano " + nazwaProduktu + ", ile sztuk? :");
                        int sztuki = sc.nextInt();
                        sc.nextLine();

                        koszykKlienta.dodajProdukt(nazwaProduktu, sztuki);

                    }
                }

            } else {

                int numerKlienta = 1;
                System.out.println("Kupiłeś: ");

                //wypisz koszyk:
                for (Koszyk k : koszyki) {

                    System.out.println("Klient " + numerKlienta);
                    System.out.println(k.koszyk);
                    System.out.println("Do zapłaty:");

                    double suma = 0;

                    for (String produkt : k.koszyk.keySet()) {
                        suma += asortyment.get(produkt) * k.koszyk.get(produkt);
                        System.out.println(suma + " zł.");
                    }

                    numerKlienta++;

                }
                break;
            }


        }
    }

}

