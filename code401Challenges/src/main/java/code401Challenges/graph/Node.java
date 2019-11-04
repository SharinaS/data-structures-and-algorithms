package code401Challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    T value;
    List<Edge<T>> edges;

    // allows for
    public Node (T value) {
        this.value = value;
        this.edges = new LinkedList<>();
    }

    public Node () {
        // instantiate a new list without requiring a value to be inputted
        this.edges = new LinkedList<>();
    }


    // note that add returns a boolean
    public boolean addEdgeToListOfEdges (Node<T> nodeBeingPointedTo, int weight) {
        Edge<T> newEdge = new Edge<>(weight, nodeBeingPointedTo);
        return edges.add(newEdge);
    }
}
