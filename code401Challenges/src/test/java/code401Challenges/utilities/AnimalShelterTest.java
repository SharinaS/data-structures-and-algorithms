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
        Queue<Dog> testDogQ = new Queue<>();
        testDogQ.enqueue(testDog);

        assertEquals("Expected a Dog in the shelter",
                testDog,
                testDogQ.peek()
        );
    }

    // Check that a dog can be entered in and taken out of animal shelter
    @Test
    public void testDequeueDog() {
        Dog testDog1 = new Dog();

        AnimalShelter testShelter = new AnimalShelter();
        testShelter.enqueue(testDog1);

        assertEquals("Should have testDog1",
                testDog1,
                testShelter.dequeue("dog")
        );
    }

    // Check that a cat can be entered in and taken out of animal shelter in the presence of dogs
    @Test
    public void testAdoptCat() {
        Dog testDog1 = new Dog();
        Cat testCat1 = new Cat();
        Dog testDog3 = new Dog();
        AnimalShelter testShelter = new AnimalShelter();

        testShelter.enqueue(testDog1);
        testShelter.enqueue(testCat1);
        testShelter.enqueue(testDog3);

        assertEquals("Should have testCat1",
                testCat1,
                testShelter.dequeue("cat")
        );
    }

    // Check that the oldest dog can be entered in and taken out of animal shelter in the presence of cats
    @Test
    public void testAdoptDog() {
        Dog testDog1 = new Dog();
        Cat testCat1 = new Cat();
        Dog testDog3 = new Dog();
        AnimalShelter testShelter = new AnimalShelter();

        testShelter.enqueue(testDog1);
        testShelter.enqueue(testCat1);
        testShelter.enqueue(testDog3);

        assertEquals("Should have testDog1",
                testDog1,
                testShelter.dequeue("dog")
        );
    }

    // Try to get an animal besides a cat or dog
    @Test(expected = IllegalArgumentException.class)
    public void testAdoptSomething() {
        Dog testDog1 = new Dog();
        Cat testCat1 = new Cat();
        AnimalShelter testShelter = new AnimalShelter();

        testShelter.enqueue(testDog1);
        testShelter.enqueue(testCat1);
        
        testShelter.dequeue("snake");
    }

}


