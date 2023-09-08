package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        1.Zad
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//                Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700


        Racun p = new Racun();

    p.broj = "840-12345-123";
    p.imeIPrezime = "Petar Petrovic";
    p.stanje = 112345;

    Racun m = new Racun();

    m.broj = "840-55555-147";
    m.imeIPrezime = "Marko Markovic";
    m.stanje = 987654;

    System.out.println("Posiljalac: " + p.imeIPrezime + ", " + p.broj + ", stanje: " + p.stanje);
    System.out.println("Primalac: " + m.imeIPrezime + ", " + m.broj + ", stanje: " + m.stanje);

    Scanner s = new Scanner(System.in);
    System.out.print("Unesite sumu za transakciju: ");
    double transfer = s.nextDouble();

    p.stanje = p.stanje - transfer;
    m.stanje = m.stanje + transfer;

    System.out.println("Posiljalac: " + p.imeIPrezime + ", " + p.broj + ", stanje: " + p.stanje);
    System.out.println("Primalac: " + m.imeIPrezime + ", " + m.broj + ", stanje: " + m.stanje);

    }
}
