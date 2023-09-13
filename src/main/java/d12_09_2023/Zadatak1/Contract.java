package d12_09_2023.Zadatak1;

public class Contract {
    private int year;
    private int day;
    private int month;
    private NaturalPerson seller;
    private NaturalPerson buyer;
    private double sellingPrice;
    private String address;

    public Contract (int day, int month, int year, NaturalPerson seller, NaturalPerson buyer, double sellingPrice, String address) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.buyer =  buyer;
        this.sellingPrice = sellingPrice;
        this.address = address;
    }

    public double calculateProfitPercentage () {
        if (this.buyer.isReturningCustomer()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double calculateSellingProfit () {
        return 1000 + this.sellingPrice * this.calculateProfitPercentage();
    }

    public void printInfo() {
        System.out.print("On " + this.day + "." + this.month + "." + this.year + ", a contract was concluded between ");
        this.seller.printInfo();
        System.out.print(" and ");
        this.buyer.printInfo();
        System.out.println(" for the purchase of real estate located at " +  this.address + " at a price of " + this.sellingPrice + " din, whereby the buyer is obliged to pay the agency a fee in the amount of " + this.calculateSellingProfit() + " din.");
    }

//    getters & setters
    public int getDay() {
        return this.day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return this.month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public NaturalPerson getSeller() {
        return this.seller;
    }
    public void setSeller (NaturalPerson seller) {
        this.seller = seller;
    }

    public NaturalPerson getBuyer() {
        return this.buyer;
    }
    public void setBuyer (NaturalPerson buyer) {
        this.buyer = buyer;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
