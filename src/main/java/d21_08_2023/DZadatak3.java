package d21_08_2023;

import java.util.Scanner;

public class DZadatak3 {
    public static void main(String[] args) {

//        3. Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//      ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//      ako se ne sadrzi, program dostampa na kraju
//	    Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
//	    Primer izvrsenja:
//	    Unesite N: 5
//	    Unesite tekst: Cao!
//	    Cao!
//	    Unesite tekst: Hello
//	    Hello!
//	    Unesite tekst: Hi!
//	    Hi!
//	    Unesite tekst: Cuti
//	    Cuti!
//	    Unesite tekst: Ajde!
//	    Ajde!
//	    Nivo agresivnosti 60.
//	    (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = s.nextInt();

        int count = 0;
        int levelAgg = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Enter text: ");
            String text = s.next();

            if (text.contains("!")) {
                count = count + 1;
                System.out.println(text);
            } else {
                System.out.println(text + "!");
            }

        }

        levelAgg = (count * 100) / n;

        System.out.println("Aggression level is " + levelAgg + "%");

    }
}
