package org.java.datastructure.stack;

public class Stack {
    private final int arr[];
    private int top;
    private final int capacity;

    // Constructor to initialize the stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element `x` to the stack
    public void push(int input) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n...");
            System.exit(-1);
        }

        System.out.println("Inserting.... " + input);
        arr[++top] = input;
    }

    // Utility function to pop a top element from the stack
    public int pop() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated....");
            System.exit(-1);
        }

        System.out.println("Removing.... " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }

    // Utility function to return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }

        return -1;
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1; // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1; // or return size() == capacity;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1); // inserting 1 in the stack
        stack.push(2); // inserting 2 in the stack

        stack.pop(); // removing the top element (2)
        stack.pop(); // removing the top element (1)

        stack.push(3); // inserting 3 in the stack

        System.out.println("Top Element is..... " + stack.peek());
        System.out.println("Stack Size is.... " + stack.size());

        stack.pop(); // removing the top element (3)

        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The Stack is Empty...");
        } else {
            System.out.println("The Stack is Not Empty...");
        }
    }
}
