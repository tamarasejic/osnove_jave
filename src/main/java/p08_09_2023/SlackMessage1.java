package p08_09_2023;

public class SlackMessage1 {
    public String text;
    public String imeIPrezime;
    public String dateAndTime;
    public String lastUpdateAt;

    public void printSlackMessage () {
        System.out.println(this.imeIPrezime + " - " + this.dateAndTime);
        System.out.println(this.text);
    }

    public String convertToString () {
        String result = "";
        result = imeIPrezime + " - " + dateAndTime + ", " + text;
        return result;
    }

    public void update (String newText, String updatedAt) {
        this.text = newText;
        this.lastUpdateAt = updatedAt;
    }

}
