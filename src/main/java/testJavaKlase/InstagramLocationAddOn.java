package testJavaKlase;

public class InstagramLocationAddOn extends InstagramAddOn {
    private String locationName;

    public InstagramLocationAddOn(int id, int x, int y, int width, int height, String locationName) {
        super(id, x, y, width, height);
        this.locationName = locationName;
    }

    @Override
    public int minHeight() {
        return 50;
    }

    @Override
    public int minWidth() {
        return 100;
    }

    @Override
    public void printInfo() {
        System.out.println("[" + this.x + ", " + this.y + "] (" + this.height + ", " + this.width + ") L " + this.locationName);
    }


//    getters & setters

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
