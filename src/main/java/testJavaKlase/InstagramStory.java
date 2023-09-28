package testJavaKlase;

import java.util.ArrayList;

public class InstagramStory {
    private InstagramUser author;
    private String swipeUpLink;
    private String imageLink;
    private ArrayList<InstagramAddOn> addOns;
    private ArrayList<InstagramUser> viewers;

    public InstagramStory(InstagramUser author, String imageLink) {
        this.author = author;
        this.imageLink = imageLink;
        this.addOns = new ArrayList<>();
        this.viewers = new ArrayList<>();
    }

    public void addAddOn(InstagramAddOn addOn) {
        this.addOns.add(addOn);
    }

    public void deleteAddOn(int id) {
        ArrayList<InstagramAddOn> deletedList = new ArrayList<>();
        for (InstagramAddOn addOn : this.addOns) {
            if (addOn.getId() == id) {
                deletedList.add(addOn);
            }
        }
        this.addOns.removeAll(deletedList);
    }

    private boolean hasAlreadySeen(String username) {
        if (this.viewers.isEmpty()) {
            return false;
        }

        for (InstagramUser viewer : this.viewers) {
            if (viewer.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void viewStory(InstagramUser viewer) {
        if (!this.hasAlreadySeen(viewer.getUsername())) {
            this.viewers.add(viewer);
        }
    }

    public void postStory() {
        this.author.printInfo();
        System.out.println("Story:");
        System.out.println("Image: " + this.imageLink);
        for (InstagramAddOn addOn : this.addOns) {
                addOn.printInfo();
        }

        if (this.swipeUpLink != null) {
            System.out.println("<<< swipe up >>>");
            System.out.println(this.swipeUpLink);
        }
    }

    public int viewNo() {
        return this.viewers.size();
    }

    public void printViewers() {
        int views = viewNo();
        for (InstagramUser viewer : this.viewers) {
            if (viewer.equals(this.author)) {
                views = this.viewNo()-1;
            }
        }
        System.out.println("Viewers " + views);

        for (InstagramUser viewer : this.viewers) {
            if (!viewer.equals(this.author)) {
                viewer.printInfo();
            }
        }
    }

    //  getters & setters


    public void setSwipeUpLink(String swipeUpLink) {
        this.swipeUpLink = swipeUpLink;
    }

    public InstagramUser getAuthor() {
        return author;
    }

    public String getSwipeUpLink() {
        return swipeUpLink;
    }

    public String getImageLink() {
        return imageLink;
    }

    public ArrayList<InstagramAddOn> getAddOns() {
        return addOns;
    }

    public ArrayList<InstagramUser> getViewers() {
        return viewers;
    }
}
