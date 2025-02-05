package television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
        Television television= new Television();

        @BeforeEach
        void setUp() {
            Television television = new Television();
        }

        @Test
        public void testThatTelevisionCanComeOn(){
            assertTrue(television.turnOn());
        }

        @Test
        public void testThatTelevisionCanGoOnAndOff(){
            television.turnOn();
            television.turnOff();
            assertFalse(television.isOn());
        }

        @Test
        public void testThatTelevisionCanIncreaseVolume(){
            television.turnOn();
            television.increaseVolume();
            television.increaseVolume();
            television.increaseVolume();
            assertEquals(3,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionCanDecreaseVolume(){
            television.turnOn();
            television.increaseVolume();
            television.increaseVolume();
            television.decreaseVolume();
            assertEquals(1,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionCanSetChannel(){
            television.turnOn();
            television.setChannel(10);
            assertEquals(10,television.getChannelLevel());
        }

        @Test
        public void testThatTelevisionCanChangeChannel(){
            television.turnOn();
            television.channelUp();
            television.channelUp();
            television.channelUp();
            assertEquals(3,television.getChannelLevel());
        }

        @Test
        public void testThatTelevisionCanMute(){
            television.turnOn();
            television.mute();
            assertEquals(0,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionCanUnmute(){
            television.turnOn();
            television.increaseVolume();
            television.increaseVolume();
            television.increaseVolume();
            assertEquals(3,television.getVolumeLevel());
            television.mute();
            television.unMute();
            assertEquals(3,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionVolumeDoesNotIncreaseVolumeWhenOff(){
            television.increaseVolume();
            television.increaseVolume();
            television.increaseVolume();
            assertEquals(0,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionDoesNotChangeChannelWhenOff(){
            television.channelUp();
            television.channelUp();
            assertEquals(0,television.getChannelLevel());
        }

        @Test
        public void testThatTelevisionDoesGoPassVolumeSetLimit(){
           television.turnOn();
           for(int i = 0; i >= 40 ; i++)
            assertEquals(0,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionReturnsCorrectValuesWhenTurnedOnIncreasedVolumeTurnedOffMutedAndUnmuted(){
            television.turnOn();
            television.increaseVolume();
            television.increaseVolume();
            television.increaseVolume();
            television.turnOff();
            television.turnOn();
            television.mute();
            television.unMute();
            assertEquals(3,television.getVolumeLevel());

        }

        @Test
        public void testThatTelevisionDoesNotReduceVolumeBelowZero(){
            television.turnOn();
            television.increaseVolume();
            television.increaseVolume();
            television.increaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            television.decreaseVolume();
            assertEquals(0,television.getVolumeLevel());
        }

        @Test
        public void testThatTelevisionCanChangeChannelDown(){
            television.turnOn();
            television.channelUp();
            television.channelUp();
            television.channelDown();
            assertEquals(1,television.getChannelLevel());
        }

        @Test
        public void testThatTelevisionDoesNotChangeChannelBelowZero(){
            television.turnOn();
            television.channelUp();
            television.channelUp();
            television.channelDown();
            television.channelDown();
            television.channelDown();
            assertEquals(0,television.getChannelLevel());
        }

        @Test
        public void testThatTelevisionCanChangeChannelUpSetChannelDownChannelUpAndReturnCorrectValue(){
            television.turnOn();
            television.channelUp();
            television.channelUp();
            television.setChannel(77);
            television.channelDown();
            television.channelDown();
            television.channelDown();
            television.channelUp();
            assertEquals(75,television.getChannelLevel());
        }
}
