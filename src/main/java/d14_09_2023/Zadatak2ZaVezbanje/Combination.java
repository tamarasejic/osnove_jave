package d14_09_2023.Zadatak2ZaVezbanje;

import java.util.ArrayList;

public class Combination {
    private String id;
    private ArrayList<Integer> numCombo;

    public Combination (String id, int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        this.id = id;
        this.numCombo = new ArrayList<>();
        this.numCombo.add(num1);
        this.numCombo.add(num2);
        this.numCombo.add(num3);
        this.numCombo.add(num4);
        this.numCombo.add(num5);
        this.numCombo.add(num6);
        this.numCombo.add(num7);
    }

    public boolean isSameCombination (Combination k) {
        boolean isSame = true;
        int i = 0;
        while (isSame && i < this.numCombo.size()) {

            if (this.numCombo.get(i) == k.getNumCombo().get(i)){
              i++;
            } else {
                isSame = false;
            }
        }
        return isSame;
    }

    public void printInfo() {
        System.out.println("ID: " + this.id);
        System.out.print("Numbers: ");
        for (int i = 0; i < this.numCombo.size(); i++) {
            if (i != this.numCombo.size() - 1) {
                System.out.print(this.numCombo.get(i) + ", ");
            } else {
                System.out.println(this.numCombo.get(i));
            }
        }
        System.out.println();
    }


// getters & setters

    public String getId() {
        return id;
    }

    public ArrayList<Integer> getNumCombo() {
        return numCombo;
    }

}
