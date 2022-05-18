package pl.sda.arp4.javacollections.domowe;

import junit.framework.TestCase;
import org.junit.Test;

public class DziennikTest extends TestCase {

    @Test
    public void test_zwrocStuden() {
        Dziennik dziennik = new Dziennik();

        try {
            dziennik.zwrocStudenta("123");
        } catch (BrakStudentaException e) {
            System.out.println("Nie znaleziono studenta");
            e.printStackTrace();
        }

    }
    @Test
    public void test_zwrocStudentaNull() {
        Dziennik dzienik = new Dziennik();

    }

}