package time;

public class Time1 {
    private int hours;
    private int minutes;
    private int seconds;


    public Time1() {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time value");
        }
        this.hours = hour;
        this.minutes = minute;
        this.seconds = second;

    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hours == 0 || hours == 12)? 12 : hours % 12),
                minutes,seconds,(hours < 12 ? "AM" : "PM"));
    }
}
