package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//          Primer izvrsenja:
//          Unesite N: 3
//          Unesite broj: 1
//          Unesite broj: 4
//          Unesite broj: 9
//          Suma je 14.

        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            sum = sum + broj;
        }

        System.out.print("Suma je " + sum);


    }
}
