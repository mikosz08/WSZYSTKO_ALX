package JOdJednegoDoStu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunDoStu {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\kurs\\Desktop\\ProjektyALX\\src\\JOdJednegoDoStu\\Od1Do100.txt", true);

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                fw.append(i + "\n");
            }

        }

        fw.close();
    }

}
