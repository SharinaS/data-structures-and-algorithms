package code401Challenges.utilities;

import code401Challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue <Cat> catQ = new Queue();
    Queue <Dog> dogQ = new Queue();


    public void enqueue (Cat cat){
        catQ.enqueue(cat);
    }

    public void enqueue (Dog dog){
        dogQ.enqueue(dog);
    }

    public Animal dequeue (String pref) {
        if (pref.toLowerCase().equals("cat")){
            catQ.dequeue();
        } else if (pref.toLowerCase().equals("dog")) {
            dogQ.dequeue();
        }
        return null;
    }
}
