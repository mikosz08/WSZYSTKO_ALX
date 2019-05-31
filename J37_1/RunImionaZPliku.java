package J37_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunImionaZPliku {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J37_1\\imiona.txt"));
        List<Imiona> listaImion = new ArrayList<>();

        while (sc.hasNextLine()) {
            String imie = sc.nextLine();
            listaImion.add(new Imiona(imie));
        }

        int counter = 0;

        for (Imiona imie : listaImion) {
            counter++;
            System.out.println(counter + ")." + imie);
        }
    }

}
