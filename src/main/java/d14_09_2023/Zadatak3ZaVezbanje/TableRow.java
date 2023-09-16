package d14_09_2023.Zadatak3ZaVezbanje;

import java.util.ArrayList;

public class TableRow {
    private ArrayList<String> cells;

    public TableRow() {
        this.cells = new ArrayList<>();
    }

    public void addRowCell(String cell) {
        this.cells.add(cell);
    }

    public void printInfo() {
        for (int i = 0; i < this.cells.size(); i++) {
            if (i == 0) {
                System.out.print(this.cells.get(i) + "\\t\\t|");
            } else if (i == this.cells.size() - 1) {
                System.out.println("\\t\\t" + this.cells.get(i) + "\\t\\t|");
            } else {
                System.out.print("\\t\\t" + this.cells.get(i) + "\\t\\t|");
            }
        }
    }

    public void printHTML() {
        System.out.print("<tr>");
        for (int i = 0; i < this.cells.size(); i++) {
            System.out.print("<td>" + this.cells.get(i) + "</td>");
        }
        System.out.println("</tr>");
    }

    public boolean isAMatch(String cellText) {
        for (int i = 0; i < this.cells.size(); i++) {
            if (this.cells.get(i).equals(cellText)){
                return true;
            }
        }
        return false;
    }


    //  getters
    public ArrayList<String> getCells() {
        return cells;
    }
}
