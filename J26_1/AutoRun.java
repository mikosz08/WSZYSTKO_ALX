package J26_1;

public class AutoRun {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", "X1");

        a1.isZabezpieczony();
        a1.locker();
        a1.isZabezpieczony();
        a1.locker();
        a1.isZabezpieczony();
        a1.locker();
        a1.isZabezpieczony();
    }
}
