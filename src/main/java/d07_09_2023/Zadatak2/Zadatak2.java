package d07_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//    Zadatak 2: Kreiranje klase "Automobil"
//    Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
//    U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

    Automobil car1 = new Automobil();
    car1.brand = "Audi";
    car1.model = "Q4 e-tron";
    car1.year = 2023;

    Automobil car2 = new Automobil();
    car2.brand = "Peugeot";
    car2.model = "308";
    car2.year = 2007;

    Automobil car3 = new Automobil();
    car3.brand = "Mazda";
    car3.model = "BT-50";
    car3.year = 2010;

    System.out.println("The " + car1.brand + " " + car1.model + ", manufactured in " + car1.year + ", has EPA-estimated range up to 265mi.");
    System.out.println("The " + car2.brand + " " + car2.model + ", manufactured in " + car2.year + ", won the Women's World Car Of The Year in 2022.");
    System.out.println("The " + car3.brand + " " + car3.model + ", manufactured in " + car3.year + ", is a compact/mid-size pickup truck produced by the Japanese manufacturer Mazda.");

    }
}
