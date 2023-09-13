package d11_09_2023.Zadatak2;

public class FacebookPost {
    private String postText;
    private User createdBy;

    public FacebookPost(String postText, User createdBy) {
        this.postText = postText;
        this.createdBy = createdBy;
    }

    public void printInfo() {
        this.createdBy.printInfo();
        System.out.println(this.postText);
    }


//    getters & setters
    public String getPostText() {
        return this.postText;
    }
    public void setPostText(String postText) {
        this.postText = postText;
    }
    public User getCreatedBy() {
        return this.createdBy;
    }
    public void setCreatedBy (User createdBy)  {
        this.createdBy = createdBy;
    }
}
