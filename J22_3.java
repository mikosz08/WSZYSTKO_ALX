import java.util.HashSet;
import java.util.Scanner;

public class J22_3 {
    public static void main(String[] args) {
        String haslo;

        HashSet<Character> setLiterek = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Wybierz haslo: ");
        haslo = sc.next();
        boolean koniec = true;


        while (true) {
            int dlugoscHasla = 0;

            for (int i = 0; i < haslo.length(); i++) {

                char znak = haslo.charAt(i);

                if (setLiterek.contains(znak)) {
                    System.out.print(znak);
                    dlugoscHasla++;
                } else
                    System.out.print("-");
            }

            if (dlugoscHasla == haslo.length()) {
                System.out.println("\n Wygranko.");
                break;
            }

            System.out.println("\n Odgadnij literke: ");
            String litera = sc.next();
            setLiterek.add(litera.charAt(0));


        }


    }
}
