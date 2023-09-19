package d18_09_2023.Zadatak1;

public class QualityOptimizerControl extends Control {
    public double netSpeedMBs;

    public QualityOptimizerControl(double netSpeedMBs) {
        this.netSpeedMBs = netSpeedMBs;
    }

    @Override
    public void execute (VideoPlayer videoPlayer) {
        double quality = this.netSpeedMBs * 10.1;
        if (quality < 144) {
            videoPlayer.setVideoQuality(144);
        }  else if (quality < 240){
            videoPlayer.setVideoQuality(240);
        }   else if (quality < 360){
            videoPlayer.setVideoQuality(360);
        }  else if (quality < 480){
            videoPlayer.setVideoQuality(480);
        }  else if (quality < 720){
            videoPlayer.setVideoQuality(720);
        } else {
            videoPlayer.setVideoQuality(1080);
        }
    }

    public double getNetSpeedMBs() {
        return netSpeedMBs;
    }

    public void setNetSpeedMBs(double netSpeedMBs) {
        this.netSpeedMBs = netSpeedMBs;
    }
}
