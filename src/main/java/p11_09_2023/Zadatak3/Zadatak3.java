package p11_09_2023.Zadatak3;

public class Zadatak3 {
    public static void main(String[] args) {

//    3.Zadatak
//    Kreirati klasu Film koja ima:
//    naziv filma
//    iz koje godine je film
//            reziser
//    konstruktore, gettere i settere
//    getter i setter za rezisera
//    metodu print koja stampa podatke u formatu
//    naziv filma, godina
//    Rezirao ga: ime i prezime rezisera, starost
//
//
//    Kreirati klasu Reziser koja ima:
//    ime i prezime rezisera
//    starost
//    konstruktore, gettere i settere koji su potrebni
//    metodu print koja stampa podatke u formatu
//    ime prezime, starost.god
//
//    U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
//    Napravite vezu izmedju objekata i pozovite metode.


        Reziser director1 = new Reziser("J.A. Bayona");
        director1.setAge(48);

        Reziser director2 = new Reziser("Tarantino");
        director2.setAge(50);

        Film movie1 = new Film("El Orfanato", 2007);

        movie1.setDirectedBy(director1);
        movie1.printInfo();

    }
}
