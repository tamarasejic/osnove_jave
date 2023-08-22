package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//    3. Zadatak
//    Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//    Primer:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:2
//    Unesite broj:3
//    Unesite broj:0
//    Unesite broj:5
//    Unesite broj:3
//    Unesite broj:4
//    Kraj programa
//
//    Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

        Scanner s = new Scanner(System.in);
        int broj = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        int threeCounter = 0;
        int fourCounter = 0;
        boolean isAllFourOnce = false;

        while (!isAllFourOnce) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            if (broj == 1) {
                oneCounter = oneCounter + 1;
            }
            if (broj == 2) {
                twoCounter = twoCounter + 1;
            }
            if (broj == 3) {
                threeCounter = threeCounter + 1;
            }
            if (broj == 4) {
                fourCounter = fourCounter + 1;
            }

            if (oneCounter >= 1 && twoCounter >= 1 && threeCounter >= 1 && fourCounter >= 1) {
                isAllFourOnce = true;
            }
        }

        System.out.println("Kraj programa");

//        skraceni nacin

//        if (broj == 1) {
//            oneCounter++;
//        } else if (broj == 2) {
//            twoCounter++;
//        } else if (broj == 3) {
//            threeCounter++;
//        } else if (broj == 4) {
//            fourCounter++;
//        }

        }
}
