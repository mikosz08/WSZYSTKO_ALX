package J36_2;

public class PKO extends KontoBankowe {

    @Override
    public void addDebit(double price) {
        this.setMaxDebit(price);
    }

    @Override
    public void interest() {
        this.addSaldo((this.getSaldo() * 0.03));
    }

    @Override
    public String toString() {
        return "KontoBankowe PKO{" +
                "nrKOnta: '" + this.getNrKOnta() + '\'' +
                ", saldo: " + this.getSaldo() +
                ", maxDebit: " + this.getMaxDebit() +
                '}';
    }
}
