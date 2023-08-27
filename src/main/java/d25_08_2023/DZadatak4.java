package d25_08_2023;

import java.util.Scanner;

public class DZadatak4 {
    public static void main(String[] args) {

//    4. Zadatak
//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//    Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//    / / / / /
//    Napomena: Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        System.out.print("Enter character: ");
        String sign = s.next();

        printCharacter(n, sign);
    }
    public static void printCharacter (int n1, String sign1) {
        for (int i = 0; i < n1; i++) {
            System.out.print(sign1);
        }
    }
}
