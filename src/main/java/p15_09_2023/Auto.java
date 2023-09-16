package p15_09_2023;

public class Auto extends Vozilo {

    private int brVrata;

    public Auto() {
        super();
    }

    public Auto(String registracija, String marka, int brzina, int brVrata) {
        super(registracija, marka, brzina);
        this.brVrata = brVrata;
    }

    public int getBrVrata() {
        return brVrata;
    }

    public void setBrVrata(int brVrata) {
        this.brVrata = brVrata;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("BROJ VRATA: " + this.brVrata);
    }
}


