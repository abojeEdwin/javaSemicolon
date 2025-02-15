package geopoliticalzones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestGeoPoliticalZones {

    @Test
    public void testThatGeoPoliticalZonesSouthWestReturnsCorrectStates(){
        var zone = PoliticalZone.SOUTH_EAST;
        assertArrayEquals(new String []{"Abia","Anambra","Ebonyi","Enugu","Imo"}, zone.getState());
    }




}
