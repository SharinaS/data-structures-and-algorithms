package code401Challenges.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    // Can properly insert into the linked list at the head
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

    // Test inserting value to end of linkedlist
    @Test
    public void testInsertAtEnd () {
        LinkedList testList = new LinkedList();

        testList.insertAtEnd(99);
        testList.insertAtEnd(4);

        assertEquals(
                "Should expect 99",
                99,
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

    // Test if method insertBefore() works appropriately
    @Test
    public void testInsertBefore() {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        testList.insertAtHead(45);
        testList.insertAtHead(3);
        testList.insertBefore(45, 100);

        assertEquals(
                "Should expect 100",
                100,
                testList.head.next.value
        );

    }

    // Test if method insertBefore() works appropriately
    @Test
    public void testInsertAfter() {
        LinkedList testList = new LinkedList();

        testList.insertAtHead(4);
        testList.insertAtHead(45);
        testList.insertAtHead(3);
        testList.insertAfter(45, 100);

        assertEquals(
                "Should expect 100",
                100,
                testList.head.next.next.value
        );

    }
}

/*
Write more tests
1. Check before head
2. Check what happens when inserting into an empty list
 */