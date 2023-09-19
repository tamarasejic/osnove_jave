package p19_09_2023.Zadatak2;

public abstract class Atleticar {
    private String firstName;
    private String lastName;
    protected double score;

    public Atleticar(String firstName, String lastName, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public abstract boolean isBetter(Atleticar atleticar);

    public void printInfo() {
        System.out.println(this.firstName + " " + this.lastName + ", " + this.score);
    }

//    getters & setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
