package code401Challenges.graph;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

//    @Test
//    public void testAddNode() {
//        Graph<Integer> testGraph = new Graph<>();
//        Integer testInt = 12;
//        Node<Integer> testNode = testGraph.addNode(testInt);
//
//        assertTrue("should be true ",
//                testGraph.nodesInGraph.contains(testNode));
//    }
//
//    @Test
//    public void testGetNodes() {
//        Graph<Integer> testGraph = new Graph<>();
//        Node<Integer> testNode = testGraph.addNode(12);
//
//        HashSet<Node<Integer>> testSet = (HashSet<Node<Integer>>) testGraph.getNodes();
//
//        assertEquals("It should be true that testNode is in the set",
//                true,
//                testSet.contains(testNode));
//    }
//
//    // check for when the graph is empty, one can check status of Set of Nodes
//    @Test
//    public void testGetNodesInSet2() {
//        Graph<Integer> testGraph = new Graph<>();
//        HashSet<Node<Integer>> testSet = (HashSet<Node<Integer>>) testGraph.getNodes();
//
//        assertTrue("It should be that the graph is empty",
//                testSet.isEmpty());
//    }
//
//
//    @Test
//    public void testGetNeighbors() {
//        Graph<Integer> testGraph = new Graph<>();
//        // create test nodes to add to the graph
//        Node<Integer> testNode1 = testGraph.addNode(12);
//        Node<Integer> testNode2 = testGraph.addNode(4);
//
//        // addEdge
//        testGraph.addEdge(testNode1, testNode2, 200);
//
//        // testList has the neighbors of testNode1
//        List<Edge<Integer>> testList = testGraph.getNeighbors(testNode1);
//
//
//        assertEquals("Should be true that testList contains testNode2",
//                true,
//                testList.contains(testNode2));
//    }
//
//
//    @Test
//    public void addEdge() {
//        Graph<Integer> testGraph = new Graph<>();
//
//        Node<Integer> testNode1 = testGraph.addNode(12);
//        Node<Integer> testNode2 = testGraph.addNode(4);
//
//        // adds edge with weight:
//        testGraph.addEdge(testNode1, testNode2, 200);
//
//        // testList holds the neighbors of testNode1
//        List<Edge<Integer>> testList = testGraph.getNeighbors(testNode1);
//
//        // check that testList at index 0 has a weight of 200.
//
//
//    }
//
//    @Test
//    public void testGetSize() {
//        Graph<Integer> testGraph = new Graph<>();
//        testGraph.addNode(12);
//        testGraph.addNode(4);
//        testGraph.addNode(-5);
//        assertEquals("size of graph should be 2",
//                3,
//                testGraph.graphSize());
//    }
//
//    // ======== BreadthFirstTraversal Method Tests =========
//    @Test
//    public void testBreadthFirstTraverse1() {
//        Graph<Integer> testGraph = new Graph<>();
//
//        Node<Integer> testNode1 = testGraph.addNode(12);
//        Node<Integer> testNode2 = testGraph.addNode(4);
//        Node<Integer> testNode3 = testGraph.addNode(49);
//
//        // adds edge with weight:
//        testGraph.addEdge(testNode1, testNode2, 200);
//        testGraph.addEdge(testNode3, testNode1, 300);
//
//        //System.out.println(testGraph.breadthFirstTraverse(testNode1));
//        List<Node<Integer>> testAnswer = testGraph.breadthFirstTraverse(testNode1);
//
//        assertEquals("There should be three things in the graph",
//                3,
//                testAnswer.length());
//    }
//
//    @Test
//    public void testBreadthFirstTraverse2() {
//        Graph<Integer> testGraph = new Graph<>();
//
//        Node<Integer> testNode1 = testGraph.addNode(12);
//        Node<Integer> testNode2 = testGraph.addNode(4);
//
//        // adds edge with weight:
//        testGraph.addEdge(testNode1, testNode2, 200);
//
//        List<Node<Integer>> testAnswer = testGraph.breadthFirstTraverse(testNode1);
//
//        assertEquals("There should be two things in the set",
//                2,
//                testAnswer.size());
//    }

    @Test
    public void testBreadthFirstTraverse() {
        Graph<Integer> testGraph = new Graph<>();

        // add nodes to testGraph
        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(12);
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(4);
        Node<Integer> testNode3 = testGraph.addNodeToSetOfGraphNodes(24);

        // adds edge with weight between nodes in testGraph
        testGraph.addEdge(testNode1, testNode2, 200);
        testGraph.addEdge(testNode2, testNode3, 300);
        testGraph.addEdge(testNode3, testNode1, 300);

        // list of values that should return from a BFT of the testGraph
        List<Integer> expected = new LinkedList<>();
        expected.add(12);
        expected.add(4);
        expected.add(24);

        // actual list of node values that returns from a BFT of testGraph
        List<Integer> testAnswerSet = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("Should return breadth first search of graph",
                expected,
                testAnswerSet
        );
    }
}
