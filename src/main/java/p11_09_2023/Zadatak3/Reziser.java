package p11_09_2023.Zadatak3;

public class Reziser {
    private String fullName;
    private int age;

    public Reziser() {
    }
    public Reziser(String fullName){
        this.fullName = fullName;
    }

    public void printInfo() {
        System.out.println("Directed by: " + this.fullName + ", age: " + this.age);
    }

    public String getFullName() {
        return this.fullName;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public int getAge () {
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }

}
