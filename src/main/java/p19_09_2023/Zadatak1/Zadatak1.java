package p19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
//    adresa (ulica i broj)
//    povrsina objekta
//    zona (1, 2 ili 3)
//    konstuktore, gettere i settere
//    metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//    zona 1, koeficijent je 1.4
//    zona 2, koeficijent je 1.1
//    zona 3, koeficijent je 1.05
//    abstraktnu metodu koja racuna i vraca porez objekta
//    abstraktnu metodu stampaj
//
//    Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//    konstuktore, gettere i setter
//    porez racuna po formuli: koeficijent * povrsina.
//    prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//    Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//    konstuktore
//    porez racuna po formuli koeficijent * povrsina * 1.3
//    prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//    Kreirati klasu PoreskaUprava koja za atribute ima:
//    ime grada u kom se nalazi
//    niz objekata
//    metodu dodaj objekat
//    metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//    metodu koja vraca objekat sa najmanjim porezom
//    metodu koja racuna ukupan porez za ceo grad
//    metodu koja stampa sve objekte
//    U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 5 razlicita objekta i istestirati sve metode.


        House house1 = new House("Ulica i broj 12", 100, 1, 4);
        House house2 = new House("Ulica i broj 123bb", 250, 2, 5);
        ApartmentBuilding building1 = new ApartmentBuilding("Ulica broj 51", 55, 3, 20);
        ApartmentBuilding building2 = new ApartmentBuilding("Ulica broj 2", 70, 1, 8);
        Shop shop1 = new Shop("Ulica i broj 22", 30, 2);
        Shop shop2 = new Shop("Ulica i broj 3", 80, 1);

        TaxAdministration taxNis = new TaxAdministration("Nis");
        taxNis.newObjekat(house1);
        taxNis.newObjekat(house2);
        taxNis.newObjekat(building1);
        taxNis.newObjekat(building2);
        taxNis.newObjekat(shop1);
        taxNis.newObjekat(shop2);

        taxNis.printInfo();

    }
}
