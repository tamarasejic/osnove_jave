package testJavaKlase;

public class InstagramMentionAddOn extends InstagramAddOn {
    private InstagramUser taggedUser;

    public InstagramMentionAddOn(int id, int x, int y, int width, int height, InstagramUser taggedUser) {
        super(id, x, y, width, height);
        this.taggedUser = taggedUser;
    }


    @Override
    public int minHeight() {
        return 50;
    }

    @Override
    public int minWidth() {
        return 80;
    }

    @Override
    public void printInfo() {
        System.out.println("[" + this.x + ", " + this.y + "] (" + this.height + ", " + this.width + ") @" + this.taggedUser.getUsername() + "/" + this.taggedUser.generateLink());
    }



    //    getters & setters

    public InstagramUser getTaggedUser() {
        return taggedUser;
    }

    public void setTaggedUser(InstagramUser taggedUser) {
        this.taggedUser = taggedUser;
    }
}
