package code401Challenges.graph;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {
    // == Instance Variable ==
    HashSet<Node<T>> nodesInGraph;

    // == Constructor ==
    public Graph () {
        this.nodesInGraph = new HashSet<>() {
        };
    }

    // == Methods ==
    // Adds a new node to the graph
    // Takes in the value of a node
    // Returns the added node
    public Node<T> addNodeToSetOfGraphNodes(T value) {
        // construct a new node and tell it to take in the value inputted.
        Node<T> newNode = new Node<>(value);
        this.nodesInGraph.add(newNode);
        return newNode;
    }

    // Adds a new edge between two nodes in the graph
    // Includes the ability to have a “weight”
    // Takes in the two nodes to be connected by the edge
    // Both nodes should already be in the Graph.
    public void addEdge(Node<T> node1, Node<T> node2, int weight) {
        if(this.nodesInGraph.contains(node1) && this.nodesInGraph.contains(node2)) {
            node1.addEdgeToListOfEdges(node2, weight);
            node2.addEdgeToListOfEdges(node1, weight);
        }
    }

    // returns all of the nodes in the graph as a collection
    public HashSet<Node<T>> getNodes() {
        // TODO add in code to account for empty graph, such as: if (size() == 0) {return null;}
        return nodesInGraph;
    }

    // Returns a collection of nodes connected to the given node
    // Includes the weight of the connection in the returned collection
    // Uses the Node class's set of neighboring edges with their nodes.
    public HashSet<Node<T>> getNeighborNodes(Node<T> node) {
        HashSet<Node<T>> setOfNeighborNodes = new HashSet<>();
        // iterate over neighbors and put just the nodes in a set
        for(Edge<T> neighborNode : node.getListOfNeighborsEachWithWeightAndNode()) {
            if(!setOfNeighborNodes.contains(neighborNode.getTheNodeTheEdgeIsPointingTo())) {
                setOfNeighborNodes.add(neighborNode.getTheNodeTheEdgeIsPointingTo());
            }
        }
        return setOfNeighborNodes;
    }


    // Returns the total number of nodes in the graph
    public int graphSize() {
        return this.nodesInGraph.size();
    }


    // ======= Breadth First Traverse through Graph ======
    // Explore neighbors before children in a BFS.
    // BFT explores level-by-level
    // Basic algorithm: Pop the first node from the queue. Check if the node has been visited already.
    // Add the node's children to the end of the queue. Repeat while
    // the queue still contains one or more nodes.

    // The following method is more my ideal set-up, with a list, however testing is difficult when a list of values
    // is outputted, given BFT will variably order the neighbors to be processed, may lead to a different output
    // order within each level each time.

    //TODO: Add tests for BFT that target which nodes should be traversed earlier versus later, given their degrees of
    // separation from the starting node.
    public List<T> BFT(Node<T> startingNode) {
        LinkedList<Node<T>> queueOfNodesToProcess = new LinkedList<>();
        HashSet<Node<T>> seen = new HashSet<>();
        List<T> answerList = new LinkedList<>();

        // add starting node to the queue
        queueOfNodesToProcess.add(startingNode);

        // iterate only while the queue is not empty
        while(!queueOfNodesToProcess.isEmpty()) {
            Node<T> currentNode = queueOfNodesToProcess.removeFirst();

            // process if not seen (this is an essential if-statement when method serves to add node value to a list)
            if(!seen.contains(currentNode)) {
                seen.add(currentNode);
                answerList.add(currentNode.getValue());
            }

            // get the current node's neighboring nodes
            HashSet<Node<T>> setOfNeighborNodes = getNeighborNodes(currentNode);

            // check the set of neighboring nodes and add any thus far unseen neighbors to the queue to process
            for (Node<T> neighbor : setOfNeighborNodes) {
                if (!seen.contains(neighbor)) {
                    queueOfNodesToProcess.add(neighbor);
                }
            }
        }
        return answerList;
    }

    // == The following method is purely for testing, since the above method with an output of a list made for
    // variable order of nodes added to the collection, given a breadth first search can change it's order of nodes
    // outputted in the level it's working on.
    public HashSet<T> breadthFirstTraverse(Node<T> startingNode) {
        LinkedList<Node<T>> queueOfNodesToProcess = new LinkedList<>();
        HashSet<Node<T>> seen = new HashSet<>();
        HashSet<T> answerList = new HashSet<>();

        // add starting node to the queue
        queueOfNodesToProcess.add(startingNode);

        // iterate only while the queue is not empty
        while(!queueOfNodesToProcess.isEmpty()) {
            Node<T> currentNode = queueOfNodesToProcess.removeFirst();

            // process if not seen (this is an essential if-statement when method serves to add node value to a list)
            if(!seen.contains(currentNode)) {
                seen.add(currentNode);
                answerList.add(currentNode.getValue());
            }

            // get the current node's neighboring nodes
            HashSet<Node<T>> setOfNeighborNodes = getNeighborNodes(currentNode);

            // check the set of neighboring nodes and add any thus far unseen neighbors to the queue to process
            for (Node<T> neighbor : setOfNeighborNodes) {
                if (!seen.contains(neighbor)) {
                    queueOfNodesToProcess.add(neighbor);
                }
            }
        }
        return answerList;
    }
}
