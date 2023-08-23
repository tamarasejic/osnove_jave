package d21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class DZadatak5ZaVezbanje {
    public static void main(String[] args) {

//        5. (Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja. (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
//        Random brojevi u Javi se generisisu kao u primeru
//        // creating an object of Random class
//        Random random = new Random();
//        // Generates random integers 0 to 49
//        int x = random.nextInt(50);
//        Koristan link, koristan video
//        Primer izvrsenja:
//        Koliko je 1 + 4? 5
//        Cestitam!
//        Koliko je 3 + 34? 23
//        Greska!
//        Koliko je 23 + 12? 45
//        Greska!
//        Koliko je 23 + 12? 24
//        Greska!
//        Koliko je 1+ 4? 5
//        Cestitam!

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int userSum = 0;
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            sum = x + y;
            System.out.print("What is the sum of " + x + " + " + y + "? ");
            userSum = s.nextInt();

            if (sum == userSum) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Incorrect!");
            }
        }

    }
}
