package code401Challenges.utilities;

import code401Challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    //     1
    //    / |
    //   2  3
    //  / |
    // 6  7

    @Test
    public void testFizzBuzz() {
        Node root = new Node("1");
        root.left = new Node("2");
        root.left.left = new Node ("6");
        root.left.right = new Node ("7");
        root.right = new Node("3");

        FizzBuzzTree testTree = new FizzBuzzTree(root);
        testTree.fizzbuzzRecursion();
        assertEquals(
                "Fizz",
                testTree.root.right.value

        );
    }

}