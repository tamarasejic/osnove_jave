package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

//    1.Zadatak
//    Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);

        int lastIndex = numbers.size() - 1;
        int x = numbers.get(0);
        int y = numbers.get(lastIndex);

        int sum = x + y;

        System.out.println("Suma " + sum);

    }
}
