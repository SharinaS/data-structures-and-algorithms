package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    // test that a single value can be added
    @Test
    public void testEnqueue1() {
        PseudoQueue pseudoQueueTest = new PseudoQueue();
        pseudoQueueTest.enqueue(30);

        assertEquals(
                "Expected a single value of 30",
                30,
                pseudoQueueTest.peek());
    }

    // test that multiple values can be added, in correct order
    @Test
    public void testEnqueue2() {
        PseudoQueue pseudoQueueTest = new PseudoQueue();
        pseudoQueueTest.enqueue(30);
        pseudoQueueTest.enqueue(40);
        pseudoQueueTest.enqueue(50);

        assertEquals(
                "Expected the front of the pseudoqueue to be 50",
                50,
                pseudoQueueTest.peek());
    }

    // test dequeue method on pseudoQueue with several values
    @Test
    public void dequeue1() {
        PseudoQueue pseudoQueueTest = new PseudoQueue();
        pseudoQueueTest.enqueue(30);
        pseudoQueueTest.enqueue(40);
        pseudoQueueTest.enqueue(50);

        assertEquals(
                "30 was expected, since it was in the queue first.",
                30,
                pseudoQueueTest.dequeue()
                );
    }

    // test dequeue method on emptied pseudoqueue
    @Test(expected = NoSuchElementException.class)
    public void dequeue2() {
        PseudoQueue pseudoQueueTest = new PseudoQueue();
        pseudoQueueTest.enqueue(30);
        pseudoQueueTest.dequeue();
        pseudoQueueTest.dequeue();
    }
}