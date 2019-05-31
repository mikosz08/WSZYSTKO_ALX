import java.util.HashSet;

public class J21_2 {
    public static void main(String[] args) {
        HashSet<String> secior1 = new HashSet<>();
        secior1.add("A");
        secior1.add("B");
        secior1.add("C");
        secior1.add("D");
        secior1.add("E");
        System.out.println(secior1);

        HashSet<String> secior2 = new HashSet<>();
        secior2.add("A");
        secior2.add("B");
        secior2.add("F");
        secior2.add("D");
        secior2.add("G");
        System.out.println(secior2);

        System.out.println("Rozmiar zbioru 1: " + secior1.size());
        System.out.println("Rozmiar zbioru 2: " + secior2.size());
        secior1.addAll(secior2);
        System.out.println("Po dodaniu 2 zbiorow: " + secior1.size());
        secior1.remove("A");
        System.out.println("Zbior 1 po usunieciu A: " + secior1.size());
    }
}
