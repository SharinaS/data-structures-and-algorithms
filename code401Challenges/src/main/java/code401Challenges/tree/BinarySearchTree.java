package code401Challenges.tree;

import code401Challenges.BinarySearch;

// some logic referenced from: https://www.youtube.com/watch?v=wmS-ClgZ1w8&t=584s
// Main resource: https://www.baeldung.com/java-binary-tree


public class BinarySearchTree {

    private Node <Integer> root;


    public BinarySearchTree() {
        root = null;
    }


    // adds a node to the binary search tree
    public void add(Integer value) {
        root = addingHelp(root, value);
    }

    // recursive method to do the insertion
    private Node <Integer> addingHelp(Node <Integer> curr, Integer value) {
//        if (value < curr.value) {
//            if (curr.left )
//        }

        if (curr == null) {
            return new Node<>(value);
        }
        if (value < curr.value) {
            curr.left = addingHelp(curr.left, value);
        } else if (value > curr.value) {
            curr.right = addingHelp(curr.right, value);
        } else {
            return curr;
        }
        return curr;
    }


    // checks if the value is in the tree at least once
    public boolean contains(int value) {
        Node <Integer> currNode = root;
        while (!currNode.value.equals(value)) {
            if (value < currNode.value) {
                currNode = currNode.left;
            } else {
                currNode = currNode.right;
            }
            // the value doesn't exist
            if(currNode == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    public Node<Integer> getRoot() {
        return root;
    }
}
