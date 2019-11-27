# All About Stacks and Queues
This is my code (in Java) to tackle various code challenges involving stacks and queues.

Jump to the Code: 
* [Stack and Queue Classes](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues)
* [PseudoQueue Class](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues)
* [Animal Shelter](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/utilities/AnimalShelter.java)

### Stack Methods:
* push();
* pop();
* peep();
* isEmpty();

### Queue Methods:
* enqueue();
* dequeue();
* peep();
* isEmpty();

### PseudoQueue Methods:
* enqueue();
* dequeue();
* peep();


## Challenge: Build Stack and Queue Classes
Create methods for stack and queue classes that remove and add data to the stack or list:

### Stack:
From the challenge description: "This object should be aware of a default empty value assigned to top when the stack is created. Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance. Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value. Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack."

* Push is O(1) time performance
* Pop is O(1) time performance

### Queue:
From the challenge description: "This object should be aware of a default empty value assigned to front when the queue is created. Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance. Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value. Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue."

* Enqueue is O(1) time performance
* Dequeue is O(1) time performance

## Challenge: Build a PseudoCode Class
From the challenge descriptions: "... this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects."

### Implementation
To enqueue, one can push a value directly to stack1. To dequeue, the stack must be reversed, so a second stack is used to do this. Once the stack is reversed, the top item is popped, thus returning the item. 
* O(1) time to enqueue a value
* O(n) time to dequeue a value

### Algorithm and pseudocode
![screenshot of page](/code401Challenges/assets/queue-with-stacks.jpg)

## Challenge: Build An Animal Shelter
Challenge description: "Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach. Implement the following methods - enqueue(animal: adds animal to the shelter. animal can be either a dog or a cat object. dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null."

### Whiteboarding:
![screenshot of page](/code401Challenges/assets/animal-shelter.jpg)