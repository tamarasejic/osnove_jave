package p19_09_2023.Zadatak1;

import java.util.ArrayList;

public class TaxAdministration {
    private String city;
    private ArrayList<Objekat> objekti;

    public TaxAdministration(String city) {
        this.city = city;
        this.objekti = new ArrayList<>();
    }

    public void newObjekat(Objekat objekat) {
        this.objekti.add(objekat);
    }

    public double totalCityTax() {
        double sum = 0;
        for (int i = 0; i < this.objekti.size(); i++) {
            sum += this.objekti.get(i).calculateTax();
        }
        return sum;
    }

    public void printInfo() {
        System.out.println("City: " + this.city);
        System.out.println("Total City tax: " + this.totalCityTax());
        System.out.println("Maximum tax: " + this.maxTax().calculateTax());
        System.out.println("Minimum tax: " + this.minTax().calculateTax());

        for (int i = 0; i < this.objekti.size(); i++) {
           this.objekti.get(i).printInfo();
        }
    }

    public Objekat maxTax() {
         Objekat largest = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (largest.calculateTax() < this.objekti.get(i).calculateTax()) {
                largest = this.objekti.get(i);
            }
        }
        return largest;
    }

    public Objekat minTax() {
        Objekat smallest = this.objekti.get(0);
        for (int i = 0; i < this.objekti.size(); i++) {
            if (smallest.calculateTax() > this.objekti.get(i).calculateTax()) {
                smallest = this.objekti.get(i);
            }
        }
        return smallest;
    }


    //    getters & setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Objekat> getObjekti() {
        return objekti;
    }
}
