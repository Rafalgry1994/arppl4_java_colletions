package pl.sda.arp4.javacollections;

import java.util.*;


public class MainListaString {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String element;
        do {
            System.out.println("Wpisz kolejny element, lub wpisz quit aby zakończyć");
            element = scanner.next();

            if (!element.equals("quit")) {
                lista.add(element);

            }
        }while (!element.equals("quit")) ;

            System.out.println("Wpisane elementy");
            System.out.println(lista);

        System.out.println("Wpisz elementy do znalezienia:");
        String szukanyElement = scanner.next();

        int indeksSzukanegoElementu = lista.indexOf(szukanyElement);
        System.out.println("Znaleziono na indeksie: " + indeksSzukanegoElementu);


        boolean czyZnaleziono = lista.contains(szukanyElement);
        System.out.println("Czy lista contains szukany element" + czyZnaleziono);

        System.out.println("Czy lista jest pusta:" + lista.isEmpty());

        System.out.println("Rozmiar listy wynosi: " + lista.size());

        Collections.sort(lista);


        }
    }
