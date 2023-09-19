package p19_09_2023.Zadatak2;

import java.util.ArrayList;

public class Disciplina {
    private String name;
    private String type;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String name, String type) {
        this.name = name;
        this.type = type;
        this.atleticari = new ArrayList<>();
    }

    public void addAtleticar(Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }

    public void disqualify(String firstName, String lastName) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getFirstName().equals(firstName)
                && this.atleticari.get(i).getFirstName().equals(firstName)) {
                this.atleticari.remove(i);
            }
        }
    }

    private Atleticar bestScoreAtleticar() {
        Atleticar best = null;
        if (this.atleticari.size() > 0){
            best = this.atleticari.get(0);
            for (int i = 0; i < this.atleticari.size(); i++) {
                if (this.atleticari.get(i).isBetter(best)) {
                    best = this.atleticari.get(i);
                }
            }
        }
        return best;
    }

    public void printTheBest() {
        System.out.print("Pobednik discipline: ");
       this.bestScoreAtleticar().printInfo();
    }

//    getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }
}
