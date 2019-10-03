package code401Challenges.utilities;

import code401Challenges.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    // check that cat can be added to the queue
    @Test
    public void testEnqueueForCat() {
        Cat testCat = new Cat();
        Queue<Cat> testCatQ = new Queue<>();

        testCatQ.enqueue(testCat);

        assertEquals("Expected a Cat in the shelter",
                testCat,
                testCatQ.peek()
        );
    }

    // check that a dog is added to the dog queue
    @Test
    public void testEnqueueDog() {
        Dog testDog = new Dog();
        Queue testDogQ = new Queue();

        testDogQ.enqueue(testDog);
        assertEquals("Expected a Dog in the shelter",
                testDog,
                testDogQ.peek()
        );
    }

    // Issue: dequeue method is taken from queue class methods, and doesn't accept the string that the new dequeue method should accept
//    @Test
//    public void testDequeueDog() {
//        Dog testDog1 = new Dog();
//        Dog testDog2 = new Dog();
//        Dog testDog3 = new Dog();
//
//        Queue testDogQ = new Queue();
//        testDogQ.enqueue(testDog3);
//
//        testDogQ.enqueue(testDog1);
//        testDogQ.enqueue(testDog2);
//        testDogQ.enqueue(testDog3);
//
//        assertEquals("Should have testDog1",
//                testDog1,
//                testDogQ.dequeue("dog")
//        );
//    }



}