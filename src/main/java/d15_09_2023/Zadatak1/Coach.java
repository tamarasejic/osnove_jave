package d15_09_2023.Zadatak1;

public class Coach extends Person {
    private int yearsOfExperience;
    private String type;

    public Coach() {
    }

    public Coach(String fullName, String jmbg, int yearOfBirth, int yearsOfExperience, String type) {
        super(fullName, jmbg, yearOfBirth);
        this.yearsOfExperience = yearsOfExperience;
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.print("Coach: ");
        super.printInfo();
        System.out.println("Years of experience: " + this.yearsOfExperience);
        System.out.println("Coaching type: " + this.type);
    }

//    getters & setters

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
