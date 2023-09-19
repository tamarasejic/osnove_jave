package d18_09_2023.Zadatak1;

public class TimeControl extends Control {

    public TimeControl(boolean isForward) {
        this.isForward = isForward;
    }

    public boolean isForward;

    @Override
    public void execute(VideoPlayer videoPlayer) {
        if (this.isForward) {
            if (videoPlayer.getCurrentTime() + 15 <= videoPlayer.getVideoLength()){
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime() + 15);
            } else {
                videoPlayer.setCurrentTime(videoPlayer.getVideoLength());
            }
        }  else {
            if (videoPlayer.getCurrentTime() - 15 > 0){
                videoPlayer.setCurrentTime(videoPlayer.getCurrentTime() - 15);
            } else {
                videoPlayer.setCurrentTime(0);
            }
        }
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }
}
