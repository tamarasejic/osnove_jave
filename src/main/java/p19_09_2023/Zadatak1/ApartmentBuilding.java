package p19_09_2023.Zadatak1;

public class ApartmentBuilding extends Objekat {
    private int apartments;

    public ApartmentBuilding(String address, double area, int zone, int apartments) {
        super(address, area, zone);
        this.apartments = apartments;
    }

    @Override
    public double calculateTax(){
        return this.coefficientTax() * this.area * this.apartments;
    }

    @Override
    public void printInfo() {
        System.out.println("Apartment Building address: " + this.address);
        System.out.println("Total area: " + this.area * this.apartments);
        System.out.println("Zone: " + this.zone);
        System.out.println("Number of apartments: " + this.apartments);
        System.out.println("Property tax: " + this.calculateTax());
    }



    //    getters & setters

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }
}
