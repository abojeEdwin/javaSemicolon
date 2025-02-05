package television;

public class Television {
        private boolean isOn = false;
        private int volumeLevel = 0;
        private int channelLevel = 0;
        private int previousVolumeState = 0;


    public boolean turnOn() {return isOn = true;}

    public boolean turnOff() {return isOn;}

    public void increaseVolume() {
        if(isOn) {this.volumeLevel++;}
        if(this.volumeLevel >= 0 && this.volumeLevel < 30){this.volumeLevel++;}
    }

    public int getVolumeLevel() {return volumeLevel;}

    public void decreaseVolume() {this.volumeLevel--;}

    public int setChannel(int channel){if (isOn){return this.channelLevel = channel;} else {return this.channelLevel = 0;}}

    public void channelUp() {if(isOn){this.channelLevel++;} else {this.channelLevel = 0;}}

    public int getChannelLevel() {return channelLevel;}

    public void mute() {if(isOn){previousVolumeState = volumeLevel;volumeLevel = 0;}}

    public  void unMute() {if(turnOn()) {volumeLevel = previousVolumeState ;}}


}
