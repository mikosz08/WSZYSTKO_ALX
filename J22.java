import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class J22 {
    public static void main(String[] args) {

        HashMap<String, Double> towar = new HashMap();
        List<String> koszyk = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String zakup;
        int doZaplaty = 0;

        //         key    value
        towar.put("woda", 1.43);
        towar.put("chleb", 5.34);
        towar.put("mleko", 3.14);
        towar.put("jajka", 1.14);
        towar.put("cukier", 23.54);

        for (String tmp : towar.keySet()) {
            System.out.print(tmp + " " + towar.get(tmp) + " \n");
        }

        System.out.println("Co byś chciał kupić?");

        while (true) {
            System.out.println("Nazwa towaru: ");
            zakup = sc.nextLine();

            if (zakup.equals("")) {
                break;
            }

            koszyk.add(zakup);
        }

        for (String tmp : koszyk) {
            double cena = towar.get(tmp);
            doZaplaty += cena;
        }




        System.out.println(koszyk);
        System.out.println("Do zapłaty zostało: " + doZaplaty + " zł.");
    }
}
