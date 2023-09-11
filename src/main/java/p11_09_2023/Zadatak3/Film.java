package p11_09_2023.Zadatak3;

public class Film {
    private String name;
    private int releaseYear;
    private Reziser directedBy;

    public Film () {
    }
    public Film (String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
    public Film (String name, int releaseYear, Reziser directedBy) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.directedBy = directedBy;
    }

    public void printInfo() {
        System.out.println("Movie: " + this.name + ", from " + this.releaseYear + ".");
        if (this.directedBy != null) {
            this.directedBy.printInfo();
        }
    }

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public int getReleaseYear () {
        return this.releaseYear;
    }
    public void setReleaseYear (int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Reziser getDirectedBy() {
        return directedBy;
    }
    public void setDirectedBy(Reziser directedBy) {
        this.directedBy = directedBy;
    }
}
