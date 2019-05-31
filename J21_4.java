import java.util.ArrayDeque;

public class J21_4 {
    public static void main(String[] args) {
        ArrayDeque<String> kolejka = new ArrayDeque<>();

        kolejka.addFirst("A");
        kolejka.addLast("B");
        kolejka.addLast("C");
        kolejka.addLast("D");
        kolejka.addLast("E");


        for (String tmp : kolejka) {
            System.out.print(tmp);
        }

        kolejka.removeFirst();
        kolejka.removeFirst();

        kolejka.removeLast();
        kolejka.removeLast();

        System.out.println(kolejka);
        kolejka.addLast("G");
        kolejka.addFirst("P");
        System.out.println(kolejka);
    }
}