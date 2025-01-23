public class AirConditioner {



        int temperature;
        int thermostatHighTemperature = 30;
        int thermostatLowTemperature = 16;

        public boolean isAirconOn(){
            return true;
        }

        public boolean isAirconOff() {
            return false ;
        }

        final public int setAirconTemperature() {
            return thermostatHighTemperature;
        }


        public int increaseAirconTemp(int temperature) {
            return temperature++;
        }

        public int decreaseAirconTemp(int temperature) {
            return temperature--;
        }

        public int setHighestTemperatureRange(int temperature) {
            if(increaseAirconTemp(temperature) > thermostatHighTemperature) {
                return thermostatHighTemperature;
            }
            return temperature;
        }

        public int setLowestTemperatureRange(int temperature) {
            if(decreaseAirconTemp(temperature) < thermostatLowTemperature) {
                return thermostatLowTemperature;
            }
            return temperature;
        }
    }











