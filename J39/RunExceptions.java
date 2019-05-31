package J39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunExceptions {

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5};
        boolean dziala = true;
        Scanner sc = new Scanner(System.in);

        while (dziala) {
            try {
                System.out.println("prosze daj mi liczbe błagam: (index tablicy)");
                int indexTablicy = sc.nextInt();
                System.out.println("Index: " + indexTablicy + "\n" + "Wartość: " + tab[indexTablicy]);
                dziala = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Zły index.");
            } catch (InputMismatchException ex) {
                System.err.println("Zła wartość.");
            } finally {
                sc.nextLine();
            }
        }

    }

}
