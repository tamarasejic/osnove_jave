package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//          Izvrsenje:
//            2 na stepen 7 je 128
//
//          Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2


    int stepen = 7;
    int broj = 2;
    int result = 1;

        for (int i = 0; i < stepen; i++) {
            result = result * broj;
        }

        System.out.println(broj + " na stepen " + stepen + " je " + result);


    }
}
