package code401Challenges.tree;

import java.util.ArrayList;

/* Questions:
* Does Object [] work to return, because it's returning nodes within the array?
* Is there a better way to do this that doesn't involve converting the array list to an array?
* */

public class Tree<T> {

    private Node <T> root;

    public Tree() {
        root = null;
    }

    public Tree(Node<T> root) {
        this.root = root;
    }

    // PreOrder Traversal

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



    // InOrderTraversal
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


    // PostOrder Traversal
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
    
}
