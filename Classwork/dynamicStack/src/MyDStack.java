public class MyDStack {
        int capacity = 2;
        int stack [] = new int [capacity];
        int size = 0;
        int top = 0;

        public boolean isEmpty() {
            return size == 0;
        }

        public void push(int item) {
            if(size()==capacity){
                expand();
            }
            stack[top++] = item;
            size++;
        }

        private void expand(){
            int length = size();
            int newStack[] = new int[capacity *2];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
            capacity *= 2;
        }

        public void pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                int item;
                item = stack[top - 1];
                stack[top-1] = 0;
                //top = 0;
                reduceCapacity();
               size--;
            }
        }

        public int size(){
            return size;
        }

        private void reduceCapacity(){
            int length = size();
            if(length <= (capacity /2)/2){
                capacity = capacity / 2;
            }
            int newStack[] = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;

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