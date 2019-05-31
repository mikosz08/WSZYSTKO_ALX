package J37_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RunZapiszDoPliku {

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);

        PrintWriter printWriter = new PrintWriter("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J37_2\\ciapciap2.txt");

        //System.out.println("Podaj text do zapisu: ");
        //String text = userInput.nextLine();
        //printWriter.println(text);

        printWriter.close();
        // file writera mozna uzywac zamiast printwritera tylko z append: false

        FileWriter fileWriter = new FileWriter("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\J37_2\\ciapciap2.txt", true);

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". Podaj imie: ");
            String imie = userInput.nextLine();
            fileWriter.append(imie + "\n");
        }

        fileWriter.close();

    }

}
