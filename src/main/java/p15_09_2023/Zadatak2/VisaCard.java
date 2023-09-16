package p15_09_2023.Zadatak2;

public class VisaCard extends PlatnaKartica {
    private String authorizedPerson;

    public VisaCard(double currentAmount, String number, int year, int month, String authorizedPerson) {
        super(currentAmount, number, year, month);
        this.authorizedPerson = authorizedPerson;
    }

    @Override
    public void transfer(double transferSum) {
        if (transferSum * 1.8 / 100 < 4) {
            transferSum = transferSum + 4;
        } else {
            transferSum = transferSum + (transferSum * 1.8 / 100);
        }
        super.transfer(transferSum);
    }

    @Override
    public void printInfo() {
        System.out.print("Visa Card: ");
        super.printInfo();
        System.out.println("Authorized person: " + this.authorizedPerson);
        System.out.println();
    }

    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}
