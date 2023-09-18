package p18_09_2023.Zadatak3;

public class JednakostranicniTrougao extends Figura{
    private double stranicaA;

    public JednakostranicniTrougao(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
        return (this.stranicaA * this.stranicaA) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3 * this.stranicaA;
    }

    public double getStranicaA() {
        return stranicaA;
    }
}
