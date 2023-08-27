package d25_08_2023;

public class DZadatak1 {
    public static void main(String[] args) {

// Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

    int a1 = 12, a2 = 7, a3 = 2, a4 = 23;

    int b1 = stampajVrednostZa10Vecu(a1);
        System.out.println("Broj " + b1 + " je za 10 veci od broja " + a1 + ".");
    int b2 = stampajVrednostZa10Vecu(a2);
        System.out.println("Broj " + b2 + " je za 10 veci od broja " + a2 + ".");
    int b3 = stampajVrednostZa10Vecu(a3);
        System.out.println("Broj " + b3 + " je za 10 veci od broja " + a3 + ".");
    int b4 = stampajVrednostZa10Vecu(a4);
        System.out.println("Broj " + b4 + " je za 10 veci od broja " + a4 + ".");

    }
    public static int stampajVrednostZa10Vecu (int y) {
        return y + 10;
    }

}
