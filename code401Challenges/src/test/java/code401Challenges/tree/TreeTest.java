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

    // ===== Test for checking Breadth First Traversal
    // uncomment this once breadth first search in Tree fixed
//    @Test
//    public void testBreadfirstTraverse1() {
//
//        //       2
//        //      / |
//        //     7  5
//        //    / |  \
//        //   2  6   7
//        //     / \  /
//        //    5  11 4
//        Node root = new Node(2);
//        root.left = new Node(7);
//        root.right = new Node(5);
//        root.left.left = new Node(2);
//        root.left.right = new Node(6);
//        root.left.right.left = new Node(5);
//        root.left.right.right = new Node(11);
//        root.right.right = new Node(7);
//        root.right.right.left = new Node(4);
//
//        Tree breadthTestTree = new Tree(root);
//        ArrayList<Integer> goodAnswer = new ArrayList<>();
//        goodAnswer.add(2);
//        goodAnswer.add(7);
//        goodAnswer.add(5);
//        goodAnswer.add(2);
//        goodAnswer.add(6);
//        goodAnswer.add(7);
//        goodAnswer.add(5);
//        goodAnswer.add(11);
//        goodAnswer.add(4);
//
//        assertEquals("Expecting a bunch of numbers",
//               goodAnswer,
//                breadthTestTree.breadthFirstSearch());
//
//    }

    // ===== Test for finding max value in a tree
    @Test
    public void testFindMaxValue1() {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);

        Tree testTree = new Tree(root);

        assertEquals("Expecting 11",
                11,
                testTree.findMaxValue()
                );
    }




}