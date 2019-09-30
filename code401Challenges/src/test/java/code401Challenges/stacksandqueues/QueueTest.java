package code401Challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;


public class QueueTest {

    // check that data gets into empty queue
    @Test
    public void testEnqueue1() {
        Queue testQueue = new Queue();

        testQueue.enqueue(400);
        assertEquals(
                "The queue should have 400 in it",
                400,
                testQueue.peek());
    }

    // check if method adds a value in the correct order - the end of the queue, so peek will show the first value added.
    @Test
    public void testEnqueue2() {
        Queue testQueue = new Queue();
        testQueue.enqueue(400);
        testQueue.enqueue(500);

        assertEquals(
                "The queue should have 400 in it",
                400,
                testQueue.peek());
    }

    @Test
    public void testDequeue1() {
        Queue testQueue = new Queue();
        testQueue.enqueue(400);
        testQueue.enqueue(500);
        testQueue.dequeue();

        assertEquals("The queue should only have 500 in it, since 400 was dequeued",
                500,
                testQueue.peek());
    }

    // check that exception catches empty queue
    @Test(expected = NoSuchElementException.class)
    public void testDequeue2() {
        Queue testQueue = new Queue();
        testQueue.enqueue(400);
        testQueue.enqueue(500);
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
    }

    @Test
    public void testQueueExistence() {
        Queue testQueue = new Queue();
        assertNull(testQueue.front);
    }
}