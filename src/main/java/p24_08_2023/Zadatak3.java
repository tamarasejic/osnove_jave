package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//    3.Zadatak
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//    Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//    Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(12);
        numbers.add(10);

        int numFirst = numbers.get(0);
        int lastIndex = numbers.size() - 1;
        int numLast = numbers.get(lastIndex);
        numFirst = numbers.set(lastIndex, numLast);
        numLast = numbers.set(0,numFirst);

        System.out.println("New First number value is " + numFirst);
        System.out.println("New Last number value is " + numLast);

    }
}
