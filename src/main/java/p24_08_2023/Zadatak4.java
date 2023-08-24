package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//   4.Zadatak
//      Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//  Primer:
//  Unesite pozicjiu: 2
//  Na pozicji 2 je vrednost 7.

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(12);
        numbers.add(10);

        System.out.print("Enter number position: ");
        int k = s.nextInt();

        if (k != numbers.get(numbers.size() - 1)) {
            System.out.println("Number value: " + numbers.get(k));
        }

    }
}
