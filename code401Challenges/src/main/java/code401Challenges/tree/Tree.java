package code401Challenges.tree;

import java.util.*;

public class Tree<T> {
    // instance variable
    public Node<T> root;

    // constructors
    public Tree() {
        root = null;
    }

    public Tree(Node<T> root) {
        this.root = root;
    }


    // ====== PreOrder Traversal
    public ArrayList<T> preOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();
        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }

    private ArrayList<T> preOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        valuesArr.add((T) root.value);

        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        return valuesArr;
    }


    //========= InOrderTraversal
    public ArrayList<T> inOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();
        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }
    private ArrayList<T> inOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        valuesArr.add((T) root.value);

        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        return valuesArr;
    }


    // ======= PostOrder Traversal
    public ArrayList<T> postOrderTraversal() {
        ArrayList<T> valuesArr = new ArrayList<>();

        preOrderTraversalHelper(this.root, valuesArr);
        return valuesArr;
    }

    private ArrayList<T> postOrderTraversalHelper(Node<T> root, ArrayList<T> valuesArr) {
        if(root == null) {
            return valuesArr;
        }
        if(root.left != null){
            valuesArr = preOrderTraversalHelper(root.left, valuesArr);
        }
        if(root.right != null){
            valuesArr = preOrderTraversalHelper(root.right, valuesArr);
        }
        valuesArr.add((T) root.value);
        return valuesArr;
    }

    // TODO: write shorter postOrder method


    // ======= Breadth First Traversal, using a queue, for numbers =======
    // Notes from Michelle at: https://github.com/codefellows/seattle-java-401d6/blob/master/class-18/Tree.java

    public List<T> breadthFirstTraversalWrapper() {
        return breadthFirstTraverse(this.root);
    }
    public List<T> breadthFirstTraverse (Node<T> root) {
        Queue<Node<T>> storageQ = new LinkedList<>();
        List<T> result = new LinkedList<>();

        // put the root into the queue to process first.
        if (root == null) {
            throw new NoSuchElementException();
        } else {
            storageQ.add(root);
        }
        // process rest of the nodes, while there are nodes left
        while (!storageQ.isEmpty()) {
            Node<T> currNode = storageQ.remove();
            result.add(currNode.value);

            System.out.println("current result is " + result);
            System.out.println("current queue has " + storageQ);
            System.out.println("current node is " + currNode.value);

            if (currNode !=null && currNode.left != null) {
                storageQ.add(currNode.left);
            }
            if (currNode != null && currNode.right != null) {
                storageQ.add(currNode.right);
            }
        }
        return result;
    }


    // ======= Find Max Value in a Binary Tree =======
    public int findMaxValueWrapper() {
        if (this.root.value instanceof Integer){
            return preOrderMaxFinder((Node<Integer>) this.root, Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException();
        }
    }

    private int preOrderMaxFinder(Node <Integer> curr, int highest) {
        if(curr == null) {
            return highest;
        }
        if(curr.value > highest) {
            highest = curr.value;
        }
        if (curr.left != null) {
            highest = preOrderMaxFinder(curr.left, highest);
        }
        if (curr.right != null) {
            highest = preOrderMaxFinder(curr.right, highest);
        }
        return highest;
    }

    // ====== Fun Way to Find Max in a Tree from Michelle Ferreirae =========
    public int findMax_weird(Node<Integer> root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(findMax_weird(root.left), findMax_weird(root.right)));
    }

    // ======= Find Min Value in a Tree from Michelle Ferreirae =========
    public int findMin_weird(Node<Integer> root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.value, Math.min(findMax_weird(root.left), findMin_weird(root.right)));
    }

    // ====== Find Sum of nodes in a Tree from Michelle Ferreirae ========
    public int sum(Node<Integer> root) {
        // base case
        if (root == null) {
            return 0;
        }
        // recursion
        return sum(root.left) + sum(root.right) + root.value;
    }

    // ====== Find number of leaves in a Tree from Michelle Ferreirae ========
    // if we get to where root is null, there's not a leaf there, so return 0.
    // if we get to a leaf, count it, return 1.
    // otherwise, figure out how many leaves on each side and add them up.
    // Frontrow video on https://frontrowviews.com/Home/Event/Play/5d76a968bdb9b10d0cb5cdb7

    // Algorithm: if we get to where root is null, and there's not a leaf there, return 0.
    // If we get to a leaf, count it and return 1.
    // Otherwise, figure out how many leaves on each side and add them up.

    public int countLeaves(Node<T> root) {
        if(root == null) {
            return 0;
        } else if ( root.left == null && root.right == null ) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }
}
