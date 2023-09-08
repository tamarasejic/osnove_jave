package p08_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//    2.  Zadatak
//    Kreirati klasu Auto koja ima:
//    ime i prezime vozaca
//    marku automobila
//    broj vrata
//    potrosnju na 100km (npr: 3.6 litra)
//    trenutnu brzinu kojom se auto krece
//    metodu za stampu koja stampa podatke u formatu:
//    [Vozac]
//    [Marka] - [br vrata]-ro vrata
//    Sa potrosnjom od [potrosnja] l na 100km
//            [Trenutna brzina auta] km/h je trenutna brzina.
//
//            Primer:
//    Milan Jovanovic
//    BMW - 5-ro vrata
//    Sa potrosnjom od 10 l na 100km
//    200 km/h je trenutna brzina

//    (Dopuna 1)
//    U okviru klase Auto, implementirati jos 2 metode:
//    metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//            metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//    U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

//    (Dopuna 2)
//    Dopuniti klasu Auto tako da ima:
//    atribut godinu proizvodnje
//    atribut mesec do kad je registrovan auto (int)
//    atribut kubikaza auta (npr: 1600 - 5000)
//    metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//    metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//    metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//    (Dopuna 3)
//    Dopuniti klasu Auto tako da ima:
//    atribut broj registracije
//    da li je ukljucena klima u autu
//    metodu dodajGas, koja povecava trenutnu brzinu za 10.
//    metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//            metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//    faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//    (trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
//
//    (Dopuna 4)
//    Dopuniti klasu Auto tako da ima:
//    atribut za maksimalnu brzinu na auto (npr: 240)
//    Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//    metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//    Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//            |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//            (objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//    Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.



    Auto auto1 = new Auto();
    auto1.driver = "Milan Jovanovic";
    auto1.brand = "BMW";
    auto1.doors = 5;
    auto1.fuelConsumptionAt100Km = 10;
    auto1.currentSpeed = 200;
    auto1.year = 2010;
    auto1.registrationMonth = 6;
    auto1.fuelVolume = 2000;
    auto1.registrationNo = "NI1111";
    auto1.isACOn = true;
    auto1.maxSpeed = 240;

    int currentMonth = 9;

    auto1.printAutoInfo();

    int speedLimit = 150;

    boolean isOverTheLimit = auto1.isOverSpeedLimit(speedLimit);

    if (isOverTheLimit) {
        System.out.println("Car was going over the speed limit.");
        int speedTicket = auto1.speedingTicket(speedLimit);
        System.out.println("Speeding ticket is " + speedTicket + "din.");
    } else {
        System.out.println("Car was going within the speed limit.");
    }

    if (auto1.isOldTimer()) {
        System.out.println("Car is an old timer.");
    }

    if (auto1.isRegistered(currentMonth)) {
        System.out.println("Car is registered.");
    } else {
        System.out.println("Car registration has expired.");
    }

    System.out.println("Registration price is " + auto1.registrationPrice(auto1.fuelVolume) + "din.");

    System.out.println("Current car consumption is " + auto1.carConsumption() +  ".");

    auto1.stampajTablu();

}

}
