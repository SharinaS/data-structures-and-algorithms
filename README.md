# About 
Includes Code challenges from Two Code Fellows courses - Code301-d50 course and from Code401-Java-d6. All descriptions of code challenges that follow are from Code401 Java.

# Contributor
Sharina Stubbs

# Contents
[Sorting Algorithms](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/sort/README_SORTING.MD)

[Arrays](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ARRAYS.MD)

[Linked Lists](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/linkedlist) 

[Stacks and Queues](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/stacksandqueues/README_STACKSQUEUES.MD)

[Trees and Graphs](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/tree/README_TREE.MD)

[Hashtables](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/hashtable)
 
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

## Class DepthFirst
DepthFirst contains a function called depthFirst that accepts an adjacency list as a graph. It calls a helper function that recursively conducts a depth first traversal and returns a collection of nodes in their pre-order depth-first traversal order.

![image of whiteboard](code401Challenges/assets/depth-first-pre-order.jpg)
