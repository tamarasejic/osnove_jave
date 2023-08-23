package d22_08_2023;

import java.util.Scanner;

public class DZadatak5 {
    public static void main(String[] args) {


//    5. Napisati program koji proverava uparenost zagrada.
//    Korisnik unosi matematicku formulu sve dok ne unese znak =.
//    Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//    Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//            Primer izvrsenja:
//    Unos: (
//            Unos: 2
//    Unos: *
//    Unos: (
//            Unos: 1
//    Unos: +
//            Unos: 3
//    Unos: )
//    Unos: )
//    Unos: =
//    Zagrade su uparene
//            (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//    Primer izvrsenja 2:
//    Unos: (
//            Unos: 2
//    Unos: *
//    Unos: (
//            Unos: 1
//    Unos: +
//            Unos: 3
//    Unos: )
//    Unos: =
//    Zagrade nisu uparene
//            (Objasnjenje: fali poslednja zagrada iz formule)

        Scanner s = new Scanner(System.in);
        String character = "";
        int counterOpenBracket = 0;
        int counterClosedBracket = 0;
        boolean isEqualsEntered = false;

        while (!isEqualsEntered) {
            System.out.print("Enter: ");
            character = s.next();

            if (character.contains("(")) {
                counterOpenBracket++;
            } else if (character.contains(")")) {
                counterClosedBracket++;
            } else if (character.contains("=")) {
                isEqualsEntered = true;
            }
        }

        if (counterOpenBracket == counterClosedBracket) {
            System.out.println("The brackets are paired.");
        } else {
            System.out.println("The brackets are not paired.");
        }

    }
}
