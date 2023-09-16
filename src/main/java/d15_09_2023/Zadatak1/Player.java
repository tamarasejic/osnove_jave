package d15_09_2023.Zadatak1;

public class Player extends Person {
    private int number;
    private String position;
    private boolean captain;

    public Player() {
    }

    public Player(String fullName, String jmbg, int yearOfBirth, int number, String position, boolean captain) {
        super(fullName, jmbg, yearOfBirth);
        this.number = number;
        this.position = position;
        this.captain = captain;
    }

    @Override
    public void printInfo() {
        if (!isCaptain()) {
            System.out.print("Player: ");
        } else {
            System.out.print("Team captain: ");
        }
        super.printInfo();
        System.out.println("Number: " + this.number);
        System.out.println("Position: " + this.position);
    }

//    getters & setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }
}
