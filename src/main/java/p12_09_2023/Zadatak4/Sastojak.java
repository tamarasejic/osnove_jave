package p12_09_2023.Zadatak4;

public class Sastojak {
    private String name;
    private double price;

    public Sastojak (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("Name; " + this.name + ", price: " + this.price + " din.");
    }

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public double getPrice () {
        return this.price;
    }
    public void setPrice (double price) {
        this.price = price;
    }

}
