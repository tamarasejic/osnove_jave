package d18_08_2023;

import java.util.Scanner;

public class Slack5Vezbanje {
    public static void main(String[] args) {

//        5. (Za vezbanje - Slack)
//      CIA je uspela da desifruje poruke hakerkse organizacije koju prati.
//      Hakerska organizacija kriptuje poruke u int tako sto svaka poruka ima 10cifara(5 karaktera). Konvencijom je ustaljeno da se slova kriptuju u dvocifrene brojeve:
//      A se kriptuje u 11
//      B se kriptuje u 12
//      …
//      Z se kriptuje u 36
//      Bilo koji drugi dvocifren broj se kriptuje u razmak.
//      Napisati program koji dekeiptuje poruke hakerske organizacije.
//      Npomena: program moze da dekriptuje odjednom samo rec od 5 slova.
//      Primer izvrsenja 1:
//      Poruka: 1815222225
//      Dekriptovana poruka: HELLO
//
//      Poruka koja presretnuta je
//      2526152811 1319201188 2015763188 3025213198
//      Koristeci program dekriptovati presretnutu poruku

        Scanner s = new Scanner(System.in);

        System.out.print("Enter encrypted message code: ");
        int code = s.nextInt();

        int divideBy = 1000000;
        int letterCode = 0;

        for (int i = 0; i < 4; i++) {

            letterCode = (code / divideBy) % 100;

            if (letterCode == 11) {
                System.out.print("A");
            } else if (letterCode == 12) {
                System.out.print("B");
            } else if (letterCode == 13) {
                System.out.print("C");
            } else if (letterCode == 14) {
                System.out.print("D");
            } else if (letterCode == 15) {
                System.out.print("E");
            } else if (letterCode == 16) {
                System.out.print("F");
            } else if (letterCode == 17) {
                System.out.print("G");
            } else if (letterCode == 18) {
                System.out.print("H");
            } else if (letterCode == 19) {
                System.out.print("I");
            } else if (letterCode == 20) {
                System.out.print("J");
            } else if (letterCode == 21) {
                System.out.print("K");
            } else if (letterCode == 22) {
                System.out.print("L");
            } else if (letterCode == 23) {
                System.out.print("M");
            } else if (letterCode == 24) {
                System.out.print("N");
            } else if (letterCode == 25) {
                System.out.print("O");
            } else if (letterCode == 26) {
                System.out.print("P");
            } else if (letterCode == 27) {
                System.out.print("Q");
            } else if (letterCode == 28) {
                System.out.print("R");
            } else if (letterCode == 29) {
                System.out.print("S");
            } else if (letterCode == 30) {
                System.out.print("T");
            } else if (letterCode == 31) {
                System.out.print("U");
            } else if (letterCode == 32) {
                System.out.print("V");
            } else if (letterCode == 33) {
                System.out.print("W");
            } else if (letterCode == 34) {
                System.out.print("X");
            } else if (letterCode == 35) {
                System.out.print("Y");
            } else if (letterCode == 36) {
                System.out.print("Z");
            } else {
                System.out.print(" ");
            }

            divideBy = divideBy / 100;
        }


//        *********Napomena:
//        Poruka je razlozena na po 4 slova zbog kapaciteta integera.
//
//        Poruka koja presretnuta je:
//      2526152811 1319201188 2015763188 3025213198
//
//        Desifrovana poruka:
//      OPERACIJA JE U TOKU

    }
}
