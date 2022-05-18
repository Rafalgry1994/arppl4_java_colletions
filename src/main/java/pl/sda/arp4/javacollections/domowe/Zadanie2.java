package pl.sda.arp4.javacollections.domowe;

import java.util.*;

public class Zadanie2 {
    private static final int ILOSC_LICZB = 10;
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < ILOSC_LICZB; i++) {
            lista.add(generator.nextInt(100));

        }

        double suma = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);

        }
        System.out.println("Suma liczb to:" + suma);
        //double srednia = suma / lista.size();
        System.out.println("Suma liczb to:" + suma/ lista.size());

        List<Integer> posortownieLiczb = new ArrayList<>(lista);
        Collections.sort(posortownieLiczb);

        if (posortownieLiczb.size() % 2 == 0) {
            int rozmiarListy = posortownieLiczb.size();
            int indeksSrodkowElementu = rozmiarListy / 2;

            int liczba1 = posortownieLiczb.get(indeksSrodkowElementu);
            int liczba2 = posortownieLiczb.get(indeksSrodkowElementu - 1);

            //mediana = (liczba1 + liczba2) / 2.0;
        }else {
            int rozmiarListy = posortownieLiczb.size();
            int indeksSrodkowegoElementu = rozmiarListy /2;

            //mediana = posortownieLiczb.get(indeksSrodkowegoElementu);

        }
        //System.out.println("Mediana = " + mediana);

    }
}
