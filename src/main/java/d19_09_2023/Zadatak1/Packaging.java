package d19_09_2023.Zadatak1;

public abstract class Packaging {
    protected String barcode;
    protected String name;
    protected int netWeight;
    protected int grossWeight;

    public Packaging() {
    }

    public Packaging(String barcode, String name, int netWeight, int grossWeight) {
        this.barcode = barcode;
        this.name = name;
        this.netWeight = netWeight;
        this.grossWeight = grossWeight;
    }

    public int calculateWeight() {
        return this.grossWeight - this.netWeight;
    }

    public abstract double calculatePrice();
    public abstract void printInfo();


//    getters & setters

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public int getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(int grossWeight) {
        this.grossWeight = grossWeight;
    }
}
