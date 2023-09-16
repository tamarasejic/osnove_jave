package d15_09_2023.Zadatak1;

public class Person {
    protected String fullName;
    protected String jmbg;
    protected int yearOfBirth;

    public Person() {
    }

    public Person(String fullName, String jmbg, int yearOfBirth) {
        this.fullName = fullName;
        this.jmbg = jmbg;
        this.yearOfBirth = yearOfBirth;
    }

    public void printInfo() {
        System.out.println(this.fullName + ", JMBG: " + this.jmbg + ", " + this.yearOfBirth + ".");
    }

//    getters & setters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
