package p14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//
//    Kreirati klasu Sastojak koja ima:
//    naziv
//            cenu
//    gettere i settere
//            konstruktore
//    metodu za stampanje koja stampa  podatke u formatu:
//    naziv - cena.din
//
//    Kreirati klasu Pasta koja ima:
//    niz sastojaka
//    metodu za dodavanje sastojka
//    defaultni konstruktor
//    metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//    metodu za stampu koja stampa podatke u formatu:
//    Pasta je sa sastojcima:
//    naziv - cena.din
//    naziv - cena.din
//    naziv - cena.din
//    Cena paste je <sracunata cena paste>.din
//
//    U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//    (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

        Sastojak tomatoSos = new Sastojak("Tomato sos 500ml", 256);
        Sastojak basil = new Sastojak("Basil 15g", 25);
        Sastojak oregano = new Sastojak("Oregano 5g", 10);

        Pasta pasta1 = new Pasta();

        ArrayList<Sastojak> sastojci = new ArrayList<>();

        pasta1.dodajSastojak(tomatoSos);
        pasta1.dodajSastojak(basil);
        pasta1.dodajSastojak(oregano);

        pasta1.printInfo();

        pasta1.deleteSastojak("Oregano 5g");

        pasta1.printInfo();


    }
}
