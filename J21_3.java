import java.util.HashMap;
import java.util.Scanner;

public class J21_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> mapka = new HashMap<>();
        mapka.put("zero", 0);
        mapka.put("jeden", 1);
        mapka.put("dwa", 2);
        mapka.put("trzy", 3);
        mapka.put("cztery", 4);
        mapka.put("pięć", 5);
        mapka.put("sześć", 6);

        String var1;
        String var2;

        System.out.println("Podaj 1 liczbę (slownie)");
        var1 = sc.next();
        System.out.println("Podaj 2 liczbę (slownie)");
        var2 = sc.next();

        System.out.println(mapka.get(var1));
        System.out.println(mapka.get(var2));

        int res = mapka.get(var1) + mapka.get(var2);
        System.out.println(res);


        System.out.print("[");
        for (String tmp : mapka.keySet()) {
            System.out.print(tmp + " ");
        }
        System.out.print("] \n");

        System.out.print("[");
        for (Integer tmp : mapka.values()) {
            System.out.print(tmp + " ");
        }
        System.out.print("] \n");

        System.out.print("[");
        for (String tmp : mapka.keySet()) {
            System.out.print(tmp + " " + mapka.get(tmp) + " ");
        }
        System.out.print("] \n");
    }
}
