package p15_08_2023;

public class UvodPromenljive {
    public static void main(String[] args) {

//        String firstName; //deklaracija
//
//        firstName = "Tamara"; // inicijalizacija
//        String lastName = "Sejic"; // deklaracija + inicijalizacije

        String firstName = "Milan";
        String lastName = "Jovanovic";
        int yearOfBirth = 1995;
        int currentYear = 2023;
        double avg = 5.8;
        boolean active = true; // true false

        int age = currentYear - yearOfBirth;


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("active: " + active);

    }

}
