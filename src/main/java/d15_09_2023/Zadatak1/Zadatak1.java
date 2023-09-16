package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//    1.Zadatak
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//    jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//    (ime i prezime), (jmbg), (godina rodjenja)
//
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.


        Player player1 = new Player("Marko Markovic" , "51351313131521", 1996, 15, "offence", false);
        Player captain = new Player("Stefan Stefanovic", "69646133251351", 1989, 5, "offence", true);

        Coach coach1 = new Coach("Pera Peric", "6464161135341", 1970, 25, "physical");
        Coach coach2 = new Coach("Darko Darkovic", "311444644135646", 1985, 15, "personal");

        captain.printInfo();
        player1.printInfo();
        coach1.printInfo();
        coach2.printInfo();

        Scanner s = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Enter number of players: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            Player player = new Player();
            System.out.print("Enter Player's full name: ");
            player.setFullName(s.next());

            System.out.print("Enter jmbg: ");
            player.setJmbg(s.next());

            System.out.print("Enter year of birth: ");
            player.setYearOfBirth(s.nextInt());

            System.out.print("Enter number: ");
            player.setNumber(s.nextInt());

            System.out.print("Enter position: ");
            player.setPosition(s.next());

            System.out.print("Is Team Captain: ");
            player.setCaptain(s.nextBoolean());

            players.add(player);
        }

        ArrayList<Coach> coaches = new ArrayList<>();
        System.out.print("Enter number of coaches: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {

            Coach coach = new Coach();
            System.out.print("Enter Coach's full name: ");
            coach.setFullName(s.next());

            System.out.print("Enter jmbg: ");
            coach.setJmbg(s.next());

            System.out.print("Enter year of birth: ");
            coach.setYearOfBirth(s.nextInt());

            System.out.print("Enter years of experience: ");
            coach.setYearsOfExperience(s.nextInt());

            System.out.print("Enter coaching type: ");
            coach.setType(s.next());

            coaches.add(coach);
        }

        for (int i = 0; i < players.size(); i++) {
            players.get(i).printInfo();
        }

        for (int i = 0; i < coaches.size(); i++) {
            coaches.get(i).printInfo();
        }
    }

}
