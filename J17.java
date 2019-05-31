import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int licznik = 0;
        int max = 0;
        int min = 0;
        int suma = 0;
        int next;
        int srednia;
        System.out.println("Podawaj liczby: ");

        while (true) {
            next = sc.nextInt();
            if (next == 0) {
                break;
            }
            if (licznik == 0) {
                max = next;
                min = next;
            } else {
                if (next == 0) {
                    break;
                }
                if (max < next) {
                    max = next;
                }
                if (min > next) {
                    min = next;
                }
            }
            suma += next;

            licznik++;
        }

        srednia = suma / licznik;
        System.out.println("Podano " + licznik + " liczb/y.");
        System.out.println("Srednia liczb to : " + srednia);
        System.out.println("MAX to : " + max);
        System.out.println("MIN to : " + min);
    }

}
