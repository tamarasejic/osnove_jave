package p25_08_2023;

public class UvodMetode1 {
    public static void main(String[] args) {

        String ime = "Milan";
        String prezime = "Jovanovic";
        boolean aktivan = true;

        printUser(ime + ", Nebojsa", prezime, aktivan);
        printUser("Pera", "Peric", false);

    }

    public static void printUser(String firstName, String lastName, boolean active) {
        if (active) {
            System.out.print("o ");
        } else {
            System.out.print("x ");
        }
        System.out.println(firstName + " " + lastName);
    }



}
