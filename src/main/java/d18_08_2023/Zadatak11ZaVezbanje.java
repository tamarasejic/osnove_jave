package d18_08_2023;

import java.util.Scanner;

public class Zadatak11ZaVezbanje {
    public static void main(String[] args) {
//
//        11. (ZA VEZBANJE - sa predavanja 18.08) Napisati program koji iscrtava timeline na youtube videu. Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.
//                Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//                *********-------------------------------------------------------------------------------------------
//
//                (Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa, zaokruzicemo to na 9zvezdica ostatak do 100 su crtice)

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        int fullLenght = s.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        int currentTime = s.nextInt();

        int percent = currentTime * 100 / fullLenght;


        for (int i = 1; i < 101 ; i++) {
            if (i <= percent) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }


    }
}
