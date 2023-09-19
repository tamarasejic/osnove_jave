package p19_09_2023.Zadatak1;

public class House extends Objekat{
    private int residents;

    public House(String address, double area, int zone, int residents) {
        super(address, area, zone);
        this.residents = residents;
    }

@Override
    public double calculateTax(){
        return this.coefficientTax() * this.area;
}

@Override
    public void printInfo() {
    System.out.println("House address: " + this.address);
    System.out.println("Total area: " + this.area);
    System.out.println("Zone: " + this.zone);
    System.out.println("Number of residents: " + this.residents);
    System.out.println("Property tax: " + this.calculateTax());
}


//    getters & setters

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }
}
