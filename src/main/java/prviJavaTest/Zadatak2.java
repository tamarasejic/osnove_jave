package prviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lenght = new ArrayList<>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        double sum = 0;

        for (int i = 0; i < n ; i++) {
            System.out.print("Unesite rastojanje: ");
            int meters = s.nextInt();
            lenght.add(meters);
        }

        for (int i = 0; i < n; i++) {
            if (i != n-1 ) {
                System.out.print("| …" + lenght.get(i) + "m… ");
            } else {
                System.out.println("| …" + lenght.get(i) + "m… |");
            }
        }

        for (int i = 0; i < n; i++) {
            if (lenght.get(i) <= 50 || lenght.get(i) >= 100) {
                System.out.println("Rastojanje na poziciji " + i + ", dužine " + lenght.get(i) + "m nije po standardima Evropske unije.");
            }
        }

        for (int i = 0; i < n; i++) {
            sum = sum + lenght.get(i) * 1.5;
        }

        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + sum + "m.");

    }
}
