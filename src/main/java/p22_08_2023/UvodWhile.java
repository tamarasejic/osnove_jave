package p22_08_2023;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
//
//        System.out.println(i);

        Scanner s = new Scanner(System.in);

        int broj = -1;

        while (broj != 0) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            System.out.println("Uneli ste broj " + broj);

        }

        System.out.println("KRAJ");

    }
}
