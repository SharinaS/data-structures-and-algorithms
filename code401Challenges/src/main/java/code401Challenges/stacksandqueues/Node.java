package code401Challenges.stacksandqueues;

public class Node<T> {
    // instance variables
    T data;
    T next;

    // constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
