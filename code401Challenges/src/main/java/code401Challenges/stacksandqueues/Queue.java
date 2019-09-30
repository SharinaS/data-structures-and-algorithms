package code401Challenges.stacksandqueues;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

// Youtube resource: "Data Structure - Queue: Implement Queue using Linked List"
// https://www.youtube.com/watch?v=xSa0jg52aEw&t=459s

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
            // tell the last node to point to the new node
            this.back.next = newNode;
            // tell back to point to the new node.
            this.back = this.back.next;
        }
    }

    public void dequeue() throws NoSuchElementException {
        if(this.back == null) {
            throw new NoSuchElementException("The queue is empty");
        }
        this.front = front.next;
        if(this.front == null) {
            this.back = null;
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
