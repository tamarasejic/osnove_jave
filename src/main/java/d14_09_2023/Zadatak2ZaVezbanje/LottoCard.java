package d14_09_2023.Zadatak2ZaVezbanje;

import java.util.ArrayList;

public class LottoCard {
    private ArrayList<Combination> combinations;

    public LottoCard() {
        this.combinations = new ArrayList<>();
    }

    public void addCombination (Combination k) {
        if (this.combinations.size() <= 7) {
            this.combinations.add(k);
        }
    }

    public boolean isWinningCombination (Combination k) {
        for (Combination combination : this.combinations) {
            if (combination.isSameCombination(k)) {
                return true;
            }
        }
        return false;
    }

    public void printInfo() {
        for (Combination combination : this.combinations) {
            combination.printInfo();
        }
    }

    //     getters
    public ArrayList<Combination> getCombinations() {
        return combinations;
    }
}
