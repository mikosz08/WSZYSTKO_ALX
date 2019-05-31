package J37;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RunKsiazkaZPliku {

    public static void main(String[] args) throws FileNotFoundException {
/*

        Scanner sc = new Scanner(new File("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J37\\books.txt"));
        String[] tabDane = null;

        while (sc.hasNextLine()) {
            tabDane = sc.nextLine().split(",");

            String nazwa, autor;
            int rokWydania;
            nazwa = tabDane[0];
            autor = tabDane[1];
            rokWydania = Integer.parseInt(tabDane[2]);
            Ksiazka book = new Ksiazka(nazwa, autor, rokWydania);
            System.out.println(book);
            //mozna najpierw dodawac do listy <Ksiazka> i potem foreachem.
        }
*/

        PrintWriter zapis = new PrintWriter("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J37\\books.txt");
        zapis.println("hahaaaaa");
        zapis.close();

    }

}
