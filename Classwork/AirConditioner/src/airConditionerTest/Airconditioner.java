package airConditionerTest;

public class Airconditioner {


   private int temperature;
   final int thermostatHighTemperature;
   final int thermostatLowTemperature;

    public Airconditioner() {
        this.thermostatHighTemperature = 30;
        this.thermostatLowTemperature = 16;
    }


    public boolean isAirconOn() {
        return true;
    }

    public boolean isAirconOff() {
        return false;
    }

    public int setAirconTemperature() {
        return thermostatHighTemperature;

    }

    public int increaseAirConTemp(int temperature) {
        return temperature++;
    }

    public int decreaseAirconTemp(int temperature) {
        return temperature--;
    }

    public int setHighestTemperatureRange(int temperature) {
        return thermostatHighTemperature;
    }

    public int setLowestTemperatureRange(int temperature) {
        return thermostatLowTemperature;
    }

}
