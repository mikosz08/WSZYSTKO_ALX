package J36_2;

import java.util.Scanner;

public class BankApplication {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BankApplication bA = new BankApplication();
    }

    public BankApplication() {
        System.out.println("Gdzie chciałbyś utworzyć konto?" +
                "\n 1).ING - 5%" +
                "\n 2).PKO - 3%");
        int answer = sc.nextInt();
        sc.nextLine();
        KontoBankowe kontoBankowe;

        if (answer == 1) {
            kontoBankowe = new ING();
            operacjeKonta(kontoBankowe);

        } else if (answer == 2) {

            kontoBankowe = new PKO();
            operacjeKonta(kontoBankowe);
        } else {
            System.out.println("no, takiego nie mamy");
        }

    }

    public void operacjeKonta(KontoBankowe kb) {
// nr konta
        System.out.println("Podaj numer konta: ");

        String numerKonta = sc.nextLine();
        kb.setNrKOnta(numerKonta);

 // saldo poczatkowe
        System.out.println("Podaj saldo początkowe");
        double saldoPoczatkowe = sc.nextDouble();
        sc.nextLine();

        if (saldoPoczatkowe != 0) {
            kb.setSaldo(saldoPoczatkowe);
        }

        System.out.println(kb);
//dodaj do salda
        System.out.println("Podaj ile mam dodać do salda: ");
        double dodajDoSalda = sc.nextDouble();
        if(dodajDoSalda != 0){
            kb.addSaldo(dodajDoSalda);
        }
        System.out.println("Na koncie jest " + kb.getSaldo());
//ustaw maxDebit
        System.out.println("Jaki ustawić max debet?");
        double maxDebit = sc.nextDouble();

        if (!(maxDebit < 0)) {
            kb.addDebit(maxDebit);
        }
        System.out.println(kb);
        System.out.println("Ile mam wypłacic?");
        double ileWyplacic = sc.nextDouble();
        if(ileWyplacic != 0){
            kb.subSaldo(ileWyplacic);
        }
        System.out.println("Na koncie pozostało " + kb.getSaldo());
        System.out.println(kb);
        kb.interest();
        System.out.println(kb);
    }
}
