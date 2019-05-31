package J23;

public class Employee {
    public String imie;
    public String nazwisko;
    public String data_urodzenia;
    public int stazPracy;

    public Employee(String imie, String nazwisko, String data_urodzenia, int stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.stazPracy = stazPracy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data_urodzenia='" + data_urodzenia + '\'' +
                ", stazPracy=" + stazPracy +
                '}';
    }
}
