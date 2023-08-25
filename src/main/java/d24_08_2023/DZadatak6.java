package d24_08_2023;

import java.util.ArrayList;

public class DZadatak6 {
    public static void main(String[] args) {

//   6. Zadatak
//   Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//    niz linkova
//    niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//    niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//    Nizovi potrebni za ovaj primer:
//    linkovi
//    https://cms.demo.katalon.com/cart/
//    https://cms.demo.katalon.com/shop/
//    https://cms.demo.katalon.com/account/
//    https://cms.demo.katalon.com/cart/
//    https://cms.demo.katalon.com/test/
//    expected status codes
//    200
//    200
//    404
//    204
//    200
//    actual status codes
//    200
//    200
//    400
//    200
//    404
//    Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//    Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//    Primer izvrsenja:
//    Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//    Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//    Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404

        ArrayList<String> link = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();

        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/shop/");
        link.add("https://cms.demo.katalon.com/account/");
        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/test/");

        expected.add(200);
        expected.add(200);
        expected.add(404);
        expected.add(204);
        expected.add(200);

        actual.add(200);
        actual.add(200);
        actual.add(400);
        actual.add(200);
        actual.add(404);

        for (int i = 0; i < link.size(); i++) {
            if (!expected.get(i).equals(actual.get(i))) {
                System.out.println("Assertion Error: Link " + link.get(i) + " expected status code " + expected.get(i) + " but got " + actual.get(i));
            }
        }

    }
}
