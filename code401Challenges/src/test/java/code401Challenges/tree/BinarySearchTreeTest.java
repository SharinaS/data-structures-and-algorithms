package code401Challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

 // test if add method works for a single item in the tree
    @Test
    public void testAdd1() {
        BinarySearchTree testbst = new BinarySearchTree();

        testbst.add(50);
        Integer expected = 50;

        assertEquals("Binary search tree should have a 50 in it",
                expected,
                testbst.getRoot().value
        );
    }

    @Test
    public void testAdd2() {
        BinarySearchTree testbst = new BinarySearchTree();


        testbst.add(6);
        testbst.add(4);
        testbst.add(5);

        Integer expected = 6;

        assertEquals("Binary search tree root should be 6",
                expected,
                testbst.getRoot().value
        );
    }

    // test if contains method works
}