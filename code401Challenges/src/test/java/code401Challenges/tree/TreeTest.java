package code401Challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {
    Tree tree = new Tree();

    @Before
    public void setUp() throws Exception {
        //    1
        //   / |
        //  2  3
        // /  /|
        //4  5 6
        Node node5 = new Node(5, new Node(6), null);
        Node node2 = new Node(2, new Node(4), node5);
        Node rootNode = new Node(1, node2, new Node(3));
        tree = new Tree();
        tree.root = rootNode;
    }

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

//    @Test
//    public void testInOrderTraversal() {
//        assertArrayEquals(new Integer[]{4, 2, 6, 5, 1, 3}, tree.inOrderTraversal());
//    }

    @Test
    public void inPreOrderTraversal() {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Tree testTree = new Tree(root);

        ArrayList<Integer> goodAnswer = new ArrayList<>();
        goodAnswer.add(1);
        goodAnswer.add(2);
        goodAnswer.add(3);

        assertArrayEquals(
                "Should get [2, 1, 3]",
                goodAnswer.toArray(),
                testTree.preOrderTraversal().toArray()
        );
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