package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//    4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

        int x1 = 5, x2 = 5, x3 = 5;
        int y1 = 10, y2 = 10, y3 = 10;

        printNumOperations(x1, y1);
        printNumOperations(x2, y2);
        printNumOperations(x3, y3);
    }
    public static void printNumOperations (int a, int b){
        System.out.println("Za brojeve " + a + " i " + b);
        int zbir = a + b;
        System.out.println("Zbir je: " + zbir);
        int razlika = a - b;
        System.out.println("Razlika je: " + razlika);
        int proizvod = a * b;
        System.out.println("Proizvod je: " + proizvod);
        double kolicnik = a * 1.0 / b;
        System.out.println("Kolicnik je: " + kolicnik);

    }

}
