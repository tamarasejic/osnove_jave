package d25_08_2023;

import java.util.Scanner;

public class DZadatak7 {
    public static void main(String[] args) {

//    Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//    U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//    Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//    Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        System.out.print("Enter c: ");
        int c = s.nextInt();

        int smallestOfABC = smallestNum(a, b, c);

        System.out.println("The smallest of " + a + ", " + b + " and " + c + " is number " + smallestOfABC + ".");

    }
    public static int smallestNum (int a1, int b1, int c1) {
        int smallest = 0;

        if (a1 <= b1 && a1 <= c1) {
            smallest = a1;
        } else if (b1 <= a1 && b1 <= c1) {
            smallest = b1;
        } else {
            smallest = c1;
        }
        return smallest;
    }
}
