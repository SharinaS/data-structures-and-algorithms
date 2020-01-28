package code401Challenges.tree;

// some logic referenced from: https://www.youtube.com/watch?v=wmS-ClgZ1w8&t=584s
// Main resource: https://www.baeldung.com/java-binary-tree

// note that BinarySearchTree could extend Tree, since it's a type of a tree.
//public class BinarySearchTree extends Tree<Integer> {}

public class BinarySearchTree {
    private Node <Integer> root;

    // constructor
    public BinarySearchTree() {
        this.root = null;
    }

    // ===== adds a node to the binary search tree
    // wrapper method
    public void add(Integer value) {
        root = addNode(root, value);
    }

    // recursive method to do the insertion - provides extra info at each recursive level.
    private Node <Integer> addNode(Node <Integer> curr, Integer value) {
        if (curr == null) {
            return new Node<>(value);
        }
        if (value < curr.value) {
            curr.left = addNode(curr.left, value);
        } else if (value > curr.value) {
            curr.right = addNode(curr.right, value);
        } else {
            return curr;
        }
        return curr;
    }


    // ===== checks if the value is in the tree at least once
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


    // ===== toString method
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    // ===== getter
    public Node<Integer> getRoot() {
        return root;
    }
}
