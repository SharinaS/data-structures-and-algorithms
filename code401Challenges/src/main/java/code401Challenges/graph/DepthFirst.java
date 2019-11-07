package code401Challenges.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DepthFirst {
    Graph graph = new Graph();
    Node<String> node;

    // what determines the starting node?

    public List<String> depthFirst (Graph graph) {
        List<String> depthFirstAnsw = new LinkedList<>();
        HashSet<String> checker = new HashSet<>();
        depthFirstHelper (graph, depthFirstAnsw, checker);
        return depthFirstAnsw;
    }

    private List<String> depthFirstHelper (Graph graph,
                                           List<String> answer,
                                           HashSet<String> checker
                                           ) {
        return answer;

    }

}
