package J36_2;

import static java.lang.Math.abs;

public abstract class KontoBankowe {

    private String nrKOnta;
    private double saldo;
    private double maxDebit = 0;

    public void addSaldo(double price) {
        this.saldo += abs(price);
    }

    public void subSaldo(double price) {
        if ((this.saldo + maxDebit) >= price) {
            this.saldo -= price;
        } else {
            System.out.println("Nie można wypłacić takiej sumy!");
        }
    }

    abstract public void addDebit(double price);

    abstract public void interest();

    public String getNrKOnta() {
        return nrKOnta;
    }

    public void setNrKOnta(String nrKOnta) {
        this.nrKOnta = nrKOnta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMaxDebit() {
        return maxDebit;
    }

    public void setMaxDebit(double maxDebit) {
        this.maxDebit = maxDebit;
    }


}
