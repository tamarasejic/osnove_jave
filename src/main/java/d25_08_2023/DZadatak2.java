package d25_08_2023;

import java.util.Scanner;

public class DZadatak2 {
    public static void main(String[] args) {

//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//    ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//    ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();

    int twoDigit = makeDoubleDigit(a, b);
        System.out.println("Numbers " + a + " and " + b + " have formed a two-digit number: " + twoDigit + ".");

    }
    public static int makeDoubleDigit (int num1, int num2) {
        int doubleDigit = num1 * 10 + num2;
        return doubleDigit;
    }

}
