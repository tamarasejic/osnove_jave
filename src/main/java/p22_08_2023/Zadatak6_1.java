package p22_08_2023;

import java.util.Scanner;

public class Zadatak6_1 {
    public static void main(String[] args) {

//    Zadatak
//    Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//            Ruzne reci koje program prepoznaje su:
//    zajebava
//            mars
//    stoko
//            svinjo
//    Unesite rec: Jel
//            Jel
//    Unesite rec:ti
//            ti
//    Unesite rec:to
//            to
//    Unesite rec:mene
//            mene
//    Unesite rec:zajebavas
//            beeeeeeeeeep
//    Unesite rec:stoko
//            beeeeeeeeeep
//    Unesite rec:jedna.
//            jedna.
//            Kraj programa.

        Scanner s = new Scanner(System.in);

        String word = "";
        boolean endDot  = false;

        while (!endDot) {
            System.out.print("Unesite rec: ");
            word = s.next();

            if (word.contains("zajebava") ||
                    word.contains("mars") ||
                    word.contains("stoko") ||
                    word.contains("svinjo")) {
                System.out.println("beeeeeeeeeeeeep");
            } else {
                System.out.println(word);
            }

            if (word.endsWith(".")) {
                endDot = true;
            }

        }

    }
}
