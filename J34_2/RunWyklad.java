package J34_2;


public class RunWyklad {

    public static void main(String[] args) {
        Przedmiot przedmiot = new Przedmiot("PPJ");
        przedmiot.addProwadzacyCwiczenia("DOKTOR WERNER");
        przedmiot.addProwadzacyWyklad("JEGO EKSCELENCJA THOMASZEWSKI");
        System.out.println(przedmiot);
    }

}
