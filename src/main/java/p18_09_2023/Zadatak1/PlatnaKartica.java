package p18_09_2023.Zadatak1;

public abstract class PlatnaKartica {
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

    public abstract void transfer(double transferSum);
    public abstract void printInfo();

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
