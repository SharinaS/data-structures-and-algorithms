package code401Challenges.graph;

import java.util.Set;

public class Graph<T> {
    Set<Node<T>> nodes;
    public Node <T> root;

    public Graph(Node<T> root) {
        this.root = root;
    }

}
