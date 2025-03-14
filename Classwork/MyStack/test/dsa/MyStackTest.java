package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyStackTest {
    MyStack myStack = new MyStack();

    @BeforeEach
    void startWith(){
        myStack= new MyStack();
    }

    @Test
    public void testThatMyStackisEmpty(){
        myStack.isEmpty();
    }

    @Test
    public void testThatMyStackCanAdd(){
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
    }


    @Test
    public void testThatMyStackCanRemove(){
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.pop();
        assertEquals(2,myStack.getSize());
    }


    @Test
    public void testThatMyStackCanDisplayItems(){
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();
    }

    @Test
    public void testThatMyStackCanPeek(){
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.peek();
    }

    @Test
    public void testThatMyStackCanAddPopAndReturnCorrectSize(){
        myStack.push(10);
        myStack.push(20);
        
        myStack.push(30);
        myStack.pop();
        myStack.pop();
        assertEquals(1,myStack.getSize());
    }

    @Test
    public void testThatMyStackReturnsCorrectValueWhenCheckedIsEmpty(){
         myStack.push(10);
         myStack.push(20);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatMyStackIsFull(){
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(90);
        myStack.push(80);
        myStack.push(70);
        assertThrows(IllegalArgumentException.class , () -> myStack.push(22));

    }

    @Test
    public void testThatMyStackHandlesExceptionWhenUserTrysToPopWhenEmpty(){
        assertThrows(IllegalArgumentException.class, () -> myStack.
                pop());
    }

}