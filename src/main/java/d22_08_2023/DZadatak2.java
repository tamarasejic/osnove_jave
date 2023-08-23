package d22_08_2023;

import java.util.Scanner;

public class DZadatak2 {
    public static void main(String[] args) {

//    2. Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//    Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj.
//    Npr: -2 u 2 ili -4 u 4 dok pozitivni ostaju pozitivni npr: 9 ostaje 9
//    Primer izvrsenja:
//    Unesite broj: 3
//    Apsolutna vrednost je 3
//    Unesite broj: -1
//    Apsolutna vrednost je 1
//    Unesite broj: 0
//    Kraj programa jer je uneta nula.

        Scanner s = new Scanner(System.in);
        int num = 0;
        int absNum = 0;
        boolean isZero = false;

        while (!isZero) {
            System.out.print("Enter number: ");
            num = s.nextInt();

            if (num < 0) {
                absNum = num * (-1);
                System.out.println("The absolute value is " + absNum);
            } else if (num > 0) {
                absNum = num;
                System.out.println("The absolute value is " + absNum);
            } else if (num == 0) {
                isZero = true;
                System.out.println("The program has ended because the entered number is " + num + ".");
            }
        }

    }
}
