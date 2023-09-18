package p18_09_2023.Zadatak2;

public class StudentMaster extends Student{

    public StudentMaster(String fullName, String indexNo, int yearCurrent) {
        super(fullName, indexNo, yearCurrent);
    }

    @Override
    public int scholarship(){
        return 100000;
    }

    public boolean isOnBudget() {
        if (this.yearCurrent < 2) {
            return true;
        }
        return false;
    }
}
