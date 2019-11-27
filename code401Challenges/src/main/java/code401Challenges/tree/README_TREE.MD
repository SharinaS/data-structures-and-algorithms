# Trees and Graphs
Descriptions and links to my Java code involving trees and graphs. 

## Go Directly to the Code
* [Trees](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/tree)
  * [Binary Search Tree Class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/tree/BinarySearchTree.java)
  * [Binary Tree Class](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/tree/Tree.java)
   * [FizzBuzzTree]((https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/utilities))
* [Graphs](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph)

## Methods
Binary Search Tree Class
* add();
* contains();

Binary Tree Class
* preOrder();
* inOrder();
* postOrder();
* breadthFirstTraverse();
* findMaxValue();

### Breadth First Traverse
breadthFirstTraverse() is a method in the Binary Tree Class that prints out values of a binary tree. It is implemented using a queue (from this repo's queue class) and a while loop. It takes in a tree, and outputs integers. 
![image of whiteboard](/code401Challenges/assets/breadth-first-traverse.jpg)

### Find Max Value
findMaxValue() is an instance method in the Binary Tree Class that returns the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric. There are two variables that keep track of the current highest value, and the highest value found thus far. The method is built using recursion to do a pre-order traversal of the tree.
![image of whiteboard](/code401Challenges/assets/find-max-value.jpg)

# Code Challenges
## FizzBuzz Tree
[FizzBuzzTree](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/utilities/FizzBuzzTree.java) class is actually contained within the Utilites Package, however it is built with a tree in mind, therefore it is lumped with Trees.

### Problem Domain
Write a function called FizzBuzzTree which takes a tree as an argument.
Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

Return the tree with its new values.

### Efficiency for FizzBuzzTree
* Time complexity: O(n)
* Space complexity: O(1)

### Whiteboarding image
![image of whiteboard](/code401Challenges/assets/fizzbuzz-tree.jpg)
