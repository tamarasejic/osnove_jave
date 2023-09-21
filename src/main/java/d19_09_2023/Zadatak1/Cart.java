package d19_09_2023.Zadatak1;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Packaging> packagings;

    public Cart() {
        this.packagings = new ArrayList<>();
    }

    public void addPackaging(Packaging packaging){
        this.packagings.add(packaging);
    }

    public void deletePackaging(String barcode){
        ArrayList<Packaging> listOfDeleted = new ArrayList<>();
        for (Packaging packaging : this.packagings) {
            if (packaging.getBarcode().equals(barcode)) {
                listOfDeleted.add(packaging);
            }
        }
        this.packagings.removeAll(listOfDeleted);
    }

    private double totalDiscountPrice(double discount) {
        double sum = 0;
        for (Packaging packaging : this.packagings) {
            sum += packaging.calculatePrice();
        }
        return sum - discount;
    }

    public double totalCartPrice(SuperCard superCard) {
       return this.totalDiscountPrice(superCard.getDiscount());
    }

    public ArrayList<Packaging> getPackagings() {
        return packagings;
    }
}
