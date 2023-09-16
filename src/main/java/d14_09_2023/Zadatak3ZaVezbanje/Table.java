package d14_09_2023.Zadatak3ZaVezbanje;

import java.util.ArrayList;

public class Table {
    private TableHeader header;
    private ArrayList<TableRow> tableRows;
    private int rowsPerPage;

    public Table(TableHeader header) {
        this.header = header;
        this.tableRows = new ArrayList<>();
    }

    public void addNewRow(TableRow tableRow) {
        this.tableRows.add(tableRow);
    }

    public void  printInfo(int pageNum) {
        this.header.printInfo();
        int indexNo = (pageNum - 1) * rowsPerPage;
        int moduo = this.tableRows.size() % rowsPerPage;
        int iterationNo = 0;

        if (moduo == 0){
            iterationNo = rowsPerPage;
        } else {
            iterationNo = moduo;
        }

        int i = 0;
        boolean isNull = false;
        while (!isNull && i < iterationNo) {
            if (this.tableRows.get(i + indexNo) != null) {
                this.tableRows.get(i + indexNo).printInfo();
                i++;
            } else {
                isNull = true;
            }
        }
        System.out.println();
        System.out.println("Number of rows per page [" + rowsPerPage + "]");
        this.printPaginator();
    }

    public void printTableHTML() {
        System.out.println("<table>");
        System.out.println("<thead>");
        this.header.printHTML();
        System.out.println("</thead>");
        System.out.println("<tbody>");
        for (int i = 0; i < this.tableRows.size(); i++) {
            this.tableRows.get(i).printHTML();
        }
        System.out.println("<t/body>");
        System.out.println("</table>");
    }

    public void printFilteredTable(String filterText) {
        this.header.printInfo();
        int noMatchCount = 0;
        for (int i = 0; i < this.tableRows.size(); i++) {
            if (this.tableRows.get(i).isAMatch(filterText)){
                this.tableRows.get(i).printInfo();
            } else {
                noMatchCount++;
            }
        }
        if (noMatchCount == this.tableRows.size()) {
            System.out.println("No filter matches found.");
        }
    }

    public void printPaginator() {
        int numOfPages = this.tableRows.size() / rowsPerPage;
        for (int i = 0; i < numOfPages; i++) {
            if (this.tableRows.size() % rowsPerPage == 0 && i != numOfPages - 1) {
                System.out.print("| " + (i  + 1) + " ");
            } else {
                System.out.println("| " + (i  + 1) + " |");
            }
        }
    }


    public TableHeader getHeader() {
        return header;
    }

    public void setHeader(TableHeader header) {
        this.header = header;
    }

    public int getRowsPerPage() {
        return rowsPerPage;
    }

    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }
}
