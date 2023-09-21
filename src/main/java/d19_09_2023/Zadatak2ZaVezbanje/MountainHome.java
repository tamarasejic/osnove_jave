package d19_09_2023.Zadatak2ZaVezbanje;

import java.util.ArrayList;

public class MountainHome {
    private String name;
    private int establishedYear;
    private ArrayList<Mountaineer> members;

    public MountainHome() {
    }

    public MountainHome(String name, int establishedYear) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.members = new ArrayList<>();
    }

    public void addMember(Mountaineer member) {
        this.members.add(member);
    }

    public int successfulClimbers(Mountain mountain) {
        int counter = 0;
        for (Mountaineer mountaineer : this.members) {
            if (mountaineer.successfulClimb(mountain)) {
                counter++;
            }
        }
        return counter;
    }

    public void removeMember(int id) {
        ArrayList<Mountaineer> removedList = new ArrayList<>();
        for (Mountaineer mountaineer : this.members) {
            if (mountaineer.getId() == id) {
                removedList.add(mountaineer);
            }
        }
        this.members.removeAll(removedList);
    }

    public void printInfo() {
        System.out.println("Mountain Home: " + this.name + ", established in " + this.establishedYear);
        System.out.println("Members: ");
        for (Mountaineer mountaineer : this.members) {
            mountaineer.printInfo();
            System.out.println("------------------------------");
        }
    }

    public int monthlyIncome() {
        int sum = 0;
        for (Mountaineer mountaineer : this.members) {
            sum += mountaineer.membershipFee();
        }
        return sum;
    }

//    getters & setters

    public ArrayList<Mountaineer> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }
}
