package d21_08_2023;

import java.util.Scanner;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {

//      6. (ZA VEZBANJE)
//      Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//      Unesite N: 5
//      Unesite broj: 1
//      Unesite broj: 2
//      Unesite broj: 0
//      Unesite broj: 4
//      Unesite broj: 1
//      Rezultujuci broj je 12041 (Promenljiva tipa int)

        Scanner s = new Scanner(System.in);


        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int res = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            res = res * 10 + broj;
        }

        System.out.print("Resultujuci broj je " + res);

    }
}
