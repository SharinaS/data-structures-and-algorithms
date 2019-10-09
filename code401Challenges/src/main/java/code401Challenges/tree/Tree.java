package code401Challenges.tree;

import code401Challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Tree<T> {

    public Node <T> root;

    public Tree() {  // <----------- why two constructors?
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

//    public Integer[] inOrderTraversal() {
//        return this.inOrderTraversalHelper(this.root).toArray(new Integer[0]);
//    }
//
//    private List<Integer> inOrderTraversalHelper(Node root) {
//        List<Integer> answer = new LinkedList<>();
//
//        if (root != null) {
//            answer.addAll(inOrderTraversalHelper(root.left));
//            answer.add((Integer) root.value);
//            answer.addAll(inOrderTraversalHelper(root.right));
//        }
//        return answer;
//    }


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

    // ======= Breadth First Traversal, using a queue, for numbers
    public void breadthFirstTraverse (Node<Integer> root) {
        Queue<Integer> storageQ = new Queue<>();

        if (root == null) {
            throw new NoSuchElementException();
        } else {
            storageQ.enqueue(root.value);
        }

        while (!storageQ.isEmpty()) {
            Integer currNode = storageQ.dequeue();
            System.out.println(currNode);
            if (root.left != null) {
                storageQ.enqueue(root.left.value);
            }
            if (root.right != null)
                storageQ.enqueue(root.right.value);
            }
    }


}
