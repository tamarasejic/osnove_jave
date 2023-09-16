package p15_09_2023;

public class Vozilo {
    protected String registracija;
    protected String marka;

    protected int brzina;

    public Vozilo() {
    }

    public Vozilo(String registracija, String marka, int brzina) {
        this.registracija = registracija;
        this.marka = marka;
        this.brzina = brzina;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void dodajGas(){
        this.brzina += 10;
    }

    public void koci(){
        this.brzina -= 10;
    }

    public void printInfo () {
        System.out.println("REGISTRACIJA: " + this.registracija);
        System.out.println("BRZINA: " + this.brzina);
        System.out.println("MARKA: " + this.marka);
    }
}
