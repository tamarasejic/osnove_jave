package p12_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//    2. Zadatak
//
//    Kreirati klasu Korisnik koja ima:
//    ime i prezime
//    tip licence (basic/pro/premium)
//    konstruktore. Po difoltu korisnik ima basic licencu.
//    gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//    metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//    ako je uplata 100, postavlja licencu na “pro”
//    ako je uplata 150, postavlja licencu na “premium”
//    Metoda kao parametar prima vrednost uplate $100 ili $150
//    metodu ponisti pretplatu koja postavlja licencu na basic
//    metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//    ako je basic, vraca 40min
//    ako je pro, vraca 240min
//    ako je  premium, vraca 1440min
//    metodu za stampu koja stampa u formatu:
//    ime i prezime
//
//    Kreirati klasu ZoomCall koja ima:
//    link za poziv
//    password
//    korisnika koji je host
//    korisnika koji je guest
//    gettere za sve atribute
//    setter samo za guest-a
//    metodu pokreni poziv koja stampa podatke u formatu:
//
//    Zoom Call: url
//    Password: password
//    Host: ime i prezime
//    Guest: ime i prezime
//    Maksimalno trajanje poziva je (broj minuta)min
//
//    Maksimalno trajanje poziva se cita od korisnika koji je host!
//
//    U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija

        Korisnik host = new Korisnik();
        host.setFullName("Petar Petrovic");
        host.upgradeLicence(150);

        Korisnik guest =  new Korisnik();
        guest.setFullName("Marko Markovic");

        ZoomCall call1 = new ZoomCall("zoom-call-url", "125KL03a", host);
        call1.setGuest(guest);

        call1.printInfo();
    }
}
