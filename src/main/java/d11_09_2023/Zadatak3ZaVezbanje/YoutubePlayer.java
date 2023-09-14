package d11_09_2023.Zadatak3ZaVezbanje;

public class YoutubePlayer {
    private Video video;
    private int videoQuality;
    private String videoMode;
    private int volume;
    private int currentTime;

    public YoutubePlayer () {
        this.volume = 75;
        this.videoQuality = 144;
        this.videoMode = "Mini player";
    }

    public void loadVideo(Video video) {
        this.video = video;
        this.currentTime = 0;
        this.video.view();
    }

    public void volumeUp() {
        this.volume += 10;
        if (this.volume > 100){
            this.volume = 100;
        }
    }

    public void volumeDown() {
        this.volume -= 10;
        if (this.volume < 0){
            this.volume = 0;
        }
    }

    public void chooseQuality(int internetSpeed) {
        if (internetSpeed < 2) {
            this.videoQuality = 144;
        } else if (internetSpeed < 4) {
            this.videoQuality = 240;
        } else if (internetSpeed < 6) {
            this.videoQuality = 360;
        } else if (internetSpeed < 8) {
            this.videoQuality = 720;
        } else {
            this.videoQuality = 1080;
        }
    }

    public void activateMiniPlayerMode() {
        this.videoMode = "Mini player";
    }
    public void activateCinemaMode() {
        this.videoMode = "Cinema";
    }
    public void activateFullScreenMode() {
        this.videoMode = "Full screen";
    }

    public void fastForward() {
        if (this.video != null) {
            this.currentTime += 10;
            if (this.currentTime > this.video.getLength()) {
                this.currentTime = this.video.getLength();
            }
        } else {
            System.out.println("Video not loaded! Load the video.");
        }
    }

    public void rewind() {
        if (this.video != null) {
            this.currentTime -= 10;
            if (this.currentTime < 0) {
                this.currentTime = 0;
            }
        } else {
            System.out.println("Video not loaded! Load the video.");
        }
    }

    public void printVolume() {
        String line = "|";
        System.out.print("<:");
        if (this.volume != 0) {
            for (int i = 0; i < this.volume / 10; i++) {
                if (i != this.volume / 10 - 1) {
                    System.out.print(line);
                } else {
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("/");
        }
    }

    public void printMode() {
        if (this.videoMode.equals("Mini player"))  {
            System.out.println("[]");
        } else if (this.videoMode.equals("Cinema")) {
            System.out.println("[..]");
        } else if (this.videoMode.equals("Full screen")) {
            System.out.println("[||||]");
        }
    }

    public void printCurrentTime() {
        if (this.video != null) {
            int minute = this.currentTime / 60;
            int second = this.currentTime % 60;
            int minuteTotalVideo = this.video.getLength() / 60;
            int secondTotalVideo = this.video.getLength() % 60;
            System.out.print(minute + ":" + second + " / " + minuteTotalVideo + ":" + secondTotalVideo);
        } else {
        System.out.println("Video not loaded! Load the video.");
        }
    }

    public void printTimeline() {
        if (this.video != null) {
            int stars = this.currentTime * 100 / this.video.getLength();
            int dots = 100 - stars;

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            for (int i = 0; i < dots; i++) {
                if (i != dots - 1) {
                    System.out.print(".");
                } else {
                    System.out.println(".");
                }
            }
        } else {
                System.out.println("Video not loaded! Load the video.");
            }
    }

    public void printInfo() {
        if (this.video != null) {
        this.printCurrentTime();
        System.out.print(" Volume ");
        this.printVolume();
        System.out.print("Timeline: ");
        this.printTimeline();
        System.out.println("Video quality: " + this.videoQuality + "p");
        System.out.print("Video mode: ");
        this.printMode();
        System.out.println(this.video.getName());
        System.out.println("Likes " + this.video.getLikesNo() + " | Dislikes " + this.video.getDislikeNo());
        System.out.println(this.video.getViewsNo() + " Views");
        } else {
            System.out.println("Video not loaded! Load the video.");
        }
    }

    public String generateShareLink() {
        if (this.video != null) {
        return "https://youtu.be/" + this.video.getId();
        } else {
            return "Video not loaded! Load the video.";
        }
    }

// getters
    public Video getVideo() {
        return this.video;
    }
    public int getVideoQuality() {
        return this.videoQuality;
    }
    public String getVideoMode() {
        return this.videoMode;
    }
    public int getVolume() {
        return this.volume;
    }
    public int getCurrentTime() {
        return this.currentTime;
    }
}
