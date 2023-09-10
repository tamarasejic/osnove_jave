package d08_09_2023.Zadatak1;

public class Proizvod {

    public String name;
    public double price;
    public double weight;

    public void stampaj () {
        System.out.println(this.name + ", " + this.price + "din, " + this.weight + "g.");
    }

    public void povecajCenu (double increaceFor) {
        price = price + increaceFor;
    }

    public double vratiCenuSaPopustom (int popust) {
        double lowerPrice = this.price * (100 - popust) / 100;
        return lowerPrice;
    }
}
