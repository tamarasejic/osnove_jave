package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {

//   6. (Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//      Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//      primer jedne zamene:
//      Ako je niz
//      1,2,3,4,5,6,7,8,9,10
//      i prvi random indeks je 4 a drugi random indeks je 6
//      1,2,3,4,7,6,5,8,9,10

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(12);
        numbers.add(10);
        numbers.add(30);
        numbers.add(15);
        numbers.add(18);
        numbers.add(20);
        numbers.add(40);

        int numA = 0;
        int numB = 0;

        for (int i = 0; i < 8; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);

            int numX = numbers.get(x);
            int numY = numbers.get(y);

            numA = numbers.set(y, numX);
            numB = numbers.set(x, numY);

        }

    }
}
