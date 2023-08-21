package p21_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.

        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                int x = sum + i;
                sum = x;
            }
        }

        System.out.println("Suma: " + sum);

    }
}
