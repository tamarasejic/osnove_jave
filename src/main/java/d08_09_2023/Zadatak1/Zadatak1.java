package d08_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. zadatak
//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//            cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//            i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//    za tezinu do 100g, postarina iznosi 200din
//    za tezinu od 101g do 500g, postarina iznosi 400din
//    za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod product1 = new Proizvod();
        product1.name = "Coffee";
        product1.price = 400;
        product1.weight = 200;

        Proizvod product2 = new Proizvod();
        product2.name = "Sugar";
        product2.price = 105;
        product2.weight = 1000;

        Proizvod product3 = new Proizvod();
        product3.name = "Phone case";
        product3.price = 500;
        product3.weight = 25;


        product1.stampaj();
        product2.stampaj();
        product3.stampaj();
        System.out.println();

        double increaceForP1 = 10;
        if (increaceForP1 > 0)  {
            product1.povecajCenu(increaceForP1);
            System.out.println("New increased price for " + product1.name + " is " + product1.price + "din.");
        }

        double increaceForP2 = 5;
        if (increaceForP2 > 0)  {
            product2.povecajCenu(increaceForP2);
            System.out.println("New increased price for " + product2.name + " is " + product2.price + "din.");
        }

        double increaceForP3 = 0;
        if (increaceForP3 > 0)  {
            product3.povecajCenu(increaceForP3);
            System.out.println("New increased price for " + product3.name + " is " + product3.price + "din.");
        }

        int discountForP1 = 20;
        if (discountForP1 > 0 && discountForP1 < 100 )  {            ;
            System.out.println("New price after calculated discount of " + discountForP1 +"% for " + product1.name + " is " + product1.vratiCenuSaPopustom(discountForP1) + "din.");
        }

        int discountForP2 = 10;
        if (discountForP2 > 0 && discountForP2 < 100 )  {
            System.out.println("New price after calculated discount of " + discountForP2 +"% for " + product2.name + " is " + product2.vratiCenuSaPopustom(discountForP2) + "din.");
        }

        int discountForP3 = 50;
        if (discountForP3 > 0 && discountForP3 < 100 )  {
            System.out.println("New price after calculated discount of " + discountForP3 +"% for " + product3.name + " is " + product3.vratiCenuSaPopustom(discountForP3) + "din.");
        }

    }
}
