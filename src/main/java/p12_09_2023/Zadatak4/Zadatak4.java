package p12_09_2023.Zadatak4;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//    3.Zadatak
//    Kreirati klasu Sastojak koja ima:
//    naziv sastojka
//    cenu
//    gettere i settere
//    konstuktore
//
//
//    --U glavnom programu kreirati 3 sastojka.
//            U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
//            Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        Sastojak ingredient1 = new Sastojak("Salt 10g", 15);
        Sastojak ingredient2 = new Sastojak("Sugar 100g", 50);
        Sastojak ingredient3 = new Sastojak("Pepper 5g", 20);

        ArrayList<Sastojak> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);

        Scanner s = new Scanner(System.in);

        ArrayList<Sastojak> ingredients2 = new ArrayList<>();
        System.out.println("Enter N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ingredient name: ");
            String name = s.next();
            System.out.println("Enter price: ");
            double price = s.nextDouble();

            ingredients2.add(new Sastojak(name, price));
        }

        for (int i = 0; i < ingredients2.size(); i++) {
            ingredients2.get(i).print();
        }
    }
}
