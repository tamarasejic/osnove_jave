package p18_08_2023;

public class OperacijeNastavak {
    public static void main(String[] args) {


        int a = 10;
        String akcija = "povecaj";



        if (akcija.equals("povecaj")) {
            a = a + 10;
        }




        a = a + 2;  // a =10 + 2 -> 12
//        a = a + 2;  // 14
//        a = a + 2; // 16
//        a = a + 2;  // 18




        System.out.println(a);




    }
}
