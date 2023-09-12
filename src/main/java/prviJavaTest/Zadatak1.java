package prviJavaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca:");
        System.out.print("Min visina: ");
        int minHeight = s.nextInt();
        System.out.print("Max visina: ");
        int maxHeight = s.nextInt();
        System.out.print("Mesto: ");
        String preferredCity = s.next();
        System.out.print("Min starost: ");
        int minAge = s.nextInt();
        System.out.print("Max starost: ");
        int maxAge = s.nextInt();
        System.out.print("Boja kose: ");
        String preferredHairColor = s.next();
        System.out.print("Potrebno je da ima bradu: ");
        boolean wantBeard = s.nextBoolean();

        System.out.println("Unesite karakteristike muškarca: ");
        System.out.print("Visina: ");
        int height = s.nextInt();
        System.out.print("Mesto: ");
        String city = s.next();
        System.out.print("Starost: ");
        int age = s.nextInt();
        System.out.print("Boja kose: ");
        String hairColor = s.next();
        System.out.print("Nosi bradu: ");
        boolean hasBeard = s.nextBoolean();

        int match = 0;

        if (height >= minHeight && height <= maxHeight) {
            match++;
        }
        if (city.equals(preferredCity)) {
            match++;
        }
        if (age >= minAge && age <= maxAge) {
            match++;
        }
        if (hairColor.equals(preferredHairColor)) {
            match++;
        }
        if (hasBeard == wantBeard) {
            match++;
        }

        if (match >= 3) {
            System.out.println("Pronašli ste svog idealnog muškarca!");
        } else {
            System.out.println("Muškarac ne ispunjava vaše zahteve.");
        }

    }
}
