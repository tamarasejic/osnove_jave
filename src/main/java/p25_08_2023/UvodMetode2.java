package p25_08_2023;

public class UvodMetode2 {
    public static void main(String[] args) {

        String ime = "Milan";
        String prezime = "Jovanovic";
        boolean aktivan = true;

        String  x = getUser ("Milan", "Jovanovic", true);

        int p = duzinaPunogImena("Milan", "Jovanovic");
    }
    public static int duzinaPunogImena(String firstName, String lastName) {
        return firstName.length() + lastName.length();
    }

    public static String getUser(String firstName,
                                 String lastName,
                                 boolean active) {

        if (active) {
            return "o " + firstName + lastName;
        } else {
            return "x " + firstName + lastName;
        }

    }



}
