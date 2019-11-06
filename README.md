Includes Code challenges from Two Code Fellows courses - Code301-d50 course and from Code401-Java-d6. All descriptions of code challenges that follow are from Code401 Java.

### Contributor
Sharina Stubbs

# Sorting Algorithms
Read about the algorithms: [The Blog](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/BLOG.MD)
* [Insertion Sort](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/InsertionSort.java)
* [Merge Sort](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/MergeSort.java)
* [Quick Sort](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/QuickSort.java)

# Data Structures:
* [Reverse Array](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayReverse.java)
* [Array Shift](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayShift.java)
* [Binary Search](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/BinarySearch.java)
* [Linked List](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/linkedlist) 
* [Stacks and Queues](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues)
* [PseudoQueue](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues)
* [Trees](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/tree)
* [Hashtable](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/hashtable)
* [Graphs](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph)

# Miscellaneous
* [Utilities](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/utilities)
  * Animal Shelter
  * MultiBracket Validation
  * FizzBuzzTree

# Array Methods Include:
* [reverseArray()](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayReverse.java)
* [arrayShift](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayShift.java)
* [binarySearch()](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/BinarySearch.java)


## Reverse Array
Write a function called reverseArray that takes an array as an argument and returns an array with elements in reversed order. Avoids any built-in language specific methods.

### Approach & Efficiency
I decided to approach this problem with creating a new array, instead of the other option I had considered, which was to change the array in place. I chose the new array approach since it made the most sense to me initially, however creating a new array would sacrifice memory. 

Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/array-reverse.jpg)

## Array Shift
Whiteboarding done with Ahren Swett. Actual code written solo by Sharina Stubbs.

### Challenge
Write a function called ArrayShift that takes an array and a number. Output is a new array that includes that number added to the middle of the original array. Avoids any built-in language specific methods.

### Approach & Efficiency
I approached this problem by identifying the middle index of the original array, and I made a new array. I iterated through the original array up until the point of the middle index, at which point the input number was added to that middle index location. The iteration continued after the middle index with adding in the rest of the original array elements to the new array. 
Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/array-shift.jpg)


## Binary Search
Whiteboarding done with Jon Veach. Code written by Sharina Stubbs.

### Challenge
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

### Approach & Efficiency
Given the sorted array, my approach was to find the middle of the array, then check to see if the element at the middle matched the key. If it did, then the program simply returned the index of that element. If not, we check if the key is greater than or less than the midpoint, so we can ultimately reset the bounds of array that is searched to either the last half or the first half of the searched array, respectively. We repeat this entire process over and over again using a while loop until either the entire array has been searched, or the key has been found. 
Big 0 time - O(n)
Big 0 space - 0(n)

### Solution
![screenshot of page](code401Challenges/assets/binary-search.jpg)

# Linked List Methods
See the code [here](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/linkedlist).
* insertAtHead()
* toString()
* includes()
* insertAtEnd()
* insertBefore()
* insertAfter()
* runningBackwards()
* mergeLists()

## Linked List
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node. Within the LinkedList class, there is a head property. Upon instantiation, an empty Linked List should be created.

## Linked List Methods
### InsertAtHead()
Adds a value to the linked list at the beginning of the list. More specifically, it takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.

### toString()
Takes the linked list values and outputs them as a string. toString() takes in no arguments and returns a string representing all the values in the Linked List.

### includes()
Checks the values of the linked list for a particular value. Specifically, it takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

### append()
adds a new node with the given value to the end of the list

### insertBefore()
 add a new node with the given newValue immediately before the first value node

### insertAfter()
 add a new node with the given newValue immediately after the first value node

### Whiteboarding of append(), insertBefore() and insertAfter()
![screenshot of page](code401Challenges/assets/linked-list.jpg)

### runningBackwards()
A method for the Linked List class which takes a number, k, as a parameter. The output is the node’s value that is k from the end of the linked list. 

![screenshot of page](code401Challenges/assets/kth-from-end1.jpg)
![screenshot of page](code401Challenges/assets/kth-from-end2.jpg)

### MergeLists()
In place merge of two linked lists that uses a while loop to iterate through the lists. Pointers and temp variable(s) are used to point from node to node, to essentially combine the two lists. This was a pair-programming whiteboarding with Sarah Fisher.

![screenshot of page](code401Challenges/assets/merge-list.jpg)

# Stacks and Queues 
The code is found within the package ["stacksandqueues"](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues), and includes a [node class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues/Node.java), a [queue class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues/Queue.java), a [stack class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues/Stack.java), and a [pseudoqueue class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues/PseudoQueue.java).

Stack Methods:
* push();
* pop();
* peep();
* isEmpty();

Queue Methods:
* enqueue();
* dequeue();
* peep();
* isEmpty();

PseudoQueue Methods:
* enqueue();
* dequeue();
* peep();


## Challenge: Build Stack and QueueClasses
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
![screenshot of page](code401Challenges/assets/queue-with-stacks.jpg)

## Challenge: [Build an Animal Shelter Class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/utilities/AnimalShelter.java)
Challenge description: "Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach. Implement the following methods - enqueue(animal: adds animal to the shelter. animal can be either a dog or a cat object. dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null."

### Whiteboarding:
![screenshot of page](code401Challenges/assets/animal-shelter.jpg)

## Multi-Bracket Validation
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

* Round Brackets : ()
* Square Brackets : []
* Curly Brackets : {}

Examples:
* {}	TRUE
* {}{Code}[Fellows](())	TRUE
* {(})	FALSE
* [({}]	FALSE

### Algorithm
The algorithm I implemented in my code uses a stack to store all open brackets. For each iteration through the string, the potential mate of the bracket stored in the stack is compared to the top of the stack. If there's a match, the bracket in the stack is popped. What should be left is an empty stack. If not, there's an unclaimed bracket in the stack, and so the algorithm returns false.

Big O:
* Time: O(1)  
* Space: O(n) <---- ?

### Whiteboarding
I created an algorithm for this code challenge during my whiteboarding that I decided not to implement. When I started coding, I realized that using a stack would be easier to implement. 
![screenshot of page](code401Challenges/assets/bracket-validation.jpg)

# Trees

## Methods in the [Tree Package](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/tree)
Recursion heavily relied upon for the following classes.
### [Binary Search Tree Class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/tree/BinarySearchTree.java)
* add();
* contains();

### [Binary Tree Class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/tree/Tree.java)
* preOrder();
* inOrder();
* postOrder();
* breadthfirstTraverse();
* findMaxValue();

**BreadthFirstTraverse** is a method in the Binary Tree Class that prints out values of a binary tree. It is implemented using a queue (from this repo's queue class) and a while loop. It takes in a tree, and outputs integers. 
![image of whiteboard](code401Challenges/assets/breadth-first-traverse.jpg)

**FindMaxValue** is an instance method in the Binary Tree Class that returns the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric. There are two variables that keep track of the current highest value, and the highest value found thus far. The method is built using recursion to do a pre-order traversal of the tree.
![image of whiteboard](code401Challenges/assets/find-max-value.jpg)

## [FizzBuzzTree](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/utilities/FizzBuzzTree.java)
FizzBuzzTree class is actually contained within the Utilites Package, however it is built with a tree in mind, therefore it is lumped with Trees.

### Problem Domain:
Write a function called FizzBuzzTree which takes a tree as an argument.
Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

Return the tree with its new values.

### Efficiency for FizzBuzzTree:
* Time complexity: O(n)
* Space complexity: O(1)

### Whiteboarding image:
![image of whiteboard](code401Challenges/assets/fizzbuzz-tree.jpg)

# Hashtables
## The class [hashtable](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/hashtable) includes a variety of methods. 

The following four methods have a Time Complexity of O(1), and a Space Complexity of O(1):

* add()
  * Takes in both the key and value. This method hashes the key, and adds the key and value pair to the table, handling collisions as needed.
* get()
  * Takes in the key and returns the value from the table.
* contains()
  * Takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash()
  * Takes in an arbitrary key and returns an index in the collection.

## Repeated Word
The class [RepeatedWord](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/RepeatedWord.java) checks a lengthy string to find the first word that is repeated. It then repeats that word.

Finding the first word that is repeated is done with my own hashtable class, versus the built in class.

![image of whiteboard](code401Challenges/assets/repeated-word.png)

## TreeIntersection
[TreeIntersection](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/TreeIntersection.java) is a class that contains methods that find common values within two binary trees. Hashmap and Tree are two classes used to solve this coding challenge. 

![image of whiteboard](code401Challenges/assets/tree-intersection.jpg)

## LeftJoin
The class [LeftJoin](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/hashtable/LeftJoin.java) includes a function that LEFT JOINs two hashmaps into a single data structure.
The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
The code combines the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.

Time Complexity: O(n)
Space Complexity: O(n)

Data Structures used in this problem:
* Hashtable (my own class)
* Array
* ArrayList

![image of whiteboard](code401Challenges/assets/left-join.jpg)

# Graphs
The class [Graph](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph) works with the class Node and the class Edge. Graph has the following methods:

* addNode()
* getNodes()
* getNeighbors()
* addEdge()
* getSize()
* breadthFirstTraverse()

### breadthFirstTraverse()
This method takes in a starting node of a graph and traverses through the graph. It returns a set.

Data structures used in the traversal:
* Queue
* HashSet

![image of whiteboard](code401Challenges/assets/graph-breadth-first.jpg)

## Class GetEdge
Code Challenge: Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be? 

This [code challenge](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph) uses the getNeighbors() method in the Graph class, and the fact that the Node class has information about the edges each Node has. The algorithm not only determines the neighbors for a given node, given the getNeighbors() method, but also the weight of the edge between the given node and the next node in the given array to determine the ticket cost. 

![image of whiteboard](code401Challenges/assets/trip-itinerary.jpg)
