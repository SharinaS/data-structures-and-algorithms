package code401Challenges.tree;

import java.util.ArrayList;

/* Questions:
* Does Object [] work to return, because it's returning nodes within the array?
* Is there a better way to do this that doesn't involve converting the array list to an array?
* */

public class Tree<T> {

    private ArrayList<T> valuesArr = new ArrayList<>();

    // PreOrder Traversal
    public Object [] preOrderTraversal(Node<T> root) {
        valuesArr.add(root.value);
        if(root.left != null){
            preOrderTraversal(root.left);
        }
        if(root.right != null){
            preOrderTraversal((root.right));
        }
        return valuesArr.toArray();
    }

    // InOrderTraversal
    public Object[] inOrderTraversal (Node<T> root) {
        if(root.left != null) {
            inOrderTraversal(root.left);
        }
        valuesArr.add(root.value);
        if(root.right != null) {
            inOrderTraversal(root.right);
        }
        return valuesArr.toArray();
    }

    // PostOrder Traversal
    public Object[] postOrderTraversal(Node<T> root) {
        if(root.left !=null) {
            postOrderTraversal(root.left);
        }
        if(root.right != null) {
            postOrderTraversal(root.right);
        }
        valuesArr.add(root.value);
        return valuesArr.toArray();
    }
}
