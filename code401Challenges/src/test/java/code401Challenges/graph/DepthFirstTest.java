//package code401Challenges.graph;
//
//import com.google.common.collect.Lists;
//import org.junit.Test;
//
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class DepthFirstTest {
//
//    @Test
//    public void depthFirst() {
//        Graph<String> testGraph = new Graph<>();
//
//        //       James ---- Quang
//        //           \     /
//        //            Jon ------- Sharina
//        //           /   \         /
//        //       Ahren -- Sarah   /
//        //          \____________/
//        //
//        Node<String> jon = testGraph.addNode("Jon");
//        Node<String> james = testGraph.addNode("James");
//        Node<String> sharina = testGraph.addNode("Sharina");
//        Node<String> quang = testGraph.addNode("Quang");
//        Node<String> sarah = testGraph.addNode("Sarah");
//        Node<String> ahren = testGraph.addNode("Ahren");
//
//
//        testGraph.addEdge(jon, james, 1);
//        testGraph.addEdge(jon, sharina, 1);
//        testGraph.addEdge(jon, quang, 1);
//        testGraph.addEdge(jon, sarah, 1);
//        testGraph.addEdge(jon, ahren, 1);
//        testGraph.addEdge(james, quang, 1);
//        testGraph.addEdge(ahren, sarah, 1);
//        testGraph.addEdge(ahren, sharina, 1);
//
//        List<String> people = DepthFirst.preDepth(testGraph, james);
//        List<String> expected = new LinkedList<>();
//        expected.add("James");
//        expected.add("Jon");
//        expected.add("Sharina");
//        expected.add("Ahren");
//        expected.add("Sarah");
//        expected.add("Quang");
//        // Should return james, jon, sharina, ahren, sarah, quang
//        assertEquals("should come back in depth first order",
//                expected,
//                people);
//    }
//}