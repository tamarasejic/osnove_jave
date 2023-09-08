package p07_09_2023;

public class UvodUOOP {
    public static void main(String[] args) {

        User m = new User();
        m.ime = "Milan";
        m.email = "milan@gmail.com";
        m.starost = 30;

        User p = new User();
        p.ime = "Petar";
        p.email = "petar@gmail.com";
        p.starost = m.starost + 3;


        System.out.println("Ime: " + m.ime);
        System.out.println("Email: " + m.email);
        System.out.println("Starost: " +m.starost);

        System.out.println("Ime: " + p.ime);
        System.out.println("Email: " + p.email);
        System.out.println("Starost: " +p.starost);

    }
}
