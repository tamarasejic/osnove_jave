package d19_09_2023.Zadatak1;

public class Tetrapak extends Packaging{
    private boolean isRecyclable;
    private double basePrice;

    public Tetrapak() {
    }

    public Tetrapak(String barcode, String name, int netWeight, int grossWeight, boolean isRecyclable, double basePrice) {
        super(barcode, name, netWeight, grossWeight);
        this.isRecyclable = isRecyclable;
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        if (isRecyclable) {
            return this.calculateWeight() * 1.5 + this.basePrice;
        } else {
            return this.basePrice;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Tetrapak name: " + this.name);
        System.out.println("Barcode: " + this.barcode);
        System.out.println("Weight: " + this.calculateWeight());
        System.out.println("Recyclable: " + this.isRecyclable);
        System.out.println("Price: " + this.calculatePrice() + " din.");
    }


//    getters & setters

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
