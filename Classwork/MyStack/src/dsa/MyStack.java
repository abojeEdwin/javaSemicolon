package dsa;

public class MyStack {
    int stack [] = new int [6];
    int size = 0;
    int top = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack is full");
        }else{
            stack[top++] = item;
            size++;
        }
    }

    public int pop() {
        int item = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            item = stack[top];
            stack[top] = 0;
            size--;

        }
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

    public boolean isFull() {
        return size == stack.length;
    }
}
