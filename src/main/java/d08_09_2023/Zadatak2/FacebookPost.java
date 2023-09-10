package d08_09_2023.Zadatak2;

public class FacebookPost {
    public String publisher;
    public String receiver;
    public String text;
    public int likeNo;
    public int shareNo;

    public void like() {
        this.likeNo = this.likeNo + 1;
    }

    public void dislike() {
        this.likeNo = this.likeNo - 1;
        if (this.likeNo < 0) {
            this.likeNo = 0;
        }
    }

    public void share() {
        this.shareNo = this.shareNo + 1;
    }

    public void print() {
        System.out.println(this.publisher + " >>> " + this.receiver);
        System.out.println(this.text);
        System.out.println("Likes " + this.likeNo + " | Shares " + this.shareNo);
    }
}
