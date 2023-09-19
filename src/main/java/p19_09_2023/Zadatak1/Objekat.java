package p19_09_2023.Zadatak1;

public abstract class Objekat {
    protected String address;
    protected double area;
    protected int zone;

    public Objekat(String address, double area, int zone) {
        this.address = address;
        this.area = area;
        this.zone = zone;
    }

    public double coefficientTax() {
        double n = 0;
        if (this.zone == 1) {
            n = 1.4;
        } else if (this.zone == 2) {
            n = 1.1;
        } else if (this.zone == 3) {
            n = 1.05;
        }
        return n;
    }

    public abstract double calculateTax();
    public abstract void printInfo();




//    getters & setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
