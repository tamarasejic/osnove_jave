package d22_08_2023;

import java.util.Scanner;

public class DZadatak4 {
    public static void main(String[] args) {

//    Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//    Primer izvrsenja 1:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:0
//    Unesite broj:2
//    Kraj programa.
//    (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//    Primer izvrsenja 1:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:1
//    Unesite broj:3
//    Unesite broj:1
//    Kraj programa.
//    (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);
        int num = 0;
        int counterTwo = 0;
        int counterOne = 0;
        boolean isTwoTwosThreeOnes = false;

        while (!isTwoTwosThreeOnes) {
            System.out.print("Enter number: ");
            num = s.nextInt();

            if (num == 2) {
                counterTwo++;
            } else if (num == 1) {
                counterOne++;
            }

            if (counterTwo >= 2 || counterOne >= 3) {
                isTwoTwosThreeOnes = true;
            }
        }
        System.out.println("The program has ended.");

    }
}
