package d18_08_2023;

import java.util.Scanner;

public class Slack4Vezbanje {
    public static void main(String[] args) {

//        4. (Za vezbanje - Slack)
//      Napisati program koji iscrtava iks oks tablu. Stanje na tabli se cuva u intigeru koji uvek ima 9 cifara. Broj 1 u stanju je X, broj 2 je O, a 3 je prazni polje
//      Primer izvrsenja:
//      Unesite stanje table: 321311323
//            | O | X
//          O | X | X
//            | O |
//      Zadatak se resava for petljom

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite stanje tabele: ");
        int table = s.nextInt();
        String sign = "";
        int divideBy = 100000000;
        int signDigit = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                signDigit = (table / divideBy) % 10;

                if ( signDigit == 1) {
                    sign = "X";
                } else if (signDigit == 2) {
                    sign = "O";
                } else if (signDigit == 3) {
                    sign = " ";
                }


                if (j == 2) {
                    System.out.println(sign);
                } else {
                    System.out.print(sign + " | ");
                }


                divideBy = divideBy / 10;
            }
        }


    }
}
