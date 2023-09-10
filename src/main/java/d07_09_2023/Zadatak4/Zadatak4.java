package d07_09_2023.Zadatak4;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//    Zadatak 4: Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//    U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//    Ispisati informacije o filmovima

        Scanner s = new Scanner(System.in);

        Film movie1 = new Film();
        System.out.print("Enter movie name: ");
        movie1.name = s.next();
        System.out.print("Enter release year: ");
        movie1.year = s.nextInt();
        System.out.print("Enter director: ");
        movie1.director = s.next();

        Film movie2 = new Film();
        System.out.print("Enter movie name: ");
        movie2.name = s.next();
        System.out.print("Enter release year: ");
        movie2.year = s.nextInt();
        System.out.print("Enter director: ");
        movie2.director = s.next();

        System.out.println(movie1.name + ", released in " + movie1.year + " was directed by " + movie1.director + ".");
        System.out.println(movie2.name + ", released in " + movie2.year + " was directed by " + movie2.director + ".");

    }
}
