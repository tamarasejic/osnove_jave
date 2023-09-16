package p15_09_2023.Zadatak2;

public class PlatnaKartica {
    protected double currentAmount;
    protected String number;
    protected int year;
    protected int month;

    public PlatnaKartica(double currentAmount, String number, int year, int month) {
        this.currentAmount = currentAmount;
        this.number = number;
        this.year = year;
        this.month = month;
    }

    public void newFunds(double newPayment) {
        this.currentAmount += newPayment;
    }

    public void transfer(double transferSum) {
        this.currentAmount -= transferSum;
    }

    public void printInfo() {
        System.out.println(this.number + ", " + this.month + "/" + this.year + ", $" + this.currentAmount);
    }

    //    getters
    public double getCurrentAmount() {
        return currentAmount;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
