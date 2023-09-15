package p14_09_2023.Zadatak2;

import java.util.ArrayList;

public class FacebookPost {
    private String postOwnerFullName;
    private String postText;
    private ArrayList<Reakcija> reaction;


    public FacebookPost(String postOwnerFullName, String postText) {
        this.postOwnerFullName = postOwnerFullName;
        this.postText = postText;
        this.reaction = new ArrayList<>();
    }

    public void react(Reakcija newReaction) {
        this.reaction.add(newReaction);
    }

    private int reactionNo (String reactionType) {
        int typeCounter = 0;
        for (int i = 0; i < this.reaction.size(); i++) {
            if (this.reaction.get(i).getReactionType().equals(reactionType)) {
                typeCounter++;
            }
        }
        return typeCounter;
    }

    public void printInfo() {
        System.out.println(this.postOwnerFullName);
        System.out.println(this.postText);
        System.out.println("Smiles " + this.reactionNo("smile") +
                " | Likes " + this.reactionNo("like") +
                " | Hearts " + this.reactionNo("heart"));
    }


    public ArrayList<Reakcija> getReaction() {
        return reaction;
    }

    public String getPostOwnerFullName() {
        return postOwnerFullName;
    }

    public void setPostOwnerFullName(String postOwnerFullName) {
        this.postOwnerFullName = postOwnerFullName;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
