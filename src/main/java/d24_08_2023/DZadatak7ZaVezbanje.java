package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DZadatak7ZaVezbanje {
    public static void main(String[] args) {

//    7. (Za vezbanje)
//    Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//    a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
////
//    Unesite N: 6
//    Unesite broj: 1
//    Unesite broj: 5
//    Unesite broj: 2
//    Unesite broj: 7
//    Unesite broj: 8
//    Unesite broj: -1
//
//    Niz a: 1, 5, 2, 7, 8, -1
//    Niz b: 1, 5, 2, 1, 1, 1

        ArrayList<Integer> numbersA = new ArrayList<>();
        ArrayList<Integer> numbersB = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();
        String printA = "";
        String printB = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            int numA = s.nextInt();
            numbersA.add(numA);
            printA = printA + numbersA.get(i) + ", ";
        }

        for (int i = 0; i < numbersA.size(); i++) {
            if (i < 3) {
                numbersB.add(numbersA.get(i));
            } else {
                numbersB.add(1);
            }
            printB = printB + numbersB.get(i) + ", ";
        }

        System.out.println("Array A: " + printA);
        System.out.println("Array B: " + printB);
    }
}
