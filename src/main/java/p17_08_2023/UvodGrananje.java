package p17_08_2023;

import java.util.Scanner;

public class UvodGrananje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("POCETAK");

            System.out.print("Unesite x: ");
        int x = s.nextInt();

        System.out.print("Unesite y: ");
        int y = s.nextInt();

        if (x > y) {
            System.out.println("x is greater than y");
        }

        System.out.println("KRAJ");


//        if (20 < 18) {
//
//            System.out.println("20 is greater than 18");
//
//        }



    }
}
