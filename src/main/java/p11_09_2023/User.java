package p11_09_2023;

import java.util.Random;

public class User {
    private int id;
    private String ime;
    private String email;
    private int starost;

//    konstructor/i
    public User () {
//        Random randomIdGenerator = new Random();
//        this.id = randomIdGenerator.nextInt(1000);
    }

    public User(String ime, String email, int starost) {
        this.ime = ime;
        this.email = email;
        this.starost = starost;
    }

    public User(String email) {
        this.email = email;
    }

    public String getIme () {
        return this.ime;
    }

    public void setIme (String ime){
        this.ime = ime;
    }

    public String getEmail () {
        return this.email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public int getStarost() {
        return this.starost;
    }

    public void setStarost (int starost) {
        this.starost = starost;
    }






    public void stampaj() {
        System.out.println(this.ime);
        System.out.println(this.email);
        System.out.println(this.starost);
    }

}
