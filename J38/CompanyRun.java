package J38;

import java.io.IOException;
import java.util.Scanner;

public class CompanyRun {

    public static void main(String[] args) throws IOException {

        Scanner userDecision = new Scanner(System.in);
        CompanyController controller = new CompanyController();
        final String filePath = "C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J38\\company.txt";
        String imie;
        String nazwisko;
        String wyplata;
        String fraza;
        while (true) {
            System.out.println("D-dodaj, P-pokaz, U-usun, Z-zmien, W-wyszukaj, K-koniec");
            String decyzja = userDecision.nextLine().toUpperCase();

            switch (decyzja) {
                case "D":

                    System.out.println("Podaj imie: \n");
                    imie = userDecision.nextLine();
                    System.out.println("Podaj nazwisko:");
                    nazwisko = userDecision.nextLine();
                    System.out.println("Podaj wypłatę:");
                    wyplata = userDecision.nextLine();
                    controller.dodaj(imie, nazwisko, wyplata, filePath);

                    break;
                case "P":
                    System.out.println("Zawartość pliku: ");
                    controller.odczytaj(filePath);
                    System.out.println("-----------------");
                    break;
                case "U":
                    System.out.println("Usuń | Podaj naziwkso delikwenta");
                    nazwisko = userDecision.nextLine();
                    controller.usun(nazwisko, filePath);
                    System.out.println("-----------------");
                    break;
                case "Z":
                    System.out.println("Zmiana | Podaj nazwisko");
                    nazwisko = userDecision.nextLine();
                    controller.zmien(nazwisko, filePath);
                    System.out.println("-----------------");
                    break;
                case "W":
                    System.out.println("Wyszukaj | Podaj fraze");
                    fraza = userDecision.nextLine();
                    controller.wyszukaj(fraza, filePath);
                    System.out.println("-----------------");
                    break;
                case "K":
                    System.out.println("------END------");
                    System.exit(0);
                    break;

            }

        }

    }

}
