# Graphs
The class [Graph](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph) works with the [class Node](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/graph/Node.java) and the [class Edge](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/graph/Edge.java). 

![image of paper](/code401Challenges/assets/graph-class-connections.jpg)

### The Graph class has the following methods:

* addNode()
* getNodes()
* getNeighbors()
* addEdge()
* getSize()
* breadthFirstTraverse()

### breadthFirstTraverse()
This method takes in a starting node of a graph and traverses through the graph. It returns a set. The code is available [within the Graph class]((https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph))

Data structures used in the traversal:
* Queue
* HashSet

![image of whiteboard](/code401Challenges/assets/graph-breadth-first.jpg)

## Code Challenge: 
Code Challenge: Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be? See the code [here](https://github.com/SharinaS/data-structures-and-algorithms/tree/master/code401Challenges/src/main/java/code401Challenges/graph).

This code challenge uses the getNeighbors() method in the Graph class, and the fact that the Node class has information about the edges each Node has. The algorithm not only determines the neighbors for a given node, given the getNeighbors() method, but also the weight of the edge between the given node and the next node in the given array to determine the ticket cost. 

![image of whiteboard](/code401Challenges/assets/trip-itinerary.jpg)

## Code Challenge: Write a Depth First Traversal Through a Graph
The [class DepthFirst](https://github.com/SharinaS/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/graph/DepthFirst.java) contains a function called depthFirst that accepts an adjacency list as a graph. It calls a helper function that recursively conducts a depth first traversal and returns a collection of nodes in their pre-order depth-first traversal order.

![image of whiteboard](/code401Challenges/assets/depth-first-pre-order.jpg)
