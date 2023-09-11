package p11_09_2023;

import p08_09_2023.User1;

import java.util.Scanner;

public class EncapsulacijaUvod {
    public static void main(String[] args) {

        User m = new User();
        m.setIme("Milan");
        m.setEmail("milan@gmail.com");
        m.setStarost(28);

       User n = new User("Nikola", "nikola@gmail.com", 22);
       n.stampaj();


        System.out.println("KRAJ");

//        m.ime = "Milan";
//        m.email = "milan@gmail.com";
//        m.starost = 30;
//
//        User1 p = new User1();
//        p.ime = "Petar";
//        p.email = "petar@gmail.com";
//        p.starost = m.starost + 3;





    }
}
