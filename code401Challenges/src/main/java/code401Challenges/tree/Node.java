package code401Challenges.tree;

public class Node <T> {
    // instance variables
    Node <T> left;
    Node <T> right;
    T value;

    // constructor
    public Node (T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
