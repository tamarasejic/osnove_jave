package d19_09_2023.Zadatak1;

public class Glass extends Packaging{
    private double bottleFee;
    private boolean hasBottleFee;
    private double basePrice;

    public Glass() {
    }

    public Glass(String barcode, String name, int netWeight, int grossWeight, double bottleFee, boolean hasBottleFee, double basePrice) {
        super(barcode, name, netWeight, grossWeight);
        this.bottleFee = bottleFee;
        this.hasBottleFee = hasBottleFee;
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() {
        if (hasBottleFee) {
            return this.basePrice * 1.2 + this.bottleFee;
        } else {
            return this.basePrice * 1.2;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Glass packaging name: " + this.name);
        System.out.println("Barcode: " + this.barcode);
        System.out.println("Weight: " + this.calculateWeight());
        if (hasBottleFee) {
            System.out.println("Bottle Fee: " + this.bottleFee);
        }
        System.out.println("Price: " + this.calculatePrice() + " din.");
    }

//    getters & setters

    public double getBottleFee() {
        return bottleFee;
    }

    public void setBottleFee(double bottleFee) {
        this.bottleFee = bottleFee;
    }

    public boolean isHasBottleFee() {
        return hasBottleFee;
    }

    public void setHasBottleFee(boolean hasBottleFee) {
        this.hasBottleFee = hasBottleFee;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
