package d18_08_2023;

import java.util.Scanner;

public class Slack3Vezbanje {
    public static void main(String[] args) {

//        3. (Za vezbanje - Slack)
//      Tea Tairovic je zatrazila od svojih najvernijih fanova ako mogu da joj izadju u susret i razviju softver za njene potrebe.
//      Najveci fan Veljko se javio i iz razgovora je izvukao sta je potrebno da softver radi.
//      Posto je izbacila 3 najveca hita, potrebno joj je da sracuna zaradu od pregleda na youtubu.
//      Tea zaradjuje $1 na 1000 pregleda.
//      Dok ne dodje do 50k pregleda, sve sto se zaradi sa youtube-a ostaje njoj.
//      Ukoliko ima od 50k do 100k pregleda njen mendzer joj uzima fiksno $50, a sve preko 100k pregleda dele po pola.
//      Program sa tastature ucitava ukupan broj pregleda jednog videa i ispisuje koliko ce Tea zaraditi od njega.

        Scanner s = new Scanner(System.in);

        System.out.print("Enter total view count: ");
        int views = s.nextInt();
        int moneyPerView = views / 1000;
        int earningsClient = 0;
        int earningsManager = 0;

       if (views < 50000) {
           earningsClient = moneyPerView;
           System.out.println("Earnings: $" + earningsClient);

       } else if (views < 100000) {
           earningsManager = 50;
           earningsClient = moneyPerView - earningsManager;

           System.out.println("Earnings: $" + earningsClient);
       } else {
           earningsManager = moneyPerView / 2;
           earningsClient = moneyPerView - earningsManager;

           System.out.println("Earnings: $" + earningsClient);
       }


    }
}
