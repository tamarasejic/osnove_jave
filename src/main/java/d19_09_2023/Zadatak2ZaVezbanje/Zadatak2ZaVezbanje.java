package d19_09_2023.Zadatak2ZaVezbanje;

public class Zadatak2ZaVezbanje {
    public static void main(String[] args) {

//    2.Zadatak (za vezbanje)
//    (10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima:
//    ime planine
//    naziv države u kojoj se nalazi
//    visinu planine.
//    a od javnih metoda:
//    default-ni konstruktor i konstuktor koji postavlja sve parametre
//    gettere i settere za sve atribute
//
//    (15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima:
//    jedinstveni celobrojni identifikacioni broj
//    ime i prezime
//    Dok od javnih metoda:
//    konstruktor koji postavlja sve atribute klase.
//    gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//    apstraktnu metodu štampaj
//    apstraktnu metodu koja vraca clanarinu planinara
//    apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.
//    (20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru:
//    težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
//    naziv okruga odakle je rekreativni planinar.
//    maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//    da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//    rekeativci placaju clanarinu u iznosu od 1000 rsd
//    metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//    Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug)
//    (20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//    Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)
//
//    (25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute:
//    naziv doma
//    godinu kada je osnovan.
//    članove doma koji su planinari (klasa vodi računa o nizu)
//    Dok od javnih:
//    default-ni konstuktor i konstuktor koji postavlja sve parametre
//    gettere i settere koji su potrebni
//    metodu učlani planinara, koja dodaje planinara u niz
//    metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)
//    metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//    metodu koja štampa podatke o domu i o svim članovima doma
//    metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//    (10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
//    Napomena​: Za funkcionalnost koju ne znate da uradite, izostavite njenu implementaciju i smatrajte da je ona implementirana.


        Mountain staraPlanina = new Mountain("Stara Planina", "Srbija", 2169);
        MountainHome mountainHome = new MountainHome("Midzor", 2014);

        mountainHome.addMember(new RecreationalMountaineer("Marko Markovic", 7, "Nisavski", 2000));
        mountainHome.addMember(new RecreationalMountaineer("Pera Peric", 9, "Raski", 3000));
        mountainHome.addMember(new RecreationalMountaineer("Steva Stevic", 6, "Borski", 2150));
        mountainHome.addMember(new RecreationalMountaineer("Jovan Jovic", 6, "Pomoravski", 1900));
        mountainHome.addMember(new Alpinist("Milan Milanovic",2));
        mountainHome.addMember(new Alpinist("Stefan Stefanovic",5));
        mountainHome.addMember(new Alpinist("Janko Jankovic",6));


//        find unique ID for this member and remove this member from the Mountain Home

        Mountaineer jovan = null;
        for (Mountaineer mountaineer: mountainHome.getMembers()) {
            if (mountaineer.getFullName().equals("Jovan Jovic")) {
                jovan = mountaineer;
            }
        }
        mountainHome.removeMember(jovan.getId());

        mountainHome.printInfo();

        System.out.println("Number of successful climbers for the Mountain " + staraPlanina.getName() + ": " + mountainHome.successfulClimbers(staraPlanina));

        System.out.println("Mountain Home's monthly income from members fee: " + mountainHome.monthlyIncome());
    }
}
