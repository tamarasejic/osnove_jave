package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DZadatak4 {
    public static void main(String[] args) {

//    4. Zadatak
//    Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: -4
//    Unesite broj: 3
//    Unesite broj: -7
//    Unesite broj: 9
//
//    Brojevi veci od nule u nizu A su: 1, 3, 9,

        ArrayList<Integer> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            int num = s.nextInt();
            a.add(num);
        }

        System.out.print("Positive numbers in the A array are: ");

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                System.out.print(a.get(i) + ", ");
            }
        }

    }
}
