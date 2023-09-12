package p12_09_2023.Zadatak1;

public class Proizvod {
    private String name;
    private Kupac customer;
    private double productionPrice;

    public Proizvod (String name, Kupac customer, double productionPrice) {
        this.name = name;
        this.customer = customer;
        this.productionPrice = productionPrice;
    }

    public double calculatePrice () {
        return this.productionPrice * 1.9 * (100 - this.customer.getMembershipCard().getDiscount()) / 100;
    }

    public void printInfo() {
        System.out.println(this.name + " - " + this.calculatePrice() + " din");
        this.customer.printInfo();
    }


    //    getters & setters

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public double getProductionPrice () {
        return this.productionPrice;
    }

}
