package d11_09_2023.Zadatak3ZaVezbanje;

public class Video {
    private String id;
    private String name;
    private int length;
    private int likesNo;
    private int dislikesNo;
    private int viewsNo;

    public Video (String id, String name, int length){
        this.id = id;
        this.name = name;
        this.length = length;
    }

    public void like() {
        this.likesNo++;
    }

    public void dislike() {
        this.dislikesNo++;
    }

    public void view() {
        this.viewsNo++;
    }

//    getters
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getLength() {
        return this.length;
    }
    public int getLikesNo() {
        return this.likesNo;
    }
    public int getDislikeNo() {
        return this.dislikesNo;
    }
    public int getViewsNo() {
        return this.viewsNo;
    }
}
