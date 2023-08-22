package d21_08_2023;

import java.util.Scanner;

public class Zadatak8ZaVezbanje {
    public static void main(String[] args) {

//      8. (Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//      Primer izvrsenja:
//      Unesite broj: 19452
//      2, 5, 4, 9, 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        int divBy = 10000;
        int digit = 0;

        for (int i = 0; i < 5; i++) {
            digit = (broj / divBy) % 10;
            System.out.print(digit + ", ");
            divBy = divBy / 10;
        }


    }
}
