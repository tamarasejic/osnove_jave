package d07_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

//    Zadatak 3: Kreiranje klase "Proizvod"
//    Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
//    U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

    Proizvod product1 = new Proizvod();
    product1.name = "Coca-cola 1.5l bottle";
    product1.price = 130;

    Proizvod product2 = new Proizvod();
    product2.name = "Bread";
    product2.price = 79;

    Proizvod product3 = new Proizvod();
    product3.name = "Avocado";
    product3.price = 256;

    System.out.println("Product: " + product1.name + ", " + product1.price + " din.");
    System.out.println("Product: " + product2.name + ", " + product3.price + " din.");
    System.out.println("Product: " + product3.name + ", " + product3.price + " din.");

    }
}
