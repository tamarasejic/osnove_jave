package p11_09_2023.Zadatak1;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNo;
    private boolean isOnBudget;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNo() {
        return this.indexNo;
    }

    public void setIndexNo (int indexNo) {
        this.indexNo = indexNo;
    }

    public boolean getIsOnBudget() {
        return this.isOnBudget;
    }

    public void setIsOnBudget (boolean isOnBudget) {
        this.isOnBudget = isOnBudget;
    }

    public void printStudentInfo () {
        System.out.print("Student " + this.firstName + " " + this.lastName + " (indexNo: " + this.indexNo + ")");
        if (this.isOnBudget) {
            System.out.println(" is on budget.");
        } else {
            System.out.println(" is not on budget.");
        }
    }


}
