package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    MyLinkedList linkedList = new MyLinkedList();


    @BeforeEach
    void startWithThis() {
    linkedList = new MyLinkedList();
    }


    @Test
    public void testThatMyLinkedListCanInsertItems(){
        linkedList.insertItem(5);
        linkedList.insertItem(10);
        linkedList.insertItem(15);
        linkedList.insertItem(20);
    }

    @Test
    public void testThatMyLinkedListCanDisplayItems(){
        linkedList.insertItem(5);
        linkedList.insertItem(10);
        linkedList.insertItem(15);
        linkedList.insertItem(20);
        linkedList.displayItem();
    }

    @Test
    public void testThatMyLinkedListCanAddItemFromTheBeginning(){
        linkedList.insertItem(5);
        linkedList.insertItem(10);
        linkedList.insertItem(15);
        linkedList.insertAtStart(35);
        linkedList.displayItem();
    }

    @Test
    public void testThatMyLinkedListCanInsertAtAnyLocation(){
        linkedList.insertItem(5);
        linkedList.insertItem(10);
        linkedList.insertItem(15);
        linkedList.insertItem(20);
        linkedList.insertItem(100);
        linkedList.insertAt(0,700);
        linkedList.displayItem();
    }

    @Test
    public void testThatMyLinkedListCanDelete(){
        linkedList.insertItem(5);
        linkedList.insertItem(10);
        linkedList.insertItem(15);
        linkedList.insertItem(20);
        linkedList.deleteAt(2);
        linkedList.displayItem();
    }



}
