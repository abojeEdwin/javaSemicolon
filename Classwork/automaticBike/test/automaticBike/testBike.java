package automaticBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testBike {
    Bike myAutoBike = new Bike();

    @BeforeEach
    void startWithThis(){
        Bike myAutoBike = new Bike();
    }

    @Test
    public void testThatMyAutoBikeCanBeTurnedOn(){
        myAutoBike.onBike();
        assertTrue(myAutoBike.isBikeOn());
    }

    @Test
    public void testThatMyAutoBikeCanBeTurnedOff(){
        assertFalse(myAutoBike.isBikeOn());
    }

    @Test
    public void testThatMyAutoBikeCanAccelerate(){
        myAutoBike.accelerate(420);
        assertEquals(420,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeCanDecelerate(){
        myAutoBike.decelerate(30);
        assertEquals(30, myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeInGearOneIncreasesSpeedByOne(){
        myAutoBike.accelerate(16);
        myAutoBike.gearOne(16);
        assertEquals(17,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeInGearTwoIncreasesSpeedByTwo(){
        myAutoBike.accelerate(16);
        assertEquals(18, myAutoBike.gearTwo(16));
    }

    @Test
    public void testThatMyAutoBikeInGearThreeIncreasesSpeedByThree(){
        myAutoBike.accelerate(35);
        assertEquals(38,myAutoBike.gearThree(35));
    }

    @Test
    public void testThatMyAutoBikeInGearFourIncreasesSpeedByFour(){
        myAutoBike.accelerate(44);
        myAutoBike.gearFour(44);
        assertEquals(48,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeDecreasesSpeedByOneInGearOne(){
        //myAutoBike.accelerate(16);
        myAutoBike.decelerate(16);
        myAutoBike.gearOne(16);
        assertEquals(15,myAutoBike.getSpeed());
    }


}
