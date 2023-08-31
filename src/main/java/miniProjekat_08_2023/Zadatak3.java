package miniProjekat_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//    3. **Zadatak: Zamena Placeholdera u SQL Upitu**
//
//    Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka, biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//
//            Program će sačuvati sledeće informacije:
//
//    1. SQL upit (string) nad kojim će se obaviti zamena.
//    2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//
//    Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti. Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//
//    i niz vrednosti je:
//    Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//
//    Nakon izvršenja zamene, dobiće se SQL upit:
//
//    INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');
//
//    Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.
//
//            Objasnjanje:
//    Placeholder %0 je zamenjen sa Cardinal
//    Placeholder %1 je zamenjen sa Tom B. Erichsen
//    Placeholder %2 je zamenjen sa Skagen 21
//    Placeholder %3 je zamenjen sa Stavanger
//    Placeholder %4 je zamenjen sa 4006
//    Placeholder %5 je zamenjen sa Norway
//
//    Napomena: Smatrajte da se broj placeholdera podudara sa brojem elemenata u nizu.


    ArrayList<String> placeholders = new ArrayList<>();
    ArrayList<String> newValues = new ArrayList<>();

    String sqlInput = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";

    newValues.add("Cardinal");
    newValues.add("Tom B. Erichsen");
    newValues.add("Skagen 21");
    newValues.add("Stavanger");
    newValues.add("4006");
    newValues.add("Norway");

        for (int i = 0; i < newValues.size(); i++) {
            placeholders.add("%" + i);
            sqlInput = sqlInput.replaceAll(placeholders.get(i), newValues.get(i));
        }

        System.out.println(sqlInput);

    }
}
