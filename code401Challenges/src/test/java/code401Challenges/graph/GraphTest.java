package code401Challenges.graph;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph<Integer> testGraph = new Graph<>();
        Integer testInt = 12;
        Node<Integer> testNode = testGraph.addNode(testInt);

        assertTrue("should be true ",
                testGraph.nodesInSet.contains(testNode));
    }

    @Test
    public void testGetNodes() {
        Graph<Integer> testGraph = new Graph<>();
        Node<Integer> testNode = testGraph.addNode(12);

        HashSet<Node<Integer>> testSet = testGraph.getNodes();

        assertEquals("It should be true that testNode is in the set",
                true,
                testSet.contains(testNode));
    }

    // check for when the graph is empty, one can check status of Set of Nodes
    @Test
    public void testGetNodesInSet2() {
        Graph<Integer> testGraph = new Graph<>();
        HashSet<Node<Integer>> testSet = testGraph.getNodes();

        assertTrue("It should be that the graph is empty",
                testSet.isEmpty());
    }


    @Test
    public void testGetNeighbors() {
        Graph<Integer> testGraph = new Graph<>();
        // create test nodes to add to the graph
        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);

        // addEdge
        testGraph.addEdge(testNode1, testNode2, 200);

        // testList has the neighbors of testNode1
        HashSet<Node<Integer>> testList = testGraph.getNeighbors(testNode1);


        assertEquals("Should be true that testList contains testNode2",
                true,
                testList.contains(testNode2));
    }


    @Test
    public void addEdge() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);

        // testList holds the neighbors of testNode1
        HashSet<Node<Integer>> testList = testGraph.getNeighbors(testNode1);

        // check that testList at index 0 has a weight of 200.
        assertEquals(200, testList.iterator().next().edges.get(0).weight);

    }

    @Test
    public void testGetSize() {
        Graph<Integer> testGraph = new Graph<>();
        testGraph.addNode(12);
        testGraph.addNode(4);
        testGraph.addNode(-5);
        assertEquals("size of graph should be 2",
                3,
                testGraph.getSize());
    }

    // ======== BreadthFirstTraversal Method Tests =========
    @Test
    public void testBreadthFirstTraverse1() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);
        Node<Integer> testNode3 = testGraph.addNode(49);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);
        testGraph.addEdge(testNode3, testNode1, 300);

        //System.out.println(testGraph.breadthFirstTraverse(testNode1));
        HashSet<Node<Integer>> testAnswerSet = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("There should be three things in the graph",
                3,
                testAnswerSet.size());
    }

    @Test
    public void testBreadthFirstTraverse2() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);

        HashSet<Node<Integer>> testAnswerSet = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("There should be two things in the set",
                2,
                testAnswerSet.size());
    }

    @Test
    public void testBreadthFirstTraverse3() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNode(12);
        Node<Integer> testNode2 = testGraph.addNode(4);
        Node<Integer> testNode3 = testGraph.addNode(12);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);
        testGraph.addEdge(testNode3, testNode1, 300);

        HashSet<Node<Integer>> testAnswerSet = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("testNode1 should be in the collection from the breadth-first-traverse",
                true,
                testAnswerSet.contains(testNode1));
    }
}
