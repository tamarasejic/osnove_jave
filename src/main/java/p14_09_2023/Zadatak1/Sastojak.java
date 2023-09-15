package p14_09_2023.Zadatak1;

import java.sql.SQLOutput;

public class Sastojak {
    private String name;
    private double price;

    public Sastojak() {
    }

    public Sastojak(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println(this.name + " - " + this.price + ".din");
    }
}
