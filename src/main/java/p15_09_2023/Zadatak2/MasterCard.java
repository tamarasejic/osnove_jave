package p15_09_2023.Zadatak2;

public class MasterCard extends PlatnaKartica {

    public MasterCard(double currentAmount, String number, int year, int month) {
        super(currentAmount, number, year, month);
    }

    @Override
    public void transfer(double transferSum) {
        transferSum = transferSum + (transferSum * 1.5 / 100);
        super.transfer(transferSum);
    }

    public void naplatiOdrzavanje() {
        this.currentAmount -= 2;
    }

    @Override
    public void printInfo() {
        System.out.print("Master Card: ");
        super.printInfo();
        System.out.println();
    }


}
