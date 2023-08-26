package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {

//    7. Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//    Trougao je pravougli ukoliko je a*a+b*b=c*c

    int x = 0, y = 0, z = 0;
    boolean isPravougli = pravougli(2,2,2);
        if (isPravougli) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }
    }

    public static boolean pravougli (int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }

}
