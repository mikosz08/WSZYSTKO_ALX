import J23.Employee;

public class Company {
    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Tomek", "Tomeczko", "wczoraj", -1);
        Employee pracownik2 = new Employee("Maciek", "Maćko", "dzisiaj", 17);
        Employee pracownik3 = new Employee("Gabe", "Newell", "3 listopada 1962", 13);

        System.out.println(pracownik1);
        System.out.println(pracownik2);
        System.out.println(pracownik3);
    }
}
