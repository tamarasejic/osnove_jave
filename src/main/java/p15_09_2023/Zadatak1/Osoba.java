package p15_09_2023.Zadatak1;

public class Osoba {
    protected String fullName;
    protected String jmbg;

    public Osoba() {
    }

    public Osoba(String fullName, String jmbg) {
        this.fullName = fullName;
        this.jmbg = jmbg;
    }

    public void printInfo() {
        System.out.println(this.fullName + ", " + this.jmbg);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
