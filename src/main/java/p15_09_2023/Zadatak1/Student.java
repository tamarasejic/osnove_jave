package p15_09_2023.Zadatak1;

public class Student extends Osoba {
    private String indexNo;
    private double debt;

    public Student() {
    }

    public Student(String fullName, String jmbg, String indexNo, double debt) {
        super(fullName, jmbg);
        this.indexNo = indexNo;
        this.debt = debt;
    }

    public void payScholarship(double payment) {
        if (this.debt > 0 || this.debt >= payment) {
            this.debt -= payment;
        }
    }

    @Override
    public void printInfo(){
        System.out.print("Student: ");
        super.printInfo();
        System.out.println("Index: " + this.indexNo);
        System.out.println("Scholarship debt: " + this.debt + " din.");
        System.out.println();
    }
}
