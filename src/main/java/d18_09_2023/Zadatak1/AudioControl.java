package d18_09_2023.Zadatak1;

public class AudioControl extends Control {

    public AudioControl(boolean isLouder) {
        this.isLouder = isLouder;
    }

    public boolean isLouder;

    @Override
    public void execute (VideoPlayer videoPlayer) {
        if (this.isLouder) {
            if (videoPlayer.getVolume() + 1 <= 100){
                videoPlayer.setVolume(videoPlayer.getVolume() + 1);
            } else {
                videoPlayer.setVolume(100);
            }
        }  else {
            if (videoPlayer.getVolume() - 1 > 0){
                videoPlayer.setVolume(videoPlayer.getVolume() - 1);
            } else {
                videoPlayer.setVolume(0);
            }
        }
    }

    public boolean isLouder() {
        return isLouder;
    }

    public void setLouder(boolean louder) {
        isLouder = louder;
    }
}
