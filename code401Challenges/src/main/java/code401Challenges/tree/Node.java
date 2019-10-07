package code401Challenges.tree;

// Node Class for Trees

public class Node <T> {
    // instance variables
    public Node <T> left;
    public Node <T> right;
    public T value;


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
