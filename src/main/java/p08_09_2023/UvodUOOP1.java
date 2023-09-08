package p08_09_2023;

public class UvodUOOP1 {
    public static void main(String[] args) {

        User1 m = new User1();
        m.ime = "Milan";
        m.email = "milan@gmail.com";
        m.starost = 30;

        User1 p = new User1();
        p.ime = "Petar";
        p.email = "petar@gmail.com";
        p.starost = m.starost + 3;

        m.stampaj();
        p.stampaj();

    }
}
