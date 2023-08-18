package d17_08_2023;

import java.util.Scanner;

public class DZadatak1 {
    public static void main(String[] args) {

//     1.  Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//        Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//          [ime] [prezime] - [startost] god
//
//        Primer izvrsenja:
//        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//        Milan Jovanovic - 26 god

        Scanner s = new Scanner(System.in);

        System.out.print("Uneti ime: ");
        String ime = s.next();

        System.out.print("Uneti prezime: ");
        String prezime = s.next();

        System.out.print("Uneti godinu rodjenja: ");
        int birthYear = s.nextInt();

        int starost = 2023 - birthYear;

        System.out.println();
        System.out.println(ime + " " + prezime + " - " + starost + " god");


    }
}
