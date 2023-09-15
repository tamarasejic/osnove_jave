package p14_09_2023.Zadatak2;

public class Reakcija {
    private String reactionType;
    private String userFullName;

    public Reakcija() {
    }

    public Reakcija(String reactionType, String userFullName) {
        this.reactionType = reactionType;
        this.userFullName = userFullName;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
}
