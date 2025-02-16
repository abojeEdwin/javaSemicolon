package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    MyQueue myQueue = new MyQueue();

    @BeforeEach
    void startWith(){
        MyQueue myQueue = new MyQueue();
    }

    @Test
    public void testThatMyQueueIsEmpty(){
        myQueue.enterQueue(15);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void testThatMyQueueCanAddElement(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.enterQueue(7);
        myQueue.enterQueue(8);
        assertEquals(4,myQueue.size());
    }
    @Test
    public void testThatMyQueueCanDisplayElementInQueue(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.monstrar();
    }

    @Test
    public void testThatMyQueueCanRemoveElement(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.enterQueue(7);
        myQueue.deQueue();
        myQueue.monstrar();
    }
    @Test
    public void testThatMyQueueCanAddElementRemoveElementAndCheckSizeOfQueue(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.enterQueue(7);
        myQueue.deQueue();
        myQueue.deQueue();
        assertEquals(1,myQueue.size());
    }
     @Test
    public void testThatMyQueueCanAddElementRemoveElementAndCheckIsEmpty(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.enterQueue(7);
        myQueue.deQueue();
        myQueue.deQueue();
        assertFalse(myQueue.isEmpty());
     }
      @Test
    public void testThatMyQueueCanAddElementAndCheckIsFull(){
        myQueue.enterQueue(5);
        myQueue.enterQueue(6);
        myQueue.enterQueue(7);
        myQueue.enterQueue(8);
        myQueue.enterQueue(9);
        assertTrue(myQueue.isFull());
      }


}
