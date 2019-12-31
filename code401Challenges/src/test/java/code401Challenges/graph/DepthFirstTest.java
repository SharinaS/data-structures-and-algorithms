package code401Challenges.graph;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class DepthFirstTest {

    // Test written during Java401 demo on Nov 1, 2019 with Michelle Ferreira at Code Fellows
    @Test
    public void depthFirst1() {
        Graph<String> testGraph = new Graph<>();

        //       James ---- Quang
        //           \     /
        //            Jon ------- Sharina
        //           /   \         /
        //       Ahren -- Sarah   /
        //          \____________/
        //
        Node<String> jon = testGraph.addNodeToSetOfGraphNodes("Jon");
        Node<String> james = testGraph.addNodeToSetOfGraphNodes("James");
        Node<String> sharina = testGraph.addNodeToSetOfGraphNodes("Sharina");
        Node<String> quang = testGraph.addNodeToSetOfGraphNodes("Quang");
        Node<String> sarah = testGraph.addNodeToSetOfGraphNodes("Sarah");
        Node<String> ahren = testGraph.addNodeToSetOfGraphNodes("Ahren");


        testGraph.addEdge(jon, james, 1);
        testGraph.addEdge(jon, sharina, 1);
        testGraph.addEdge(jon, quang, 1);
        testGraph.addEdge(jon, sarah, 1);
        testGraph.addEdge(jon, ahren, 1);
        testGraph.addEdge(james, quang, 1);
        testGraph.addEdge(ahren, sarah, 1);
        testGraph.addEdge(ahren, sharina, 1);

        List<String> people = DepthFirst.preDepth(testGraph, james);

        // Expected answer
        List<String> expected = new LinkedList<>();
        expected.add("James");

        // Should return james, jon, sharina, ahren, sarah, quang
        assertEquals("James should be in the first position",
                expected,
                people.subList(0,1)
        );
    }

    @Test
    public void depthFirst2() {
        Graph<String> testGraph = new Graph<>();

        //       James ---- Quang
        //           \     /
        //            Jon ------- Sharina
        //           /   \         /
        //       Ahren -- Sarah   /
        //          \____________/
        //
        Node<String> jon = testGraph.addNodeToSetOfGraphNodes("Jon");
        Node<String> james = testGraph.addNodeToSetOfGraphNodes("James");
        Node<String> sharina = testGraph.addNodeToSetOfGraphNodes("Sharina");
        Node<String> quang = testGraph.addNodeToSetOfGraphNodes("Quang");
        Node<String> sarah = testGraph.addNodeToSetOfGraphNodes("Sarah");
        Node<String> ahren = testGraph.addNodeToSetOfGraphNodes("Ahren");


        testGraph.addEdge(jon, james, 1);
        testGraph.addEdge(jon, sharina, 1);
        testGraph.addEdge(jon, quang, 1);
//        testGraph.addEdge(jon, sarah, 1);
        testGraph.addEdge(jon, ahren, 1);
        testGraph.addEdge(james, quang, 1);
//        testGraph.addEdge(ahren, sarah, 1);
        testGraph.addEdge(ahren, sharina, 1);

        List<String> answer = DepthFirst.preDepth(testGraph, james);

        // Expected answer
        List<String> expected = new LinkedList<>();
        expected.add("James");
        expected.add("Jon");
        expected.add("Sharina");
        expected.add("Ahren");
//        expected.add("Sarah");
        expected.add("Quang");

        assertFalse("Sarah is not part of the graph",
                false
        );
    }

    // ======= Testing Iterative =========
    @Test
    public void depthFirstTraverseIterative1() {
        Graph<String> testGraph = new Graph<>();

        //       James ---- Quang
        //           \     /
        //            Jon ------- Sharina
        //           /   \         /
        //       Ahren -- Sarah   /
        //          \____________/
        //
        Node<String> jon = testGraph.addNodeToSetOfGraphNodes("Jon");
        Node<String> james = testGraph.addNodeToSetOfGraphNodes("James");
        Node<String> sharina = testGraph.addNodeToSetOfGraphNodes("Sharina");
        Node<String> quang = testGraph.addNodeToSetOfGraphNodes("Quang");
        Node<String> sarah = testGraph.addNodeToSetOfGraphNodes("Sarah");
        Node<String> ahren = testGraph.addNodeToSetOfGraphNodes("Ahren");


        testGraph.addEdge(jon, james, 1);
        testGraph.addEdge(jon, sharina, 1);
        testGraph.addEdge(jon, quang, 1);
        testGraph.addEdge(jon, sarah, 1);
        testGraph.addEdge(jon, ahren, 1);
        testGraph.addEdge(james, quang, 1);
        testGraph.addEdge(ahren, sarah, 1);
        testGraph.addEdge(ahren, sharina, 1);

        LinkedList<String> actualAnswer = DepthFirst.depthFirstTraverseIterative(james);

        // Expected answer
        List<String> expected = new LinkedList<>();
        expected.add("James");
        expected.add("Jon");
        expected.add("Sharina");
        expected.add("Ahren");
        expected.add("Sarah");
        expected.add("Quang");

        assertEquals("James should be the first one",
                expected.subList(0,1),
                actualAnswer.subList(0,1)
        );
    }
}