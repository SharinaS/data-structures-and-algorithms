package code401Challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void addEdgeToListOfEdges() {
        Graph<Integer> testGraph = new Graph<>();
        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);

//        testGraph.addEdge(testNode1, testNode2, 200);
    }
}