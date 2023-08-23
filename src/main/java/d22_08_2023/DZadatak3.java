package d22_08_2023;

import java.util.Scanner;

public class DZadatak3 {
    public static void main(String[] args) {

//    3. Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//      rimski: I, V,  X,  L,  C,   D,   M
//     arapski: 1, 5, 10, 50, 100, 500, 1000
//    Primer izvrsenja:
//    Unesite rimski broj: X
//    Arapski: 10
//    Unesite rimski broj: C
//    Arapski: 50
//    Unesite rimski broj: D
//    Arapski: 500
//    Unesite rimski broj: M
//    Arapski: 1000
//    Unesite rimski broj: I
//    Arapski: 1
//    Unesite rimski broj: KRAJ
//    Kraj programa.

        Scanner s = new Scanner(System.in);
        String romanNum = "";
        int arabicNum = 0;
        boolean ifEndEntered = false;

        while (!ifEndEntered) {
            System.out.print("Enter roman numeral: ");
            romanNum = s.next();

            if (romanNum.equals("I")) {
                arabicNum = 1;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("V")) {
                arabicNum = 5;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("X")) {
                arabicNum = 10;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("L")) {
                arabicNum = 50;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("C")) {
                arabicNum = 100;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("D")) {
                arabicNum = 500;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("M")) {
                arabicNum = 1000;
                System.out.println("Arabic number: " + arabicNum);
            } else if (romanNum.equals("KRAJ")) {
                ifEndEntered = true;
                System.out.println("The program has ended.");
            } else {
                System.out.println("Invalid roman numeral. Enter valid and case sensitive numerals: I, V, X, L, C, D, M or enter: KRAJ to end the program.");
            }

        }

    }
}
