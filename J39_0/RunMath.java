package J39_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbe:");
            try {

                int liczba = sc.nextInt();

                if (liczba < 0) {
                    System.err.println("Błąd, podana liczba jest ujemna.");
                    sc.nextLine();
                    continue;
                }
                System.out.println(Math.sqrt(liczba));

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.err.println("Zły format");

            }

        }

    }

}
