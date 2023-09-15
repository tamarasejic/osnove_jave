package p14_09_2023.Zadatak1;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }
    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }

    public void dodajSastojak (Sastojak newSastojak) {
        this.sastojci.add(newSastojak);
    }

    public double calculatePrice () {
        double fullPrice = 0;
        for (Sastojak sastojak : this.sastojci) {
            fullPrice += sastojak.getPrice();
        }
        return fullPrice;
    }

    public void printInfo() {
        System.out.println("Pasta je sa sastojcima: ");
        for (Sastojak sastojak : this.sastojci) {
            sastojak.printInfo();
        }
        System.out.println("Cena paste je " + this.calculatePrice() + ".din");
    }

    public void deleteSastojak(String naziv) {

        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getName().equals(naziv)) {
                this.sastojci.remove(i);
            }
        }
    }

}
