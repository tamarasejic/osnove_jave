package testJavaKlase;

public abstract class InstagramAddOn {
    protected int id;
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public abstract int minWidth();
    public abstract int minHeight();

    public InstagramAddOn(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void increaseDimension(int increaseHeight, int increaseWidth) {
        this.height += increaseHeight;
        this.width += increaseWidth;
    }

    public void decreaseDimension(int decreaseHeight, int decreaseWidth) {
        this.height -= decreaseHeight;
        if (this.height < this.minHeight()){
            this.height = this.minHeight();
        }
        this.width -= decreaseWidth;
        if (this.width < this.minWidth()){
            this.width = this.minWidth();
        }
    }

    public abstract void printInfo();


//    getters

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
