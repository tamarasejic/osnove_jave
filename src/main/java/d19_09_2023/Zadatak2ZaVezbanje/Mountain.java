package d19_09_2023.Zadatak2ZaVezbanje;

public class Mountain {
    private String name;
    private String state;
    private int height;

    public Mountain() {
    }

    public Mountain(String name, String state, int height) {
        this.name = name;
        this.state = state;
        this.height = height;
    }

//    getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
