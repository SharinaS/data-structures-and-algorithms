package code401Challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    // instance variables
    private T value;
    private List<Edge<T>> listOfNeighborsEachWithWeightAndNode;

    // constructors
    public Node (T value) {
        this.value = value;
        this.listOfNeighborsEachWithWeightAndNode = new LinkedList<>();
    }

    public Node () {
        // instantiate a new list without requiring a value to be inputted
        this.listOfNeighborsEachWithWeightAndNode = new LinkedList<>();
    }

    public boolean addEdgeToListOfEdges(Node<T> nodeTheEdgePointsTo, int weight) {
        Edge<T> newEdge = new Edge<>(weight, nodeTheEdgePointsTo);
        return this.listOfNeighborsEachWithWeightAndNode.add(newEdge);
    }



//    // Added method thanks to Quang Nguyen
//    public void addNeighbor(Edge<T> neighbor) {
//        this.listOfNeighborsWithWeightAndNode.add(neighbor);
//    }
//
//    // === Getters ===
    public T getValue() {
        return value;
    }

    public List<Edge<T>> getListOfNeighborsEachWithWeightAndNode() {
        return listOfNeighborsEachWithWeightAndNode;
    }
}
