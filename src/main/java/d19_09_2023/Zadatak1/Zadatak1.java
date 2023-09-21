package d19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1.Zadatak
//    Kreirati abstraktnu klasu Ambalaza koja ima:
//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//    abstraktnu metodu koja vraca cenu artikla
//    abstraktnu metodu stampaj
//
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.
//
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//    (broj kartice), (ime i prezime)
//
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//    U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.


        SuperCard superCard = new SuperCard("328232-2823", "Marko Markovic", 500);

        Cart cart = new Cart();

        cart.addPackaging(new Tetrapak("35113545646", "Milk 1l", 850, 1000, true, 150));
        cart.addPackaging(new Tetrapak("8541651651", "Orange juice 250ml", 200, 250, false, 60));
        cart.addPackaging(new Glass("64161631321", "Coca-Cola 2l", 1800, 2200,25, true, 200));
        cart.addPackaging(new Glass("35443541355", "Wine 1l", 1900, 2150, 60, true, 600));
        cart.addPackaging(new Glass("60416166115", "Fanta 0.5l", 430, 500,15, false, 600));

        cart.deletePackaging("64161631321");

        System.out.println("Products in the cart: ");

        for (Packaging packaging : cart.getPackagings()) {
            packaging.printInfo();
        }

        System.out.print("SuperCard: ");
        superCard.printInfo();
        System.out.println("Total cart price: " + cart.totalCartPrice(superCard) + " din.");

    }
}
