package p18_09_2023.Zadatak2;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String fullName, String indexNo, int yearCurrent) {
        super(fullName, indexNo, yearCurrent);
    }

    @Override
    public int scholarship(){
        return 90000;
    }

    public boolean isOnBudget() {
        if (this.yearCurrent < 5) {
            return true;
        }
        return false;
    }

}
