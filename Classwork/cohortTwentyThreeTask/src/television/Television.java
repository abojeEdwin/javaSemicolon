package television;

public class Television {
        private boolean isOn;
        private int volumeLevel = 0;
        private int channelLevel = 0;
        private int previousVolumeState = 0;

    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {return isOn = true;}

    public boolean turnOff() {return isOn = false;}

    public void increaseVolume() {
        if(isOn && this.volumeLevel >= 0 && this.volumeLevel < 30){this.volumeLevel++;}
    }

    public int getVolumeLevel() {return volumeLevel;}

    public void decreaseVolume() {
        this.volumeLevel--;
        if(this.volumeLevel < 0)this.volumeLevel = 0;}

    public int setChannel(int channel){if (isOn){return this.channelLevel = channel;} else {return this.channelLevel = 0;}}

    public void channelUp() {if(isOn){this.channelLevel++;} else {this.channelLevel = 0;}}

    public int getChannelLevel() {return channelLevel;}

    public void mute() {if(isOn){previousVolumeState = volumeLevel;volumeLevel = 0;}}

    public  void unMute() {if(turnOn()) {volumeLevel = previousVolumeState ;}}


    public void channelDown() {
        if(isOn && this.channelLevel < 0){
            this.channelLevel = 0;
        }
        if(isOn && this.channelLevel >0 && this.channelLevel <= 101){this.channelLevel--;}
    }
}
