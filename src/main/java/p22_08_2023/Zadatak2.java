package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//                Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:1
//        Unesite broj:0
//        Kraj programa jer je uneto 2 nule.

        Scanner s = new Scanner(System.in);
        int broj = 0;
        int count = 0;
        boolean isTwoZeros = false;

        while (!isTwoZeros) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if (broj == 0) {
                count = count + 1;
            }

            if (count == 2) {
                isTwoZeros = true;
            }
        }
        System.out.println("Kraj programa jer su unete 2 nule.");

    }
}
