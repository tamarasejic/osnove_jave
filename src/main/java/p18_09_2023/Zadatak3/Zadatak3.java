package p18_09_2023.Zadatak3;

import d15_09_2023.Zadatak1.Player;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//    3. Zadatak
//    Kreirati abstraktnu klasu Figura koja ima
//    abstraktnu metodu povrsina
//    abstraktnu metodu obim
//    metodu koja stampa podatke u formatu:
//    Povrsina je (povrsina)
//    Obim je (obim)
//
//    Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//    stranicu a
//    gettere/settere/konstruktore
//    implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//    implementira metodu obim
//
//    Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//    stranice a i b
//    gettere/settere/konstruktore
//    implementira metodu povrsina
//    implementira metodu obim
//
//    3.1 Zadatak
//    Kreirati klasu FigureGenerator koja ima:
//    Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
//    (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova. N je parametar metode
//    (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N pravougaonika. N je parametar metode
//    (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova i N pravougaonika. N je parametar metode
//
//    U glavnom programu generisati 3 pravougaonika i 2 trougla


        JednakostranicniTrougao trougao = new JednakostranicniTrougao(5);
        Pravougaonik pravougaonik = new Pravougaonik(2, 3);

        trougao.printInfo();
        pravougaonik.printInfo();

        Figura trougao1 = new JednakostranicniTrougao(2);
        Figura trougao2 = new JednakostranicniTrougao(6);

        Figura pravougaonik1 = new Pravougaonik(2, 5);
        Figura pravougaonik2 = new Pravougaonik(1, 3);
        Figura pravougaonik3 = new Pravougaonik(4, 6);


        ArrayList<Figura> f = new ArrayList<>();
        f.add(trougao1);
        f.add(trougao2);
        f.add(pravougaonik1);
        f.add(pravougaonik2);
        f.add(pravougaonik3);

        for (int i = 0; i < f.size(); i++) {
            f.get(i).printInfo();
        }

    }
}
