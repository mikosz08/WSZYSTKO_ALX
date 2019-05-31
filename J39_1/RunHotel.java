package J39_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunHotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // rrrr-mm-dd
        String dataPrzybycia = null;
        int iloscDni;
        int iloscOsob;
        boolean sniadanie = false;
        String imie;

        while (true) {

            //DataPrzybycia
            try {

                System.out.println("Data przybycia: [rrrr-mm-dd]");
                dataPrzybycia = sc.nextLine();
                String[] tablicaRMD = dataPrzybycia.split("-");

                //sprawdzam czy input to cyfry
                Integer.parseInt(tablicaRMD[0]);
                Integer.parseInt(tablicaRMD[1]);
                Integer.parseInt(tablicaRMD[2]);

                System.out.println(tablicaRMD[0] + " " + tablicaRMD[1] + " " + tablicaRMD[2] + " ");

                //sprawdzam czy pattern się zgadza
                if (dataPrzybycia.length() != 10 || tablicaRMD[0].length() != 4
                        || tablicaRMD[1].length() != 2 || tablicaRMD[2].length() != 2) {
                    System.out.println("Data nie przyjęta.");
                    continue;
                } else {
                    System.out.println("Data przyjęta. ");
                    while (true) {

                        //Osoby + DniPobytu
                        try {
                            System.out.println("Na ile dni?");
                            iloscDni = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ile osób?: ");
                            iloscOsob = sc.nextInt();
                            sc.nextLine();


                            //Czy śniadanie
                            while (true) {
                                try {
                                    System.out.println("Wyżywienie? [T/N]");
                                    String answer = sc.nextLine();

                                    if (answer.toUpperCase().equals("T")) {
                                        System.out.println("Dostaniesz jeść.");
                                        sniadanie = true;
                                    } else if (answer.toUpperCase().equals("N")) {
                                        System.out.println("Nie dostaniesz jeść.");
                                    } else {
                                        System.err.println("Błędny format");
                                        continue;
                                    }
                                } catch (Exception e) {
                                    System.err.println("Błąd");
                                    continue;
                                }

                                System.out.println("Na koniec, podaj Imie: ");
                                try {
                                    imie = sc.nextLine();
                                    System.out.println("Czyli: \n" +
                                            "Przyjazd: " + dataPrzybycia + " Zostajesz na " + iloscDni + " dni ,weźmiesz ze sobą " + iloscOsob + " osob i " + (sniadanie == true ? "dostaniesz jesc" : "nie dostaniesz"));
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Błąd");
                                }

                            }


                        } catch (Exception e) {
                            System.err.println("Błędny format.");
                            System.out.println("Spróbuj jeszcze raz.");
                            continue;
                        } finally {
                            sc.nextLine();
                        }
                        break;
                    }
                }

                break;

            } catch (Exception e) {
                System.err.println("Błąd");
            }


        }

    }

}
