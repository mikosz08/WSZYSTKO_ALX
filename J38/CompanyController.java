package J38;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyController {

    FileWriter fw;
    Scanner readFile;
    ArrayList<String> lista;

    public void dodaj(String imie, String nazwisko, String wyplata, String filePath) throws IOException {

        fw = new FileWriter(filePath, true);
        fw.append(imie + " " + nazwisko + " " + wyplata + "\n");
        fw.close();
    }

    public void odczytaj(String filePath) throws FileNotFoundException {
        readFile = new Scanner(new File(filePath));

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            System.out.println(line);
        }
        readFile.close();
    }

    public void usun(String nazwisko, String filePath) throws IOException {
        lista = new ArrayList<>();
        readFile = new Scanner(new File(filePath));

        while (readFile.hasNextLine()) {

            String line = readFile.nextLine();
            String[] dane = line.split(" ");
            if (!dane[1].equals(nazwisko)) {
                lista.add(line);
            }

        }
        readFile.close();

        fw = new FileWriter(filePath, false);
        for (String dane : lista) {
            fw.append(dane);
        }
        fw.close();

    }

    public void zmien(String nazwisko, String filePath) throws IOException {

        readFile = new Scanner(new File(filePath));
        Scanner userInput = new Scanner(System.in);
        lista = new ArrayList<>();

        while (readFile.hasNextLine()) {

            String line = readFile.nextLine();
            String[] dane = line.split(" ");
            String nowe;

            if (!dane[1].equals(nazwisko)) {
                lista.add(line);
            } else if (dane[1].equals(nazwisko)) {

                System.out.println("Nowe imie:");
                nowe = userInput.nextLine();
                if (!nowe.equals("")) {
                    dane[0] = nowe;
                }
                System.out.println("Nowe nazwisko:");
                nowe = userInput.nextLine();
                if (!nowe.equals("")) {
                    dane[1] = nowe;
                }
                System.out.println("Nowe imie:");
                nowe = userInput.nextLine();
                if (!nowe.equals("")) {
                    dane[2] = nowe;
                }
                lista.add(dane[0] + " " + dane[1] + " " + dane[2]);
            }
        }

        readFile.close();
        fw = new FileWriter(filePath, false);
        for (String daneLista : lista) {
            fw.append(daneLista+"\n");
        }
        fw.close();
        //userInput.close();
    }

    public void wyszukaj(String fraza, String filePath) throws FileNotFoundException {

        lista = new ArrayList<>();
        readFile = new Scanner(new File(filePath));

        while (readFile.hasNextLine()) {
            //indexOf
            String wiersz = readFile.nextLine();
            if (wiersz.contains(fraza)) {
                System.out.println(wiersz);
            }

        }


        readFile.close();
    }
}
