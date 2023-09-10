package d07_09_2023.Zadatak5;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//    Zadatak 5: Kreiranje klase "Oprema"
//    Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
//    U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
//    Ispisati informacije o opremi.

        Scanner s = new Scanner(System.in);

        Oprema gear1 = new Oprema();
        System.out.print("Enter gear type: ");
        gear1.type = s.next();
        System.out.print("Enter brand: ");
        gear1.brand = s.next();
        System.out.print("Enter price: ");
        gear1.price = s.nextDouble();

        Oprema gear2 = new Oprema();
        System.out.print("Enter gear type: ");
        gear2.type = s.next();
        System.out.print("Enter brand: ");
        gear2.brand = s.next();
        System.out.print("Enter price: ");
        gear2.price = s.nextDouble();

        Oprema gear3 = new Oprema();
        System.out.print("Enter gear type: ");
        gear3.type = s.next();
        System.out.print("Enter brand: ");
        gear3.brand = s.next();
        System.out.print("Enter price: ");
        gear3.price = s.nextDouble();

        System.out.println(gear1.type + ", " + gear1.brand + ", is " + gear1.price + " RSD.");
        System.out.println(gear2.type + ", " + gear2.brand + ", is " + gear2.price + " RSD.");
        System.out.println(gear3.type + ", " + gear3.brand + ", is " + gear3.price + " RSD.");

    }
}
