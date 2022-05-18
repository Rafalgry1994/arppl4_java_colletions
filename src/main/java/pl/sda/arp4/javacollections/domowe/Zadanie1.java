package pl.sda.arp4.javacollections.domowe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Podaj element");
            lista.add(scanner.nextInt());

        }

        Random genetator = new Random();
        for (int i = 0; i < 5; i++) {
            int liczba = scanner.nextInt();

            lista.add(genetator.nextInt(100));



        }
        System.out.println("Elementy listy");
        System.out.println(lista);
    }
}
