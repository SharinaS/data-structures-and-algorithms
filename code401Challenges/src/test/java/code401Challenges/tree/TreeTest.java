package code401Challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {


    @Test
    public void testPreOrderTraversal() {
        Tree testTree = new Tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Object[] goodAnswer = new Object[]{1, 2, 3};

        assertArrayEquals(
                "Should get [1, 2, 3]",
                goodAnswer,
                testTree.preOrderTraversal(root));
    }

    @Test
    public void testInOrderTraversal() {
        Tree testTree = new Tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Object[] goodAnswer = new Object[]{2, 1, 3};

        assertArrayEquals("Should get [2, 1, 3]", goodAnswer,
        testTree.inOrderTraversal(root));
    }

    @Test
    public void testPostOrderTraversal() {
        Tree testTree = new Tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Object[] goodAnswer = new Object[]{2, 3, 1};

        assertArrayEquals("Should get [2, 3, 1]", goodAnswer,
                testTree.postOrderTraversal(root));
    }


}