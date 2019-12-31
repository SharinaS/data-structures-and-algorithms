package code401Challenges.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DepthFirst {

    // == Recursive Solution ==
    public static <T> List<T> preDepth(Graph<T> graph, Node<T> startingNode) {
        // Make a set to keep track of what's been seen in the graph
        Set<Node<T>> seen = new HashSet<>();
        // Make a list to hold the values in the graph
        List<T> answer = new LinkedList<>();
        // Return the output of the private method
        return preDepth(graph, startingNode, seen, answer);
    }

    // keep track of what we've seen so far in a method, then pass that down to a helper method that takes that in
    // as a param.
    // preorder depth-first means you add the value first.
    private static <T> List<T> preDepth(Graph<T> graph, Node<T> node, Set<Node<T>> seen, List<T> values) {
        if (node != null) {
            // seen needs to add the node and check to see if it was already there, in which case, the node also needs
            // to be added to values.
            if (seen.add(node)) {
                // here is the preorder part:
                values.add(node.getValue());
                // For each of the neighboring nodes, run the depth-first traversal on them.
                HashSet<Node<T>> neighbors = graph.getNeighborNodes(node);

                for (Node<T> neighbor : neighbors) {
                    preDepth(graph, neighbor, seen, values);
                }

            }
        }
        return values;
    }
}
