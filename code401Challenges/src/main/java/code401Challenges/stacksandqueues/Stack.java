package code401Challenges.stacksandqueues;

// Youtube resource: "Data Structure - Stack: Implement Stack using Linked List",
// https://www.youtube.com/watch?v=0wG3AM0Be50

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {
    Node<T> top;

    public Stack() {
        this.top = null;
    }

    // push method - adds a new node with that value to the top of the stack with an O(1) Time performance.
    public void push(T data) {
        // create a node
        Node<T> newNode = new Node<T>(data);
        // point the new node to the top of the list
        newNode.next = this.top;
        // change the top pointer to the new node
        this.top = newNode;
    }

    // pop method - removes the node from the top of the stack, and returns the node’s value.
    public int pop() throws NoSuchElementException {
        if(this.top == null) {
            throw new NoSuchElementException("The stack is bone dry empty");
        } else {
            Node temp = top;
            this.top = this.top.next;
            return temp.data;
        }
    }

    // peek method - does not take an argument and returns the value of the node located on top of the stack,
    // without removing it from the stack.
    public int peek() throws EmptyStackException {
        if (this.top == null) {
            throw new EmptyStackException();
        } else {
            return this.top.data;
        }
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
