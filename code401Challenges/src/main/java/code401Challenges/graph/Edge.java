package code401Challenges.graph;

public class Edge<T> {
    int weight;
    Node<T> nodeEdgeIsPointingTo;

    public Edge (int weight, Node<T> node) { // takes in the weight and the node it's pointing to
        this.weight = weight;
        this.nodeEdgeIsPointingTo = node;
    }
}
