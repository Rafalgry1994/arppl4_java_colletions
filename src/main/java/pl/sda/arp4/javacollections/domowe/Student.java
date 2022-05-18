package pl.sda.arp4.javacollections.domowe;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> listaOcen = new ArrayList<>();
    private  String numerIndeksu;
    private String imie;
    private String nazwisko;

    public Student(List<Double> listaOcen, String numerIndeksu, String imie, String nazwisko) {
        this.listaOcen = new ArrayList<>();
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public Student(String numerIndeksu, String imie, String nazwisko) {

    }

    public double obliczSrednia() {
        if (listaOcen.isEmpty()) {
            System.out.println("Brak ocen");
            throw new BrakOcenException();
        }


        double suma = 0.0;
        for (int i = 0; i < listaOcen.size(); i++) {
            suma += listaOcen.get(i);
        }
        return (suma/listaOcen.size());
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

}
