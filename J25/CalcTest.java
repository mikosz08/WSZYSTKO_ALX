package J25;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.add(2, 3);
        calculate.add(4, 5, 7);
        calculate.add(4.5, 6.5);
        calculate.add(234.432, 420.69);
    }
}
