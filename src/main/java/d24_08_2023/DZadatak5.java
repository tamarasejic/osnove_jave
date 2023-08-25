package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DZadatak5 {
    public static void main(String[] args) {

//    5. Zadatak
//    Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 3
//    Unesite broj: 7
//    Unesite broj: 3
//    Unesite broj: 9
//    Unesite X: 3
//
//    Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

        ArrayList<Integer> a = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();
        int oneFound = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            int num = s.nextInt();
            a.add(num);
        }

        System.out.print("Enter X: ");
        int x = s.nextInt();

        System.out.print("Result: A array elements with the X value have index numbers: ");

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == x) {
                System.out.print(i + ", ");
                oneFound++;
            }
        }

        if (oneFound == 0) {
            System.out.println(" none found.");
        }

    }
}
