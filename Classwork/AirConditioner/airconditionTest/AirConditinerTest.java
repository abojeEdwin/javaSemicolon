import airConditionerTest.Airconditioner;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.testng.AssertJUnit.*;


public class AirConditinerTest {

    Airconditioner breeze = new Airconditioner();

    @BeforeEach
    void setUp(){
        breeze = new Airconditioner();
    }

    @Test
    public void testThatAircondionComesOnWhenTurnedOn(){
        assertTrue(breeze.isAirconOn());
    }

    @Test
    public void testThatAircondionComesOnWhenTurnedOff(){
        assertTrue(breeze.isAirconOn());

        assertFalse(breeze.isAirconOff());
    }

    @Test
    public void testThatAirconditionTemperatureIsSet(){
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());

        assertEquals(30,breeze.setAirconTemperature());
    }

    @Test
    public void testThatAirconditionCanIncreaseTemperature(){
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());

        assertEquals(30,breeze.increaseAirConTemp(30));
    }

    @Test
    public void testThatAirconditionCanDecreaseTemperature(){
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        breeze.increaseAirConTemp(30);
        assertEquals(30,breeze.increaseAirConTemp(30));

        assertEquals(16,breeze.decreaseAirconTemp(16));
    }


    @Test
    public void testThatAirconTemperatureFromUserDoestGoAboveSetTemperature(){
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        assertEquals(30,breeze.increaseAirConTemp(30));
        assertEquals(30,breeze.increaseAirConTemp(30));


        breeze.increaseAirConTemp(30);
        breeze.setHighestTemperatureRange(30);
        assertEquals(30,breeze.setHighestTemperatureRange(30));

    }

    @Test
    public void testThatAirconTemperatureFromUserDoesNotGoBelowSetTemperature(){
        assertTrue(breeze.isAirconOn());
        assertFalse(breeze.isAirconOff());
        assertEquals(30,breeze.setAirconTemperature());
        assertEquals(30,breeze.increaseAirConTemp(30));
        assertEquals(30,breeze.setHighestTemperatureRange(30));

        assertEquals(16,breeze.setLowestTemperatureRange(16));
    }

}
