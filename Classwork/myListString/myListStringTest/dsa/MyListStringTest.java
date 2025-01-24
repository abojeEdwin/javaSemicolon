package dsa;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyListStringTest {
    MyListString listString =  new MyListString();

    @BeforeEach
    public void startWithThis(){
        listString =  new MyListString();
    }
    @AfterEach
    public void endWithThis(){
        listString.clearItems();
    }

    @Test
    public void testThatMyListIsEmpty(){
        assertTrue(listString.isEmpty());
    }

    @Test
    public void testThatMyListReturnsItemIndex(){
        listString.addItem("A String");
        listString.addItem("B String");
        listString.addItem("C String");
        assertEquals(2,listString.indexOfItem("C String"));
    }


    @Test
    public void testThatMyListCanTakeOneElement(){
        listString.addItem("A String");

        assertEquals(0,listString.indexOfItem("A String"));
        assertEquals(1, listString.size());
        assertTrue(listString.isContainItem("A String"));
    }

    @Test
    public void testThatMyListCanTakeTwoElements(){
        listString.addItem("A String");
        listString.addItem("B String");
        assertEquals(0,listString.indexOfItem("A String"));
        assertEquals(1,listString.indexOfItem("B String"));
        assertEquals(2, listString.size());
    }

    @Test
    public void testThatMyListContainsElement(){
        listString.addItem("A String");
        assertTrue(listString.isContainItem("A String"));
        assertFalse(listString.isContainItem("G Strings"));
    }


    @Test
    public void testThatMyListCanAddABCDAndRemoveA(){
        listString.addItem("A String");
        listString.addItem("B String");
        listString.addItem("C String");
        listString.addItem("D String");
        listString.removeItem("A String");
        assertEquals(3,listString.size());

    }
    @Test
    public void testThatMyListCanClearAllElements(){
        listString.addItem("A String");
        listString.addItem("B String");
        listString.addItem("C String");
        listString.clearItems();
        assertFalse( listString.isContainItem("A String"));
    }

    @Test
    public void testThatMyListSizeLimit(){
        listString.addItem("A String");
        listString.addItem("B String");
        listString.addItem("C String");
        listString.addItem("D String");
        listString.addItem("E String");
        listString.addItem("F String");

        listString.extendList();
        assertEquals(6,listString.size());
    }

    @Test
    public void testThatListCanTakeItemsAfterClearing(){
        listString.addItem("A String");
        listString.addItem("B String");
        listString.clearItems();
        assertFalse(listString.isContainItem("A String"));
        listString.addItem("D String");
        assertTrue(listString.isContainItem("D String"));
    }

}


