package testJavaKlase;

public class Zadatak {
    public static void main(String[] args) {

        InstagramUser milan = new InstagramUser("milan", "Milan Milanovic");
        InstagramUser stefan = new InstagramUser("stefan13", "Stefan Stefanovic");
        InstagramUser pera = new InstagramUser("pera", "Pera Peric");
        InstagramUser mika = new InstagramUser("mika", "Mika Mikic");
        InstagramUser jovan = new InstagramUser("jovan", "Jovan Jovic");

        InstagramStory story1 = new InstagramStory(milan, "https://www.instagram.com/p/CecrcPyrPMj/");
        InstagramLocationAddOn location = new InstagramLocationAddOn(123546654,10,15, 70,  120, "Kej");
        location.decreaseDimension(20, 20);

        InstagramMentionAddOn tagPera = new InstagramMentionAddOn(2135135, 4, 1, 40, 10, pera);
        tagPera.increaseDimension(40, 50);
        InstagramMentionAddOn tagMika = new InstagramMentionAddOn(5165161, 5, 2, 100, 60, mika);
        InstagramMentionAddOn tagMilan = new InstagramMentionAddOn(5354354, 15, 20, 80, 50, milan);
        InstagramMentionAddOn tagStefan = new InstagramMentionAddOn(5661065, 10, 11, 80, 50, stefan);

        story1.addAddOn(location);
        story1.addAddOn(tagPera);
        story1.addAddOn(tagMika);
        story1.addAddOn(tagMilan);
        story1.addAddOn(tagStefan);

        story1.deleteAddOn(5354354);

        story1.postStory();
        story1.viewStory(stefan);
        story1.viewStory(pera);
        story1.viewStory(mika);
        story1.viewStory(jovan);
        story1.viewStory(stefan);
        story1.viewStory(milan);

        System.out.println();

        story1.printViewers();

        System.out.println();

        story1.setSwipeUpLink("http://google.com/");
        story1.postStory();

    }
}
