import java.util.Scanner;

public class J14_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Podaj slowo:");
        word = sc.next();
        System.out.println("Podano " + word);

        int wystapienia = 0;
        int index = 0;
        char szukany = 0;


        while (index < word.length()) {

            szukany = word.charAt(index);
            for (int i = 0; i < word.length(); i++) {


                if (szukany == word.charAt(i)) {
                    wystapienia++;
                }

            }
            System.out.println(szukany + " wystapilo " + wystapienia + " raz/y.");
            wystapienia = 0;
            index++;

        }

    }
}
