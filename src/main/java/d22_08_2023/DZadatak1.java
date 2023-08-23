package d22_08_2023;

import java.util.Scanner;

public class DZadatak1 {
    public static void main(String[] args) {

//  1. Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//  Na kraju programa ispisati sracunatu sumu.
//  Unesite vrednost: 20
//  Unesite vrednost: 50
//  Unesite vrednost: 50
//  Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        String errorMessage = "";
        boolean limit100 = false;

        while (!limit100) {
            System.out.print("Enter number: ");
            num = s.nextInt();
            sum = sum + num;

            if (sum >= 100){
                limit100 = true;
                errorMessage = "Limit exceeded! The program has ended. The calculated sum is " + sum + ".";
            }

        }
        System.out.println(errorMessage);
    }
}
