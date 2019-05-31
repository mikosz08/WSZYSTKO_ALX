package J37;

import java.io.File;

public class Ksiazka {

    String nazwa;
    String autor;
    int rokWydania;

    public Ksiazka(String nazwa, String autor, int rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = rokWydania;


    }

    @Override
    public String toString() {
        return "Ksiazka\n" +
                "Tytuł: " + nazwa + " \n" +
                "Autor: " + autor + "\n" +
                "Rok: " + rokWydania + "\n";
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

}
