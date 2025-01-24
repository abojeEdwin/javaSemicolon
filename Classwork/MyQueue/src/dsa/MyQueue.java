package dsa;

public class MyQueue {

    int queue[] = new int[5];
    private int size = 0;
    int front;
    int rear;

    public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return size;
    }

    public void enterQueue(int item) {
        if(!isFull()) {
            queue[rear] = item;
            rear = rear + 1 % 5;
            size++;
        }
        else {
            System.out.println("Queue is full");
        }
    }

    public void monstrar() {
        for(int i = 0; i < size; i++){
            System.out.print(queue[(front + i) %5 ] + " ");
        }
    }

    public int deQueue() {
            int item = queue[front];
            if(!isEmpty()) {
                front = front + 1 % 5;
                size--;
        }
        else System.out.println("Queue is empty");
        return item;
    }

    public boolean isFull() {
        return size() == 5;
    }
}
