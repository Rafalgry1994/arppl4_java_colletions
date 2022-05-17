package pl.sda.arp4.javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaDoSkopiowaniaAleNieUzywania = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(listaDoSkopiowaniaAleNieUzywania);

        ArrayList<Integer> lista = new ArrayList<>(listaDoSkopiowaniaAleNieUzywania);
        System.out.println(lista);

        lista.add(6);
        System.out.println(lista);

// dodanie większej ilości elementów
        lista.addAll(Arrays.asList(100, 200, 300));

        lista.remove(1);
        System.out.println(lista);

        int indeksPiatki = lista.lastIndexOf(5);
    }
}
