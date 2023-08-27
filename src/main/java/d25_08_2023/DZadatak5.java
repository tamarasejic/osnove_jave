package d25_08_2023;

import java.util.Scanner;

public class DZadatak5 {
    public static void main(String[] args) {

//    5. Zadatak
//    Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//    Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//    U glavnom programu pozvati funkciju za neki od primera.
//    Primer poziva funkcija:
//    Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//    Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//    Primer izvrsenja main programa:
//    Unesite vrednost u eurima: 3
//    Unesite valutu za konverziju: RSD
//    3 EUR je 351.6339 RSD
//    Konverzija eura u druge valute:
//    1 EUR = 117.5 RSD
//    1 EUR = 1.1 USD
//    1 EUR = 62.98 RUB

        Scanner s = new Scanner(System.in);
        System.out.print("Enter euro: ");
        double euro = s.nextDouble();
        System.out.print("Enter currency: ");
        String currency = s.next();

        double convertedEuro = euroConversion(euro, currency);

        System.out.println(euro + " EUR je " + convertedEuro + " " + currency.toUpperCase());
    }
    public static double euroConversion (double euro1, String currency1) {
        double converted = 0;
        if (currency1.equals("RSD") || currency1.equals("rsd")) {
            converted = euro1 * 117.5;            
        } else if (currency1.equals("USD") || currency1.equals("usd")) {
            converted = euro1 * 1.1;            
        } else if (currency1.equals("RUB") || currency1.equals("rub")) {
            converted = euro1 * 62.98;
        }
        return converted;
    }
}
