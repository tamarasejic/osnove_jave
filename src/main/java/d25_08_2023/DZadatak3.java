package d25_08_2023;

import java.util.Scanner;

public class DZadatak3 {
    public static void main(String[] args) {

//    3. Zadatak
//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.print("Enter JMBG: ");
        String jmbg = s.next();
        System.out.print("Enter First Name: ");
        String firstName = s.next();
        System.out.print("Enter Last Name: ");
        String lastName = s.next();
        System.out.print("Enter Year of birth: ");
        int birthYear = s.nextInt();
        System.out.print("Enter if Active (true/false): ");
        boolean isActive = s.nextBoolean();

        printUserData(jmbg, firstName, lastName, birthYear, isActive);

    }
    public static void printUserData (String jmbg1, String name1, String name2, int birthYear1, boolean active1) {
        System.out.println("JMBG: " + jmbg1);
        System.out.println("First Name: " + name1);
        System.out.println("Last Name: " + name2);
        System.out.println("Year of Birth: " + birthYear1);
        System.out.println("Active: " + active1);
    }
}
