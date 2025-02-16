package dsa;

public class MyQueue {

    int queue[] = new int[5];
    private int size = 0;
    private int head;
    private int tail;

    public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return size;
    }

    public void enterQueue(int item) {
        if(!isFull()) {
            queue[tail] = item;
            tail = tail + 1 % 5;
            size++;
        }
        else {
            throw new IllegalArgumentException("Queue is full");
        }
    }

    public void monstrar() {
        for(int i = 0; i < size; i++){
            System.out.print(queue[(head + i) %5 ] + " ");
        }
    }

    public int deQueue() {
            int item = queue[head];
            if(!isEmpty()) {
                head = head + 1 % 5;
                size--;
        }
        else throw new IllegalArgumentException("Queue is empty");
        return item;
    }

    public boolean isFull() {
        return size() == 5;
    }
}
