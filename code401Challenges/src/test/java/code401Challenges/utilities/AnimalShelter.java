package code401Challenges.utilities;

import code401Challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue <Object> catQ = new Queue();
    Queue <Object> dogQ = new Queue();


    public void enqueue (Object animal){
        if(animal instanceof Cat) {
            catQ.enqueue(animal); // <--------------- have to change queue types to <>
        }
        if(animal instanceof Dog) {
            dogQ.enqueue(animal);
        }
    }

    public Object dequeue (Object pref) {
        if (pref.equals(Cat.class)) {
            catQ.dequeue();
        } else if (pref.equals(Dog.class)) {
            dogQ.dequeue();
            return null;
        }
        return null;
    }
}
