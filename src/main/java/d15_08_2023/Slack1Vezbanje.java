package d15_08_2023;

public class Slack1Vezbanje {
    public static void main(String[] args) {

//       1. (Za vezbanje - slack)
//        Napisati program koji za datu boju trazi kontrastnu boju.
//        Svaka boja se sadrzi od 3 komponente RGB(red, green, blue).
//        Svaka komponenta boje je u opsegu od 0 do 255(informativno)
//        Program nalazi kontrastnu boju tako sto svaku komponentu boje oduzme od 255.
//        Primer izvrsenja:
//        Originalna boja: RGB(140, 12,  100)
//        Kontrastna boja: RGB(115, 243, 155)
//        Ako vas zanima koja je originalna a koja kontrast boja,
//        mozete ih ukucati na https://g.co/kgs/jTAfZe (edited)

        int red = 0, green = 0, blue = 0, red1 = 0, green1 = 0, blue1 = 0;

        red = 159;
        green = 196;
        blue = 151;

        red1 = 255 - red;
        green1 = 255 - green;
        blue1 = 255 - blue;


        System.out.println("Originalna boja: RGB(" + red + ", " + green + ", " + blue + ")");
        System.out.println("Kontrastna boja: RGB(" + red1 + ", " + green1 + ", " + blue1 + ")");



    }
}
