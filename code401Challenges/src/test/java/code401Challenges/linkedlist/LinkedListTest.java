package code401Challenges.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    /*
    NOTES TO CONSIDER:
    write a method that run before the tests. No test should rely on the test before. It should be able to be run in
    whatever order and still produce that same test output.
    within test, the test within assertEquals will reference the instance variable called testList.

    EXAMPLE:
    LinkedList testList;
    @Before
    public void setup() {
        testList = new LinkedList();
        testList.insertAtHead(55);
        testList.insertAtHead(44);
    }

    */

    // Can properly insert into the linked list
    @Test
    public void testInsertAfterHead() {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        assertEquals(
                "Should expect 4",
                4,
                testList.head.value
                );
    }

    // Test if the head property will properly point to the first node in the linked list
    @Test
    public void testHeadPoints() {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(55);
        testList.insertAtHead(44);

        assertEquals(
                "Expected 44, which is the value of the first node",
                44,
                testList.head.value
                );
    }

    // Test if a node can be inserted into the Linked List after the head is inserted.
    @Test
    public void testCheckSecondNode() {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(55);
        testList.insertAtHead(44);

        assertEquals(
                "Expected 55, which is the second node in the list",
                55,
                testList.head.next.value
        );
    }

    // Can properly insert multiple nodes into the linked list and returns linked list as a string
    @Test
    public void testToString () {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        testList.insertAtHead(45);
        testList.insertAtHead(3);

        assertEquals(
                "Expected a return statement that is a string of 3, 45, 4",
                "3, 45, 4",
                testList.toString()
        );
    }

    // Check if item exists and returns true when it exists
    @Test
    public void testIfExists () {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        testList.insertAtHead(45);
        testList.insertAtHead(3);

        assertEquals(
                "Expected a boolean of true",
                true,
                testList.includes(45)
        );
    }

    // Check if item exists and returns false when it does not exist
    @Test
    public void testIfNotExists () {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        testList.insertAtHead(45);
        testList.insertAtHead(3);

        assertEquals(
                "Expected a boolean of false",
                false,
                testList.includes(99)
        );
    }

    // Can successfully instantiate an empty linked list
    @Test
    public void testListInstantiation () {
        LinkedList testList = new LinkedList();

        assertNull(
                "Linked List is instantiated",
                testList.head
        );
    }
}

/*
OTHER TESTS TO WRITE:
    1. Check toString() with an empty linked lit, and a list with one element

ANNOTATIONS
Annotations (@test) give extra info (metadata to things like JUnit. Can annotate classes, methods, variables within a class.
Can have multiple annotations on something.
 */



