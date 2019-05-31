package J24;

public class AutoRun {
    public static void main(String[] args) {

        AutoController aC = new AutoController();

        Auto a1 = new Auto("BMW","1","niebieski","tamten",9283574);
        Auto a2 = new Auto("MAZDA","3","rozowy","tamten",9123734);
        Auto a3 = new Auto("SKODA","4","czerwony","tamten",9236474);
        Auto a4 = new Auto("FORD","5","tak","tamten",9234374);
        Auto a5 = new Auto("POLONEZ","2","zielony","tamten",9234574);

        aC.addAuto(a1);
        aC.addAuto(a2);
        aC.addAuto(a3);
        aC.addAuto(a4);
        aC.addAuto(a5);
        aC.showAuto();



    }
}
