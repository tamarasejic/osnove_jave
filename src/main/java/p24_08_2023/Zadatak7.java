package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {

//    7. Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//    naziv paste ………………………….cena rsd
//    Informacije su uparene po poziciji, to znaci da je:
//    pasta na poziciji 0, sa cenom sa pozicije 0
//    pasta na poziciji 1, sa cenom sa pozicije 1
//      …..
//
//    Primer izvrsenja:
//    AGLIO E OLIO ………………… 500 rsd
//    PRIMAVERA…………………340 rsd
//    ARRABBIATA ………………….420 rsd
//    NAPOLITANA ………………….440 rsd
//    POLLO E SPINACI ………………….550 rsd

        ArrayList<String> dish = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

       dish.add("AGLIO E OLIO");
       dish.add("PRIMAVERA");
       dish.add("ARRABBIATA");
       dish.add("NAPOLITANA");
       dish.add("POLLO E SPINACI");

       price.add(500);
       price.add(340);
       price.add(420);
       price.add(440);
       price.add(550);

        for (int i = 0; i < dish.size(); i++) {
            String menuDish = dish.get(i);
            int menuPrice = price.get(i);;

            System.out.println(menuDish + " ………………………… " + menuPrice + "rsd");

        }

    }
}
