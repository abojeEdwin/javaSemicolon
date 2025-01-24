package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTest {
    MySet mySet = new MySet();
    @BeforeEach
    void startWithThis(){
        MySet mySet = new MySet();
    }

    @Test
    public void testThatMySetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testThatMySetCanAdd(){
        mySet.addItem("G String");
        mySet.addItem("B String");
        mySet.addItem("D String");
        assertEquals(3,mySet.size());
    }

    @Test
    public void testThatMySetCanUpdate(){
        mySet.addItem("Ripple");
        mySet.addItem("Bison");
        mySet.addItem("Dragon");
        mySet.updateItems("GOAT");
        assertEquals(4,mySet.size());
    }

    @Test
    public void testThatMySetAddsABCDEAndDoesNotReturnDuplicates(){
        mySet.addItem("Aang");
        mySet.addItem("Mufasa");
        mySet.addItem("Bison");
        mySet.addItem("DragonOfTheWest");
        mySet.addItem("Aang");
        mySet.removeDuplicates("Aang");
        assertEquals(4,mySet.size());
    }
}
