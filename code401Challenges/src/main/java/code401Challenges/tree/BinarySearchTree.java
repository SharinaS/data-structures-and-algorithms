package code401Challenges.tree;

import code401Challenges.BinarySearch;

// some logic referenced from: https://www.youtube.com/watch?v=wmS-ClgZ1w8&t=584s


public class BinarySearchTree {

    private Node root;


    public BinarySearchTree() {
        root = null;
    }

    // adds a node to the binary search tree
    public void add(int value) {
        addingHelp(root, value);
    }

    // helper method for add method
    private Node addingHelp(Node root, int value) {
        if(root == null){
            root = new Node (value);

        } else if(root.value > value){ // <-----------------
            // add the value of the left child
            root.left = addingHelp(root.left, value);
        } else {
            // add the value of the right child
            root.right = addingHelp(root.right, value);
        }
        return root;
    }


    // checks if the value is in the tree at least once
    public Boolean contains(int value) {
        Node currNode = root;
        while (!currNode.value.equals(value)) {
            if (value < currNode.value) { // <-----------------
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

}
