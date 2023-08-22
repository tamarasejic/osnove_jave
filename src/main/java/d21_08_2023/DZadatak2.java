package d21_08_2023;

import java.util.Scanner;

public class DZadatak2 {
    public static void main(String[] args) {

//       2. Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//      Unesite N: 5
//      Unesite broj: 1
//      Unesite broj: 32
//      Unesite broj: 121
//      Unesite broj: 1333
//      Unesite broj: 144
//      Suma je: 265

        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = s.nextInt();

            if (num >= 100 && num < 1000) {
                sum = sum + num;
            }
        }

        System.out.println("The sum of three digit numbers is " + sum + ".");

    }
}
