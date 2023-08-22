package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//    5. Napišite program koji simulira ponašanje jednog test slučaja.
//    Test slučaj ima 5 provera, a program će svaku proveru validirati jednu po jednu sve dok ne proveri sve ili dok neka provera ne ne uspije.
//    Korisnik sa tastature unosi očekivane i stvarne rezultate za svaku proveru.
//    Ako dođe do neuspeha, program će ispisati odgovarajuću poruku.

//            Primer izvrsenja 1:
//    Unesite expected: hello
//    Unesite actual: hello
//    Unesite expected: hello1
//    Unesite actual: hello1
//    Unesite expected: hello2
//    Unesite actual: hello
//    Test failed: Expected hello2 but got hello.
//
//            Primer izvrsenja 2:
//    Unesite expected: hello
//    Unesite actual: hello
//    Unesite expected: hello1
//    Unesite actual: hello1
//    Unesite expected: hello2
//    Unesite actual: hello2
//    Unesite expected: hello3
//    Unesite actual: hello3
//    Unesite expected: hello4
//    Unesite actual: hello4
//    Test passed.


//        String errorMessage = "";
//        u petlji ako bude error onda errorMessage = "Expected " + expected + " but got " + actual + ".";
//
//        van petlje na kraju:

//        if (fail) {
//            System.out.println("Test failed: " + errorMessage);
//        } else {
//            System.out.println("Test passed");
//        }



        Scanner s = new Scanner(System.in);
        String expected = "";
        String actual = "";
        int i = 0;
        boolean fail = false;

        while (!fail && i < 5) {
            System.out.print("Unesite expected: ");
            expected = s.next();

            System.out.print("Unesite actual: ");
            actual = s.next();

            if (!expected.equals(actual)) {
                fail = true;
                System.out.println("Test failed: Expected " + expected + " but got " + actual + ".");
            }

            i++;
        }

        if (!fail) {
            System.out.println("Test passed.");
        }
    }
}
