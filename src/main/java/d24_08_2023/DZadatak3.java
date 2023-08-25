package d24_08_2023;

import java.util.ArrayList;

public class DZadatak3 {
    public static void main(String[] args) {

//    3. Zadatak
//    Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//    Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(14);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);

        for (int i = 0; i < numbers.size(); i++) {
            int j = (numbers.size() - 1) - i;
            int num = numbers.get(j);
            System.out.print(num + ", ");
        }
    }
}
