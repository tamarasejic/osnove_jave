package d21_08_2023;

import java.util.Scanner;

public class Zadatak9ZaVezbanje {
    public static void main(String[] args) {

//      9. (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//      Primer izvrsenja:
//      Unesite broj: 32492
//      Novi broj je 29423

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        System.out.print("Novi broj je: ");

        int divBy = 1;
        int digit = 0;

        for (int i = 0; i < 5; i++) {
            digit = (broj / divBy) % 10;
            System.out.print(digit);
            divBy = divBy * 10;
        }

    }
}
