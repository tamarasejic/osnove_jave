package d12_09_2023.Zadatak3;

public class Account {
    private String numberId;
    private String ownerFullName;
    private double currentFunds;

    public Account (String number, String ownerFullName, double currentFunds) {
        this.numberId = number;
        this.ownerFullName = ownerFullName;
        this.currentFunds = currentFunds;
    }

    public void payIn(double payment) {
        this.currentFunds += payment;
    }

    public void payOut(double payment) {
        this.currentFunds -= payment;
    }

    public void printInfo() {
        System.out.println(this.ownerFullName + " - " + this.numberId);
        System.out.println("Current funds available are " + this.currentFunds + " rsd.");
        System.out.println();
    }


//    getters & setters
    public String getNumberId() {
        return this.numberId;
    }
    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getOwnerFullName() {
        return this.ownerFullName;
    }
    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public double getCurrentFunds() {
        return this.currentFunds = currentFunds;
    }
}
