import java.util.Scanner;

public class J17_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int podstawa = 0;
        int potega = 0;
        int wynik = 1;
        System.out.println("Podaj podstawe");
        podstawa = sc.nextInt();
        System.out.println("Podaj potege");
        potega = sc.nextInt();
        if (podstawa >= 0) {
            for (int i = 0; i < potega; i++) {
                wynik *= podstawa;
            }
            if (potega == 0) {
                wynik = 1;
            }
            System.out.println(wynik);
        } else {
            System.err.println("potęga równa " + potega);
        }

    }

}