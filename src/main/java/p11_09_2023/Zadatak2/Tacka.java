package p11_09_2023.Zadatak2;

public class Tacka {
    private int x;
    private int y;

    public Tacka() {
    }

    public Tacka(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void printCoordinates () {
        System.out.println("Koordinate tacke su x = " + this.x + " i y = " + this.y);
    }

    public int getX () {
        return this.x;
    }

    public void setX (int x){
        this.x = x;
    }

    public int getY () {
        return this.y;
    }

    public void setY (int y){
        this.y = y;
    }
}
