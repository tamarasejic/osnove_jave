package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//        [Ime] [Prezime] - [JMBG]
//        Broj Tel: [Broj telefona],
//        Email: [Email],
//
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//        Unesite jmbg: 329032938923
//
//        Milan Jovanovic - 329032938923
//        Broj tel:  +209329832
//        Email: milan@gmail.com



        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite broj: ");
        String brojTel = s.next();

        System.out.print("Unesite email: ");
        String email = s.next();

        System.out.print("Unesite jmbg: ");
        String jmbg = s.next();

        System.out.println();
        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj tel: " + brojTel);
        System.out.println("Email: " + email);


    }
}
