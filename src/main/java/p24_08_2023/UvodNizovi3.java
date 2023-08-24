package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi3 {
    public static void main(String[] args) {
// int, double, float, boolean...
//        int => Integer, double => Double

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // .get(0)
        numbers.add(20); // .get(1)
        numbers.add(30); // .get(2)
        numbers.add(40); // .get(3)
        numbers.add(50); // .get(4)
        numbers.add(60); // .get(5) => 6 elemenata ---- for i=0; i < 6 ili i < numbers.size()

        for (int i = 0; i < numbers.size() ; i++) {
            int x = numbers.get(i);
            System.out.println(x + ", ");
        }


        System.out.println("KRAJ");






    }
}
