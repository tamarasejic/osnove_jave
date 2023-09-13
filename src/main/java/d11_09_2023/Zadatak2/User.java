package d11_09_2023.Zadatak2;

public class User {
    private String firstName;
    private String lastName;

    public User (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo () {
        System.out.println(this.firstName + " " + this.lastName);
    }

    //    getters & setters
    public String getFirstName () {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return this.lastName;
    }
    public void setLastName (String lastName) {
        this.lastName  = lastName;
    }
}
