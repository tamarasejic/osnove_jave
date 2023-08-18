package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {


//        Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//                < | | | | | | | |

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka: ");
        int zvuk = s.nextInt();

        System.out.print("<");

        if (zvuk != 0) {
        for (int i = 0; i < zvuk; i++) {
            System.out.print(" |");
        }
            } else {
                System.out.print("/");
            }
        }












}

