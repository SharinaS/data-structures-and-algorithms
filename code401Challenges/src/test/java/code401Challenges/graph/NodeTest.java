package code401Challenges.graph;

import org.junit.Test;

public class NodeTest {

    @Test
    public void addEdgeToListOfEdges() {
        Graph<Integer> testGraph = new Graph<>();
        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(12);
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(4);

//        testGraph.addEdge(testNode1, testNode2, 200);
    }
}