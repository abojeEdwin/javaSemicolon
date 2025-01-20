import airConditionerTest.Airconditioner;
import org.junit.Test;

import static org.testng.AssertJUnit.*;


public class AirConditinerTest {

    @Test
    public void testThatAircondionComesOnWhenTurnedOn(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
    }

    @Test
    public void testThatAircondionComesOnWhenTurnedOff(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());

        assertFalse(breeze.isAirconOff());
    }

    @Test
    public void testThatAirconditionTemperatureIsSet(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());

        assertEquals(30,breeze.setAirconTemperature());
    }

    @Test
    public void testThatAirconditionCanIncreaseTemperature(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());

        assertEquals(30,breeze.increaseAirConTemp(30));
    }

    @Test
    public void testThatAirconditionCanDecreaseTemperature(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        breeze.increaseAirConTemp(10);
        assertEquals(10,breeze.increaseAirConTemp(10));

        assertEquals(16,breeze.decreaseAirconTemp(16));
    }


    @Test
    public void testThatAirconTemperatureFromUserDoestGoAboveSetTemperature(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        assertEquals(30,breeze.increaseAirConTemp(30));
        assertEquals(16,breeze.increaseAirConTemp(16));


        breeze.increaseAirConTemp(30);
        breeze.setHighestTemperatureRange(30);
        assertEquals(30,breeze.setHighestTemperatureRange(30));

    }

    @Test
    public void testThatAirconTemperatureFromUserDoesNotGoBelowSetTemperature(){
        Airconditioner breeze = new Airconditioner();
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        assertEquals(30,breeze.increaseAirConTemp(30));
        assertEquals(30,breeze.setHighestTemperatureRange(30));

        assertEquals(16,breeze.setLowestTemperatureRange(16));
    }

}
