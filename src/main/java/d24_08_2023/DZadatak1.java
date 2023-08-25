package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DZadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//    Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//    Primer:
//    Unesite pozicjiu od 0 do 9: 3
//    Unesite novu vrednost: 11
//    Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(30);
        numbers.add(15);
        numbers.add(18);
        numbers.add(20);
        numbers.add(40);

        System.out.print("Enter number index from 0 to 9: ");
        int index = s.nextInt();

        System.out.print("Enter new number value: ");
        int numValue = s.nextInt();

        int numNew = numbers.set(index, numValue);

        System.out.println("The element with the index no." + index + " has a new value: " + numbers.get(index) + ".");

    }
}
