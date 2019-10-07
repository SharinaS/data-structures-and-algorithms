package code401Challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

//    // test if add method works
    @Test
    public void testAdd() {
        BinarySearchTree testbst = new BinarySearchTree();

        testbst.add(50);

        assertEquals("Binary search tree should have a 50 in it",
                50,
                testbst.toString()
        );
    }

    // test if contains method works
}