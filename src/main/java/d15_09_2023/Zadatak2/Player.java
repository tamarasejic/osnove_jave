package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Player extends Person {
    private int number;
    private String position;
    private ArrayList<Card> cards;
    private boolean captain;

    public Player() {
        this.cards = new ArrayList<>();
    }

    public Player(String fullName, String jmbg, int yearOfBirth, int number, String position, boolean captain) {
        super(fullName, jmbg, yearOfBirth);
        this.number = number;
        this.position = position;
        this.captain = captain;
        this.cards = new ArrayList<>();
    }

    public void addCard (Card card) {
        this.cards.add(card);
    }

    private int countYellowCards() {
        int counter = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getType().equals("yellow")) {
                counter++;
            }
        }
        return counter;
    }

    private int countRedCards() {
        int counter = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            if (this.cards.get(i).getType().equals("red")) {
                counter++;
            }
        }
        return counter;
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
        System.out.println("Yellow Cards: " + this.countYellowCards());
        System.out.println("Red Cards: " + this.countRedCards());
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
