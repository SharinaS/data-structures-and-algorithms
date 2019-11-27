package code401Challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void depthFirst() {
        Graph<String> testGraph = new Graph<>();
        Node<String> jon = testGraph.addNode("Jon");
        Node<String> james = testGraph.addNode("James");
        Node<String> sarah = testGraph.addNode("Sarah");
        Node<String> quang = testGraph.addNode("Quang");
        Node<String> ahren = testGraph.addNode("Ahren");
        Node<String> sharina = testGraph.addNode("Sharina");

        testGraph.addEdge(jon, james, 1);
        testGraph.addEdge(jon, sharina, 1);
        testGraph.addEdge(jon, quang, 1);
        testGraph.addEdge(jon, sarah, 1);
        testGraph.addEdge(jon, ahren, 1);
    }
}