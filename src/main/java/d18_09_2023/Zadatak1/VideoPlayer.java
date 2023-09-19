package d18_09_2023.Zadatak1;

public class VideoPlayer {
    private int videoLength;
    private int currentTime;
    private int volume;
    private int videoQuality;

    public VideoPlayer(int videoLength, int currentTime, int volume) {
        this.videoLength = videoLength;
        this.currentTime = currentTime;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("Current time: " + this.currentTime / 60 + ":" + this.currentTime % 60 + " s");
        System.out.println("Volume: " + this.volume);
        System.out.println("Video quality: " + this.videoQuality + "p");
    }



//    getters & setters

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }
}
