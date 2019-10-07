package code401Challenges.tree;

// Node Class for Trees

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


    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
