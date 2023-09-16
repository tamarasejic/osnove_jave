package p15_09_2023;

public class UvodUNasledjivanje {
    public static void main(String[] args) {

//        Auto a = new Auto();
//        a.setRegistracija("NI-2921");
//        a.setBrVrata(5);
//        a.setMarka("BMW");

        Auto a = new Auto("NI-2921", "BMW", 100, 5);
        a.printInfo();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();

        Kamion k = new Kamion();
        k.setRegistracija("NI-9393");
        k.setNosivost(2000);
        k.setMarka("FAP");
        k.printInfo();
        k.dodajGas();
        k.dodajGas();
        k.dodajGas();
        k.koci();
        k.printInfo();

    }
}
