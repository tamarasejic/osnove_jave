package p12_09_2023.Zadatak2;

public class Korisnik {
    private String fullName;
    private String licence;

    public Korisnik () {
        this.licence = "basic";
    }

    public void upgradeLicence (int payment) {
        if (payment == 100) {
            this.licence = "pro";
        } else if (payment == 150) {
            this.licence = "premium";
        } else {
            this.licence = "basic";
        }
    }

    public void resetLicence () {
        this.licence = "basic";
    }

    public int maxVideoLength () {
        if (this.licence.equals("pro")) {
            return 240;
        } else if (this.licence.equals("premium")) {
            return 1440;
        } else {
            return 40;
        }
    }

    public void printInfo () {
        System.out.println(this.fullName);
    }

//    getters & setters

    public String getFullName (){
        return this.fullName;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public String getLicence () {
        return this.licence;
    }
}
