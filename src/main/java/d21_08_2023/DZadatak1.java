package d21_08_2023;

import java.util.Scanner;

public class DZadatak1 {
    public static void main(String[] args) {

//        1. Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Suma parnih brojeva je 16
//        Objasnjenje: 2 + 6 + 8 = 16

        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = s.nextInt();

            if (num % 2 == 0) {
                sum = sum + num;
            }
        }

        System.out.println("The sum of even numbers is " + sum + ".");

    }
}
