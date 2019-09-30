package code401Challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Queue {
    //instance variable
    Node front;
    Node back;

    // constructor
    public Queue () {
        this.front = null;
        this.back = null;
    }

    // Method takes any value as an argument and adds a new node with that value to the back
    // of the queue with an O(1) Time performance.
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // queue is empty, so just add newNode
        if(this.back == null) {
            this.front = this.back = newNode;
        } else {
            this.back.next = newNode;
            this.back = this.back.next;
        }
    }

    // peek method - does not take an argument and returns the value of the node located on top of the stack,
    // without removing it from the stack.
    public int peek() throws EmptyStackException {
        if (this.front == null) {
            throw new EmptyStackException();
        } else {
            return this.front.data;
        }
    }



} //end of the Class
