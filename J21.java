import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J21 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String word;

        System.out.println("Podaj ciag znakow: ");

        while (true) {
            word = sc.next();
            if (word.equals("end")) {
                break;
            }
            lista.add(word);
        }
        System.out.print("[");
        for (String x : lista) {

            System.out.print(x + ",");

        }
        System.out.print("]");
    }
}
