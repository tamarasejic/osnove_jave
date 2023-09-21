package d19_09_2023.Zadatak2ZaVezbanje;

public class Alpinist extends Mountaineer{
    private int points;

    public Alpinist(String fullName, int points) {
        super(fullName);
        this.points = points;
    }

    @Override
    public boolean successfulClimb(Mountain mountain) {
        return mountain.getHeight() < 4000;
    }

    @Override
    public int membershipFee() {
        if (this.points * 50 <= 1500) {
            return 1500 - this.points * 50;
        }
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println("Alpinist, id: " + this.getId());
        System.out.println("Name: "+ this.fullName);
        System.out.println("Points: " + this.points);
    }

//    getters & setters

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
