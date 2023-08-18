package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//
//        Napisati program koji ucitava broj a i ispisuje poruke:
//        Ukoliko je broj a do 10 stampamo da je jednocifren broj
//        Ukoliko je broj a do 100 stampamo da je dvocifren broj
//        Ukoliko je broj a veci od 100 stampamo da je trocifren.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();


if (a < 10) {
    System.out.println("a je jednocifren broj.");
} else if (a < 100) {
    System.out.println("a je dvocifren broj.");
} else if (a >= 100) {
    System.out.println("a je trocifren broj.");
} else {
    System.out.println("a je visecifren broj");
}



//        if (a < 10) {
//            System.out.println("a je jednocifren broj.");
//        } else if (a < 100) {
//            System.out.println("a je dvocifren broj.");
//        } else if (a >= 100 && a < 1000) {
//            System.out.println("a je trocifren broj.");
//        } else {
//            System.out.println("a je visecifren broj.");




    }



}
