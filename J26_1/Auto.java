package J26_1;

import javax.swing.*;

public class Auto {
    private String marka;
    private String model;
    private boolean zabezpieczony = true;

    public Auto(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public void isZabezpieczony() {
        if (zabezpieczony == true) {
            System.out.println("Auto jest zamknięte");
        } else {
            System.out.println("Auto jest otwarte");
        }
    }

    public void locker() {
        int pin;

        pin = Integer.parseInt(JOptionPane.showInputDialog("Chcesz "+(zabezpieczony==true ? "otwórz" : "zamknij")+" auto. \n Podaj pin:"));

        if (zabezpieczony == true && pin == 3145) {
                zabezpieczony = false;
            }
        else if (zabezpieczony == false && pin == 3145) {
            zabezpieczony = true;
        }
        else {
            System.out.println("invalid pin");
        }


    }


}
