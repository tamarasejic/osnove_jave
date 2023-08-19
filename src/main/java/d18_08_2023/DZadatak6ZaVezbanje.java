package d18_08_2023;

import java.util.Scanner;

public class DZadatak6ZaVezbanje {
    public static void main(String[] args) {

//       6. (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
//        Unesite dimenziju table: 5
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//
//                Primver izvrsenja 2:
//        Unesite dimenziju table: 7
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int tableDim = s.nextInt();



        for (int i = 1; i < tableDim + 1; i++) {

            for (int j = 1; j < tableDim + 1; j++) {

                if (j == tableDim) {
                    System.out.println("_|");
                } else {
                    System.out.print("_|");
                }

            }


        }












    }
}
