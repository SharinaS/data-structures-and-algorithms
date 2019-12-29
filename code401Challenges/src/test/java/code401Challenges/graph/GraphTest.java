package code401Challenges.graph;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph<Integer> testGraph = new Graph<>();
        Integer testInt = 12;
        Node<Integer> testNode = testGraph.addNodeToSetOfGraphNodes(testInt);

        assertTrue("should be true ",
                testGraph.nodesInGraph.contains(testNode));
    }

    @Test
    public void testGetNodes() {
        Graph<Integer> testGraph = new Graph<>();
        Node<Integer> testNode = testGraph.addNodeToSetOfGraphNodes(12);

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
        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(12);
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(4);

        // addEdge
        testGraph.addEdge(testNode1, testNode2, 200);

        // testList has the neighbors of testNode1
        HashSet<Node<Integer>> testList = testGraph.getNeighborNodes(testNode1);


        assertEquals("Should be true that testList contains testNode2",
                true,
                testList.contains(testNode2));
    }


    @Test
    public void testGetSize() {
        Graph<Integer> testGraph = new Graph<>();
        testGraph.addNodeToSetOfGraphNodes(12);
        testGraph.addNodeToSetOfGraphNodes(4);
        testGraph.addNodeToSetOfGraphNodes(-5);
        assertEquals("size of graph should be 3",
                3,
                testGraph.graphSize());
    }

    // ======== BreadthFirstTraversal Method Tests =========
    @Test
    public void testBreadthFirstTraverse1() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(12);
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(4);
        Node<Integer> testNode3 = testGraph.addNodeToSetOfGraphNodes(49);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);
        testGraph.addEdge(testNode3, testNode1, 300);

        //System.out.println(testGraph.breadthFirstTraverse(testNode1));
        //List<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);
        HashSet<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("There should be three things in the graph",
                3,
                testAnswer.size());
    }

    @Test
    public void testBreadthFirstTraverse2() {
        Graph<Integer> testGraph = new Graph<>();

        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(12);
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(4);

        // adds edge with weight:
        testGraph.addEdge(testNode1, testNode2, 200);

        //List<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);
        HashSet<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("There should be two things in the set",
                true,
                testAnswer.contains(12));
    }

    @Test
    public void testBreadthFirstTraverse3() {
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
        //List<Integer> expected = new LinkedList<>();
        HashSet<Integer> expected = new HashSet<>();
        expected.add(12);
        expected.add(4);
        expected.add(24);

        // actual list of node values that returns from a BFT of testGraph
        //List<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);
        HashSet<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("Should return breadth first search of graph",
                expected,
                testAnswer
        );
    }

    @Test
    public void testBreadthFirstTraverse4() {
        Graph<Integer> testGraph = new Graph<>();

        // == add nodes to testGraph
        // level 0
        Node<Integer> testNode1 = testGraph.addNodeToSetOfGraphNodes(1);

        // level 1
        Node<Integer> testNode2 = testGraph.addNodeToSetOfGraphNodes(2);
        Node<Integer> testNode3 = testGraph.addNodeToSetOfGraphNodes(3);
        Node<Integer> testNode4 = testGraph.addNodeToSetOfGraphNodes(4);
        Node<Integer> testNode5 = testGraph.addNodeToSetOfGraphNodes(5);

        // level 2
        Node<Integer> testNode6 = testGraph.addNodeToSetOfGraphNodes(6);
        Node<Integer> testNode7 = testGraph.addNodeToSetOfGraphNodes(7);
        Node<Integer> testNode8 = testGraph.addNodeToSetOfGraphNodes(8);

        // == adds edge with weight between nodes in testGraph
        testGraph.addEdge(testNode1, testNode2, 1);
        testGraph.addEdge(testNode1, testNode3, 1);
        testGraph.addEdge(testNode1, testNode4, 1);
        testGraph.addEdge(testNode1, testNode5, 1);
        testGraph.addEdge(testNode2, testNode3, 1);
        testGraph.addEdge(testNode2, testNode8, 1);
        testGraph.addEdge(testNode3, testNode4, 1);
        testGraph.addEdge(testNode4, testNode5, 1);
        testGraph.addEdge(testNode4, testNode7, 1);
        testGraph.addEdge(testNode5, testNode6, 1);
        testGraph.addEdge(testNode6, testNode7, 1);
        testGraph.addEdge(testNode6, testNode8, 1);

        // == list of values that should return from a BFT of the testGraph
        //List<Integer> expected = new LinkedList<>();
        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        expected.add(7);
        expected.add(6);

        // == actual list of node values that returns from a BFT of testGraph
        //List<Integer> testAnswer= testGraph.breadthFirstTraverse(testNode1);
        HashSet<Integer> testAnswer = testGraph.breadthFirstTraverse(testNode1);

        assertEquals("Should return breadth first search of graph, where level 1 values " +
                        "are processed before level 2",
                expected,
                testAnswer
        );
    }
}
