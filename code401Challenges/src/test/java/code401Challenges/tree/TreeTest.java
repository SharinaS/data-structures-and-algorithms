package code401Challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    // check that empty tree can be instantiated
//    @Test
//    public void testTreeInstantiated() {
//        Tree testTree = new Tree();
//        Node<Integer> n = new Node<>(50);
//
//        Object[] goodAnswer = new Object[]{};
//        assertArrayEquals(goodAnswer);
//
//    }

    @Test
    public void testPreOrderTraversal() {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Tree testTree = new Tree(root);

        ArrayList<Integer> goodAnswer = new ArrayList<>();
        goodAnswer.add(1);
        goodAnswer.add(2);
        goodAnswer.add(3);

        assertArrayEquals(
                "Should get [1, 2, 3]",
                goodAnswer.toArray(),
                testTree.preOrderTraversal().toArray()
        );
    }

    @Test
    public void testInOrderTraversal() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Tree testTree = new Tree(root);

        ArrayList<Integer> goodAnswer = new ArrayList<>();
        goodAnswer.add(1);
        goodAnswer.add(2);
        goodAnswer.add(3);

        assertArrayEquals("Should get [2, 1, 3]", goodAnswer.toArray(),
        testTree.inOrderTraversal().toArray());
    }

    @Test
    public void testPostOrderTraversal() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Tree testTree = new Tree(root);

        ArrayList<Integer> goodAnswer = new ArrayList<>();
        goodAnswer.add(1);
        goodAnswer.add(2);
        goodAnswer.add(3);

        assertArrayEquals("Should get [2, 3, 1]", goodAnswer.toArray(),
                testTree.postOrderTraversal().toArray());
    }


}