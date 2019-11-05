package code401Challenges.graph;

import code401Challenges.stacksandqueues.Queue;

import java.util.HashSet;
import java.util.LinkedList;

public class Graph<T> {
    HashSet<Node<T>> nodesInSet;

    // constructor
    public Graph () {
        this.nodesInSet = new HashSet<>() {
        };
    }


    // addNode() Adds a new node to the graph, Takes in the value of that node, Returns the added node
    public Node<T> addNode(T value) {
        Node<T> node = new Node<>(value); // constructs the node and tells it to take in the value
        nodesInSet.add(node);
        return node;
    }

    // getNodes() returns all of the nodes in the graph as a collection (set, list, or similar)
    public HashSet<Node<T>> getNodes() {
        return nodesInSet;
    }

    // getNeighbors() returns a collection of nodes connected to the given node, Takes in a given node,
    // Include the weight of the connection in the returned collection
    public HashSet<Node<T>> getNeighbors (Node<T> node) {
        // iterate through and return a unque list of nodes
        HashSet<Node<T>> neighbors = new HashSet<>();
        // iterate over neighbors
        for(Edge<T> potentialNeighbor : node.edges) {
            if(!neighbors.contains(potentialNeighbor.nodeEdgeIsPointingTo.value)) {
                neighbors.add(potentialNeighbor.nodeEdgeIsPointingTo);
            }
        }
        return neighbors;
    }

    // addEdge() Adds a new edge between two nodes in the graph, Includes the ability to have a “weight”,
    // Takes in the two nodes to be connected by the edge, Both nodes should already be in the Graph.
    public void addEdge(Node<T> node1, Node<T> node2, int weight) {
        if(nodesInSet.contains(node1) && nodesInSet.contains(node2)) {
            node1.addEdgeToListOfEdges(node2, weight);
            node2.addEdgeToListOfEdges(node1, weight);
        }
    }

    // getSize() Returns the total number of nodes in the graph
    public int getSize() {
        return nodesInSet.size();
    }


    // breadthFirstTraverse through graph
    public HashSet<Node<T>> breadthFirstTraverse(Node<T> node) {
        LinkedList<Node<T>> nodesToProcess = new LinkedList<>(); // will use as a queue
        HashSet<Node<T>> seen = new HashSet<>();

        nodesToProcess.add(node);

        while(!nodesToProcess.isEmpty()) {
            Node current = nodesToProcess.removeFirst();
            seen.add(current);

            HashSet neighbors = getNeighbors(current);
            for( Object neighbor : neighbors) {  // <---------- why is it requiring an object, versus a Node?
                if (!seen.contains(neighbor)) {
                    nodesToProcess.add((Node<T>) neighbor);
                }
            }
        }
        return seen;
    }
}
