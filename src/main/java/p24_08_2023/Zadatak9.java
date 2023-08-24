package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

//   4.Zadatak
//      Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//  Primer:
//  Unesite pozicjiu: 2
//  Na pozicji 2 je vrednost 7.

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();
        int num = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            num = s.nextInt();
            numbers.add(num);
        }
        System.out.println("Numbers are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers.get(i) + ", ");
        }
    }
}
