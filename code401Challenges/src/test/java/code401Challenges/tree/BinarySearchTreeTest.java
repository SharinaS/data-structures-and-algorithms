package code401Challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    // Check that empty tree can be instantiated
    @Test
    public void testTreeInstantiated() {
        BinarySearchTree testbst = new BinarySearchTree();
        assertNull (testbst.getRoot());
    }

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

    // check that root is correct, given multiple values added
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

    // check that left child leaf is correct
    @Test
    public void testAdd3() {
        BinarySearchTree testbst = new BinarySearchTree();

        testbst.add(6);
        testbst.add(4);
        testbst.add(5);
        testbst.add(3);


        Integer expected = 3;

        assertEquals("Binary search tree root should be 3",
                expected,
                testbst.getRoot().left.left.value
        );
    }

    @Test
    // test if contains method works
    public void testContains1() {
        BinarySearchTree testbst = new BinarySearchTree();

        testbst.add(6);
        testbst.add(4);
        testbst.add(5);
        testbst.add(3);

        assertTrue(testbst.contains(5));
    }

    @Test
    // test if method catches that a value should not be in the tree
    public void testContains2() {
        BinarySearchTree testbst = new BinarySearchTree();

        testbst.add(6);
        testbst.add(4);
        testbst.add(5);
        testbst.add(3);

        assertFalse(testbst.contains(10));
    }
}