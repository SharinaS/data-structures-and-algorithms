package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {

    // check if stack accepts one value into an empty stack
    @Test
    public void testPush1() {
        Stack testStack = new Stack();
        testStack.push(10);

        assertEquals(
                "The stack should have 10 in it",
                10,
                testStack.peek()
                );
    }

    // check that multiple pieces of data is pushed to top of stack
    @Test
    public void testPush2() {
        Stack testStack = new Stack();
        testStack.push(10);
        testStack.push(20);
        testStack.push(30);

        assertEquals(
                "The stack should have 30 at the top",
                30,
                testStack.peek()
        );
    }

    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push(10);
        testStack.push(20);
        testStack.push(30);
        testStack.pop();

        assertEquals(
                "The stack should now have 20 at the top",
                20,
                testStack.peek()
        );
    }

    // check that empty stack exception activated
    @Test(expected = NoSuchElementException.class)
    public void testPop2() {
        Stack testStack = new Stack();
        testStack.push(10);
        testStack.push(20);
        testStack.pop();
        testStack.pop();
        testStack.pop();
    }


    @Test
    public void testStackExists() {
        Stack testStack = new Stack();
        assertNull(testStack.top);
    }

    @Test
    public void testIsEmpty() {
        Stack testStack = new Stack();
        testStack.push(10);
        testStack.push(20);
        assertEquals("false",
                false,
                testStack.isEmpty());

    }


} // end StackTest