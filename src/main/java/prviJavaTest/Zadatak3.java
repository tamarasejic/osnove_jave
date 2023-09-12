package prviJavaTest;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int secretNo = random.nextInt(1,50);
        int counter = 0;

        boolean correctNo = false;
        System.out.println("Tajni broj je spreman, pokušajte da pogodite broj.");

        while (!correctNo) {
            System.out.print("Unesite broj: ");
            int num = s.nextInt();
            counter++;

            if (num == secretNo) {
                System.out.println("Čestitamo, pogodili ste tajni broj!");
                correctNo = true;
            } else if (counter == 5) {
                System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");
                correctNo = true;
            } else if (num < secretNo) {
                System.out.println("Tajni broj je veći.");
                correctNo = false;
            }  else if (num > secretNo) {
                System.out.println("Tajni broj je manji.");
                correctNo = false;
            }
        }

    }
}
