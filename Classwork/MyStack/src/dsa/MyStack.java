package dsa;

public class MyStack {
    int stack [] = new int [6];
    private int size = 0;
    int top = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int item) {
        stack[top++] = item;
        size++;
    }

    public int pop() {
        int item;
        item = stack[top - 1];
        stack[top] = 0;
        size--;
        return item;
    }

    public int size(){
        return size;
    }

    public void display() {
        for(int item : stack) {
            System.out.print(item + " ");
        }
    }

    public int peek(){
            int item;
            item = stack[top - 1];
            System.out.println(item);
            return item;
    }

}
