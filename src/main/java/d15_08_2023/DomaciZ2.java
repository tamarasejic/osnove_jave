package d15_08_2023;

public class DomaciZ2 {
    public static void main(String[] args) {

// 2. Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//    Od informacija se pamti broj kartice (16 cifara sa razmacima),
//    mesec i godina do kada vazi kartica,
//    kao i ime i prezime vlasnika kartice. K
//    artica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//    Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String cardNumber1 = "1234";
        String cardNumber2 = "1232";
        String cardNumber3 = "4321";
        String cardNumber4 = "1212";

        int month = 10;
        int year = 25;

        String firstName = "Tamara";
        String lastName = "Sejic";


        System.out.println( "*************************************");
        System.out.println( "*  Credit Card                      *");
        System.out.println( "*    ****                           *");
        System.out.println( "*    ****                           *");
        System.out.println( "*       " + cardNumber1 + " " + cardNumber2 + " " + cardNumber3 + " " + cardNumber4 + "         *");
        System.out.println( "*                  valid > " + month + "/" + year + "    *");
        System.out.println( "*                                   *");
        System.out.println( "*    " + firstName + " " + lastName + "                   *");
        System.out.println( "*************************************");


    }
}
