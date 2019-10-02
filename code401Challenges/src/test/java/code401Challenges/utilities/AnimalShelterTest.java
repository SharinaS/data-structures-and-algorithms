package code401Challenges.utilities;

import code401Challenges.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEnqueueForCat() {
        AnimalShelter testShelter = new AnimalShelter();
        Cat testCat = new Cat();
        Queue testCatQ = new Queue();

        testShelter.enqueue(testCat);
        assertEquals("Expected testCat1 in the shelter",
                testCat,
                testCatQ.peek()
                );
    }

    @Test
    public void testEnqueueForDog() {
        AnimalShelter testShelter = new AnimalShelter();
        Dog testDog = new Dog();
        Queue testDogQ = new Queue();

        testShelter.enqueue(testDog);
        assertEquals("Expected testDog in the shelter",
                testDog,
                testDogQ.peek()
        );

    @Test
    public void dequeue() {
        
        }
    }
}