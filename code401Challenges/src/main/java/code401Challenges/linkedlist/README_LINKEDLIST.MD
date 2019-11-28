# Linked List Node Class
My [Node class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/linkedlist/Node.java) has properties for the value stored in the Node, and a pointer to the next Node. 

# Linked List Class 
### About
Within the LinkedList class, there is a head property. Upon instantiation, an empty Linked List should be created.

### The Code
Check out my [Linked List class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/linkedlist/LinkedList.java) to see the following methods in Java.

## Methods within the Linked List Class

### insertAtHead()
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
![screenshot of page](/code401Challenges/assets/linked-list.jpg)

## Code Challenges with Linked Lists
### runningBackwards

[runningBackwards()](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/linkedlist/LinkedList.java) takes a number, k, as a parameter. The output is the node’s value that is k from the end of the linked list. 

![screenshot of whiteboard](/code401Challenges/assets/kth-from-end1.jpg)
![screenshot of whiteboard](/code401Challenges/assets/kth-from-end2.jpg)

### Merge Two Linked Lists
In place merge of two linked lists that uses a while loop to iterate through the lists. See the code [here](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/linkedlist/LinkedList.java). Pointers and temp variable(s) are used to point from node to node, to essentially combine the two lists. This was a pair-programming whiteboarding with Sarah Fisher.

![screenshot of whiteboard](/code401Challenges/assets/merge-list.jpg)

### Clone a Linked List with Random Pointers
Problem Domain: Clone a linked list that not only has the usual pointers to the next nodes, but also random pointers to various other nodes. There are no cycles within the linked list. 

Code only available within the whiteboard image below.
![screenshot of whiteboard](/code401Challenges/assets/clone_linked_list_random_pointers.jpg)
