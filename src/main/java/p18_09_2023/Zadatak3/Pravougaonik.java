package p18_09_2023.Zadatak3;

public class Pravougaonik extends Figura{
    private double stranicaA;
    private double stranicaB;

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return this.stranicaA * this.stranicaB;
    }

    @Override
    public double obim() {
        return 2 * this.stranicaA + 2 * this.stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }
}
