package p18_09_2023.Zadatak2;

public abstract class Student {
    protected String fullName;
    protected String indexNo;
    protected int yearCurrent;


    public Student(String fullName, String indexNo, int yearCurrent) {
        this.fullName = fullName;
        this.indexNo = indexNo;
        this.yearCurrent = yearCurrent;
    }

    public abstract int scholarship();

    public abstract boolean isOnBudget();

    public void printInfo() {
        System.out.println(this.fullName + ", " + this.indexNo + ", " + this.yearCurrent + ". godina");
        System.out.print("Finansiranje: ");
        if (isOnBudget()) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }
        System.out.println("Cena skolarine: " + this.scholarship());
    }

//    getters & setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public int getYearCurrent() {
        return yearCurrent;
    }

    public void setYearCurrent(int yearCurrent) {
        this.yearCurrent = yearCurrent;
    }
}
