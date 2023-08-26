package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//    5. Zadatak
//    Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//    Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//    N=5, print je=> * * * * *
//
//    Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//    N=9, print je=> * * * * * * * * *

        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();

        oneStar(n);
    }
    public static void oneStar(int x) {

        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}
