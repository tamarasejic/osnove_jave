package p18_09_2023.Zadatak1;

public class MasterCard extends PlatnaKartica {

    public MasterCard(double currentAmount, String number, int year, int month) {
        super(currentAmount, number, year, month);
    }

    @Override
    public void transfer(double transferSum) {
        transferSum = transferSum + (transferSum * 1.5 / 100);
        this.currentAmount -= transferSum;
    }

    public void naplatiOdrzavanje() {
        this.currentAmount -= 2;
    }

    @Override
    public void printInfo() {
        System.out.print("Master Card: ");
        System.out.println(this.number + ", " + this.month + "/" + this.year + ", $" + this.currentAmount);
        System.out.println();
    }


}
