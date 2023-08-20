package d18_08_2023;

import java.util.Scanner;

public class Slack1Vezbanje {
    public static void main(String[] args) {

//        1. (Za vezbanje - Slack)
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se baterija na telefonu napuni do 100%. Program od informacija cuva:
//        Naziv telefona
//        Kapacitet baterije u mAh (miliamper sat)
//        Trenutna napunjenost baterije u % (procentima)
//        Struja punjenja u mA (miliamper)
//        Teorijski: Struja punjenja nam kaze koliko se miliampera napuni za 1h punjenja.
//        Primer izvrsenja:
//        Iphone 11 pro max
//        Kapacitet baterije: 3000mAh
//        Baterija trenutno na 20%
//        Struja punjenja 1000mA
//        Procenjeno vreme punjenja je 2.4h.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite naziv telefona: ");
        String name = s.next();

        System.out.print("Unesite kapacitet baterije (mAh): ");
        int fullBatery = s.nextInt();

        System.out.print("Unesite trenutnu napunjenost baterije (%): ");
        int charging = s.nextInt();

        System.out.print("Unesite struju punjenja (mA): ");
        int electricity = s.nextInt();

        double fullChargeTime = fullBatery * 1.0 / electricity;

        double chargedETA = fullChargeTime * (100 - charging) / 100;

        System.out.println(name);
        System.out.println("Kapacitet baterije: " + fullBatery + "mAh");
        System.out.println("Baterija trenutno na " + charging + "%");
        System.out.println("Struja punjenja " + electricity + "mA");
        System.out.println("Procenjeno vreme punjenja je " + chargedETA + "h");


    }
}
