import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AirconditionerTest {

        @Test
        public void testThatAircondionComesOnWhenTurnedOn(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
        }

        @Test
        public void testThatAircondionGoesOffWhenTurnedOff(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());

            assertFalse(breeze.isAirconOff());
        }

        @Test
        public void testThatAirconditionTemperatureIsSet(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
            assertFalse(breeze.isAirconOff());

            assertEquals(30,breeze.setAirconTemperature());
        }

        @Test
        public void testThatAirconditionCanIncreaseTemperature(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
            assertFalse(breeze.isAirconOff());
            assertEquals(30,breeze.setAirconTemperature());

            breeze.increaseAirconTemp(-0);
            assertEquals(-0,breeze.increaseAirconTemp(-0));
        }

        @Test
        public void testThatAirconditionCanDecreaseTemperature(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
            assertFalse(breeze.isAirconOff());
            assertEquals(30,breeze.setAirconTemperature());
            breeze.increaseAirconTemp(10);
            assertEquals(10,breeze.increaseAirconTemp(10));

            assertEquals(16,breeze.decreaseAirconTemp(16));
        }

        @Test
        public void testThatAirconTemperatureFromUserDoestGoAboveSetTemperature(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
            assertFalse(breeze.isAirconOff());
            assertEquals(30,breeze.setAirconTemperature());

            breeze.increaseAirconTemp(10);
            breeze.setHighestTemperatureRange(10);
            assertEquals(10,breeze.setHighestTemperatureRange(10));

        }

        @Test
        public void testThatAirconTemperatureFromUserDoesNotGoBelowSetTemperature(){
            AirConditioner breeze = new AirConditioner();
            assertTrue(breeze.isAirconOn());
            assertFalse(breeze.isAirconOff());
            assertEquals(30,breeze.setAirconTemperature());
            breeze.increaseAirconTemp(10);
            breeze.setHighestTemperatureRange(10);
            assertEquals(10,breeze.setHighestTemperatureRange(10));

            breeze.decreaseAirconTemp(16);
            breeze.setLowestTemperatureRange(16);
            assertEquals(16,breeze.setLowestTemperatureRange(16));

        }




    }

