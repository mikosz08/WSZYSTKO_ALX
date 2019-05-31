package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    //DZIEKANAT\

    Scanner sc = new Scanner(System.in);

    private ArrayList<Student> listaStudentow = new ArrayList<>();

    public StudentController() {
        String answ;

        while (true) {
            System.out.println("D-dodaj, P-pokaż ,U-usun, M-modyfikuj, L-liczba studentow, Q-quit");

            answ = sc.nextLine().toUpperCase();

            if (answ.equals("Q")) {
                break;
            }

            switch (answ) {
                case "D":
                    dodajStud();
                    break;

                case "P":
                    pokazJednegoStud();
                    break;

                case "U":
                    usunStud();
                    break;

                case "M":
                    modStud();
                    break;

                case "L":
                    pokazStud();
                    break;

            }

        }

    }

    void dodajStud() {
        String imie;
        String nazwisko;
        int index;
        System.out.println("Podaj imie:");
        imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = sc.nextLine();
        System.out.println("Podaj index");
        index = sc.nextInt();
        sc.nextLine();
        listaStudentow.add(new Student(imie, nazwisko, index));
        System.out.println("Dodano studenta.");
    }

    void pokazStud() {
        for (Student s : listaStudentow) {
            System.out.println(s);
        }
        System.out.println(Student.count);
    }

    void usunStud() {

        int index;

        System.out.println("Podaj index śmiertelnika: ");

        index = sc.nextInt();

        for (Student s : listaStudentow) {
            if (s.getIndex() == index) {
                listaStudentow.remove(s);
                Student.count--;
                break;
            }
        }
        sc.nextLine();
    }

    void modStud() {
        int index;
        System.out.println("Modyfikuj index:");
        index = sc.nextInt();
        sc.nextLine();

        for (Student s : listaStudentow) {
            if (s.getIndex() == index) {
                String newName;
                String newSurname;

                System.out.println("Nowe imie:");
                newName = sc.nextLine();

                if (!newName.equals("")) {
                    s.setImie(newName);
                }

                System.out.println("Nowe nazwisko:");
                newSurname = sc.nextLine();
                if (!newSurname.equals("")) {
                    s.setNazwisko(newSurname);
                }

                break;

            }
        }
    }

    void pokazJednegoStud() {
        int index;

        System.out.println("Podaj index studenta: ");

        index = sc.nextInt();
        sc.nextLine();
        for (Student s : listaStudentow) {
            if (s.getIndex() == index) {
                System.out.println(s);
            }
        }

    }

}
