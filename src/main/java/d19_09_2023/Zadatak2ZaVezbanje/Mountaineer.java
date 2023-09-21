package d19_09_2023.Zadatak2ZaVezbanje;

import java.util.Random;

public abstract class Mountaineer {
    protected int id;
    protected String fullName;

    public Mountaineer(String fullName) {
        Random randomIdGenerator = new Random();
        this.id = randomIdGenerator.nextInt(90000) + 10000;
        this.fullName = fullName;
    }

    public abstract void printInfo();
    public abstract int membershipFee();
    public abstract boolean successfulClimb(Mountain mountain);


//    getters & setters

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
