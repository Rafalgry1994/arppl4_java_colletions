package pl.sda.arp4.javacollections.domowe;

public class BrakStudentaException extends Exception{
    public BrakStudentaException(String numerIndeksu) {
        super("Nie znaleziono studenta o numerze indeksu:" + numerIndeksu);
    }
}
