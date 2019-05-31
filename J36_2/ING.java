package J36_2;

public class ING extends KontoBankowe {

    @Override
    public void addDebit(double price) {
        this.setMaxDebit(price);
    }

    @Override
    public void interest() {
        this.addSaldo((this.getSaldo() * 0.05));
    }

    @Override
    public String toString() {
        return "KontoBankowe ING{" +
                "nrKOnta: '" + this.getNrKOnta() + '\'' +
                ", saldo: " + this.getSaldo() +
                ", maxDebit: " + this.getMaxDebit() +
                '}';
    }
}
