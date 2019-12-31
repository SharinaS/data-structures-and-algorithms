package code401Challenges.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DepthFirst<T> {

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


    // === Iterative Solution ===
    public static <T> LinkedList<T> depthFirstTraverseIterative(Node<T> startingNode) {
        LinkedList<Node<T>> stackOfNodesToProcess = new LinkedList<>();
        HashSet<Node<T>> seen = new HashSet<>();
        LinkedList<T> answerList = new LinkedList<>();
        Graph<T> graph = new Graph<>();

        // add starting node to the stack
        stackOfNodesToProcess.push(startingNode);

        // iterate only while the stack is not empty
        while(!stackOfNodesToProcess.isEmpty()) {
            Node<T> currentNode = stackOfNodesToProcess.pop();

            // process if not seen (this is an essential if-statement when method serves to add node value to a list)
            if(!seen.contains(currentNode)) {
                seen.add(currentNode);
                answerList.add(currentNode.getValue());
            }

            // get the current node's neighboring nodes
            HashSet<Node<T>> setOfNeighborNodes = graph.getNeighborNodes(currentNode);

            // check the set of neighboring nodes and add any thus far unseen neighbors to the stack to process
            for (Node<T> neighbor : setOfNeighborNodes) {
                if (!seen.contains(neighbor)) {
                    stackOfNodesToProcess.push(neighbor);
                }
            }
        }
        return answerList;
    }
}
