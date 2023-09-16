package p15_09_2023.Zadatak1;

public class Profesor extends Osoba {
    private String subject;
    private double earnings;

    public Profesor() {
    }

    public Profesor(String fullName, String jmbg, String subject, double earnings) {
        super(fullName, jmbg);
        this.subject = subject;
        this.earnings = earnings;
    }

    public void paycheck(int percent) {
        this.earnings = this.earnings * (100  + percent) / 100;
    }

    @Override
    public void printInfo() {
        System.out.print("Professor: ");
        super.printInfo();
        System.out.println("Subject: " + this.subject);
        System.out.println("Earnings: " + this.earnings + " din.");
        System.out.println();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
