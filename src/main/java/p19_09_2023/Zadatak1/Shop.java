package p19_09_2023.Zadatak1;

public class Shop extends Objekat {
    public Shop(String address, double area, int zone) {
        super(address, area, zone);
    }


    @Override
    public double calculateTax(){
        return this.coefficientTax() * this.area * 1.3;
    }

    @Override
    public void printInfo() {
        System.out.println("Shop address: " + this.address);
        System.out.println("Total area: " + this.area);
        System.out.println("Zone: " + this.zone);
        System.out.println("Property tax: " + this.calculateTax());
    }
}
