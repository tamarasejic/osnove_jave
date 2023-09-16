package p15_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//    Kreirati klasu Osoba koja od atributa ima:
//    ime i prezime
//    jmbg
//    konstuktor sa parametrima
//    difoltni konstuktor
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg
//
//    Kreirati klasu Student koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    broj indeksa
//    dug za skolarinu
//    konstuktor sa parametrima
//    metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//    Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//    U glavnom programu kreirati 2 studenta i 2 profesora.

        Student marko = new Student("Marko Markovic", "513135335145", "RA1233", 50000);
        marko.payScholarship(25000);

        Student nikola = new Student("Nikola Nikolic", "513135664164", "FA3541", 15000);
        nikola.payScholarship(15000);

        Profesor pera = new Profesor("Pera Peric", "6866416413531", "Anatomy", 80000);
        pera.paycheck(50);

        Profesor milena = new Profesor("Milena Peric", "84684616561641", "Biology", 100000);
        milena.paycheck(10);

        marko.printInfo();
        nikola.printInfo();
        pera.printInfo();
        milena.printInfo();
    }
}
