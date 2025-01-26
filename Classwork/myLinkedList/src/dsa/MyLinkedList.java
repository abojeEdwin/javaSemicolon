package dsa;

public class MyLinkedList {
    MyLinkedListNode head;

    public void insertItem(int data) {
        MyLinkedListNode node = new MyLinkedListNode();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }else{
            MyLinkedListNode prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = node;
        }

    }

    public void displayItem(){
        MyLinkedListNode node = head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        MyLinkedListNode node = new MyLinkedListNode();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        MyLinkedListNode node = new MyLinkedListNode();
        node.data = data;
        node.next = null;


        if (index == 0) {
         insertAtStart(data);
         return;
        }
        MyLinkedListNode start = head;
        for (int i = 0; i < index -1; i++) {
            start = start.next;
        }
        node.next = start.next;
        start.next = node;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        }
        else{
            MyLinkedListNode start = head;
            MyLinkedListNode prev = null;
            for (int i = 0; i < index -1; i++) {
                start = start.next;
            }
            prev = start.next;
            start.next = prev.next;
            prev = null;
        }
    }
}
