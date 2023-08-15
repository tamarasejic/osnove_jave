package p15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

//      8.Napisati program koji racuna povrsinu kvadrata stranice a,
//      i povrsinu kruga poluprecnika r. PI = 3.14.
//      Povrsina kruga je r (na kvadrat) * pi

//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26

        double a = 5;
        double r = 3;
        double PI = 3.14;

        double pKvadrata = a * a;
        double pKruga = r * r * PI;

        System.out.println("P kruga " + pKruga);
        System.out.println("P kvadrata " + pKvadrata);




    }
}
