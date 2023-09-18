package p18_09_2023.Zadatak3;

public abstract class Figura {
    public Figura() {
    }

    public abstract double povrsina();
    public abstract double obim();
    public void printInfo() {
        System.out.println("Povrsina je: " + this.povrsina());
        System.out.println("Obim je: " + this.obim());
    }
}
