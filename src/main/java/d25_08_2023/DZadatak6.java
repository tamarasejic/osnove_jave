package d25_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DZadatak6 {
    public static void main(String[] args) {

//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        System.out.print("Enter M: ");
        int m = s.nextInt();

        int countedNum = countNumbersBetweenNM(n, m);

        System.out.println("Between " + n + " and " + m + " there are " + countedNum + " integers.");

    }
    public static int countNumbersBetweenNM (int n1, int m1) {
        ArrayList<Integer>  a  = new ArrayList<>();
        int counter = 0;

        for (int i = n1 + 1; i < m1 ; i++) {
            a.add(n1 = n1 + i);
        }
        counter = a.size();
        return counter;
    }
}
