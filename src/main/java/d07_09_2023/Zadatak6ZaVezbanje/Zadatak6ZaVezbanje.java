package d07_09_2023.Zadatak6ZaVezbanje;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {

//    Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila - Rešite Poslovni Problem
//
//    Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
//    Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//    Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave.
//    Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//        **Scenario:**
//
//    Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje.
//    Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//    Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//    Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//    Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama. Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.

//        vehicles **********
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Audi";
        vehicle1.model = "Q4 e-tron";
        vehicle1.registrationNo = "123-555";
        vehicle1.manufacturedYear = 2023;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Peugeot";
        vehicle2.model = "308";
        vehicle2.registrationNo = "324-311";
        vehicle2.manufacturedYear = 2007;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Mazda";
        vehicle3.model = "BT-50";
        vehicle3.registrationNo = "687-533";
        vehicle3.manufacturedYear = 2010;

//        drivers **********
        Driver driver1 = new Driver();
        driver1.firstName = "Marko";
        driver1.lastName = "Markovic";
        driver1.jmbg = "12595735695";
        driver1.driversLicenceNo = 256444;
        driver1.licenceExpirationDate = "01-10-2025";

        Driver driver2 = new Driver();
        driver2.firstName = "Petar";
        driver2.lastName = "Petrovic";
        driver2.jmbg = "02592735630";
        driver2.driversLicenceNo = 563422;
        driver2.licenceExpirationDate = "12-08-2024";

        Driver driver3 = new Driver();
        driver3.firstName = "Jovan";
        driver3.lastName = "Jovanovic";
        driver3.jmbg = "19795734331";
        driver3.driversLicenceNo = 256444;
        driver3.licenceExpirationDate = "24-02-2027";

//        routes **********
        Route route1 = new Route();
        route1.routeNo = 101;
        route1.startPoint = "Nis";
        route1.destination = "Belgrade";
        route1.length = 237;
        route1.deliveryHoursETA = 3;

        Route route2 = new Route();
        route2.routeNo = 125;
        route2.startPoint = "Nis";
        route2.destination = "Prague";
        route2.length = 1129;
        route2.deliveryHoursETA = 11;

        Route route3 = new Route();
        route3.routeNo = 361;
        route3.startPoint = "Nis";
        route3.destination = "Thessaloniki";
        route3.length = 413;
        route3.deliveryHoursETA = 7;

//        delivery info **********
        DeliveryDetails delivery1 = new DeliveryDetails();
        delivery1.deliveryNo = 1001;
        delivery1.driver = driver1;
        delivery1.vehicle  = vehicle1;
        delivery1.route = route1;
        delivery1.isCanceled = false;
        int currentKm1 = 35;
        delivery1.calculateCurrentStatus(currentKm1);

        DeliveryDetails delivery2 = new DeliveryDetails();
        delivery2.deliveryNo = 1028;
        delivery2.driver = driver2;
        delivery2.vehicle  = vehicle2;
        delivery2.route = route2;
        delivery2.isCanceled = false;
        int currentKm2 = 750;
        delivery2.calculateCurrentStatus(currentKm2);

        DeliveryDetails delivery3 = new DeliveryDetails();
        delivery3.deliveryNo = 1001;
        delivery3.driver = driver3;
        delivery3.vehicle  = vehicle3;
        delivery3.route = route3;
        delivery3.isCanceled = true;
        int currentKm3 = 35;
        delivery3.calculateCurrentStatus(currentKm3);


        System.out.println("************************************");

        delivery1.printDeliveryInfo();

        System.out.println("************************************");

        delivery2.printDeliveryInfo();

        System.out.println("************************************");

        delivery3.printDeliveryInfo();
    }
}
