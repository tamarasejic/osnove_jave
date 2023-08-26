package p25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//    2. Zadatak
//    Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//    Primer izvrsenja:
//    Milan Jovanovic
//    Milan Jovanovic
//    Milan Jovanovic
//    Milan Jovanovic
//    Milan Jovanovic

        firstName(); lastName();
        System.out.println();
        firstName(); lastName();
        System.out.println();
        firstName(); lastName();
        System.out.println();
        firstName(); lastName();
        System.out.println();
        firstName(); lastName();


    }
    public static void firstName() {
        System.out.print("Milan ");

    }

    public static void lastName() {
        System.out.print("Jovanovic");

    }
    
}
