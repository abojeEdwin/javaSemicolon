package automaticBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testBike {
    Bike myAutoBike = new Bike();

    @BeforeEach
    void startWithThis(){
        Bike myAutoBike = new Bike();
    }

    @Test
    public void testThatMyAutoBikeCanBeTurnedOn(){
        myAutoBike.onBike();
        myAutoBike.offBike();
        assertFalse(myAutoBike.isBikeOn());
    }

    @Test
    public void testThatMyAutoBikeCanBeTurnedOff(){
        myAutoBike.offBike();
        assertFalse(myAutoBike.isBikeOn());
    }

    @Test
    public void testThatMyAutoBikeCanAccelerate(){
        myAutoBike.onBike();
        for(int speed = 0 ; speed < 15; speed ++){
            myAutoBike.accelerate();
            }
        assertEquals(2,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeCanDecelerate(){
        myAutoBike.decelerate();
        assertEquals(30, myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeInGearOneIncreasesSpeedByOne(){
        myAutoBike.onBike();
        for(int i = 0; i <= 15; i++){
            myAutoBike.accelerate();
        }
        //assertEquals(16,myAutoBike.getSpeed());
        for(int i = 0; i <= 5; i++){
            myAutoBike.accelerate();
        }
       // assertEquals(23,myAutoBike.getSpeed());
        for(int i = 0; i <= 5; i++){
            myAutoBike.decelerate();
        }
        assertEquals(15,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeInGearTwoIncreasesSpeedByTwo(){
        myAutoBike.accelerate();
        //assertEquals(, myAutoBike.gearTwo());
    }

    @Test
    public void testThatMyAutoBikeInGearThreeIncreasesSpeedByThree(){
        myAutoBike.accelerate();
        //assertEquals(,myAutoBike.gearThree());
    }

    @Test
    public void testThatMyAutoBikeInGearFourIncreasesSpeedByFour(){
        myAutoBike.accelerate();
        assertEquals(48,myAutoBike.getSpeed());
    }

    @Test
    public void testThatMyAutoBikeDecreasesSpeedByOneInGearOne(){
        myAutoBike.accelerate();
        assertEquals(16,myAutoBike.getSpeed());
        myAutoBike.decelerate();
        assertEquals(20,myAutoBike.getSpeed());
    }
}
