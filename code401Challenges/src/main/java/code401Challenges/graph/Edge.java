package code401Challenges.graph;

// Node points to an edge (which has a weight), which points to another node. This makes life easier because each
// edge only points to one node. This removes the need for conditional logic for traversing.

// Alice --> Edge of 0.8 --> Bob
//    ^                       |
//     \                      |
//     Edge of 0.8   <--------

public class Edge<T> {
    // == Instance Variables ==
    private int weight;
    private Node<T> theNodeTheEdgeIsPointingTo;

    // == Constructors ==
    public Edge (int weight, Node node) {
        this.weight = weight;
        this.theNodeTheEdgeIsPointingTo = node;
    }

    public Edge (Node node) {
        this.theNodeTheEdgeIsPointingTo = node;
        this.weight = weight;
    }

    // == Getters ==
    public int getWeight() {
        return weight;
    }

    public Node<T> getTheNodeTheEdgeIsPointingTo() {
        return theNodeTheEdgeIsPointingTo;
    }
}
