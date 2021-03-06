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

    @Test
    public void testInsertAtEnd2 () {
        LinkedList testList = new LinkedList();

        testList.insertAtEnd(99);
        testList.insertAtEnd(4);
        testList.insertAtEnd(45);

        assertEquals(
                "Should expect 4 at the end of the list",
                45,
                testList.head.next.next.value
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

    // check if method to find kth from the end returns 30 if k is 3 - 'happy path.'
    @Test
    public void testRunningBackwards() {
        LinkedList testList = new LinkedList();
        testList.insertAtHead(50);
        testList.insertAtHead(10);
        testList.insertAtHead(30);
        testList.insertAtHead(60);
        testList.insertAtHead(40);

        assertEquals(
                "should expect 30",
                30,
                testList.runningBackwards(3)
        );
    }

    // check where k and the length of the list are the same
    @Test
    public void testRunningBackwards2() {
        LinkedList testList = new LinkedList();
        testList.insertAtHead(50);
        testList.insertAtHead(10);
        testList.insertAtHead(30);
        testList.insertAtHead(60);
        testList.insertAtHead(40);

        assertEquals(
                "should expect 40",
                40,
                testList.runningBackwards(5));
    }

    // test where k is not positive - test has exception
    @Test(expected = IllegalArgumentException.class)
    public void testRunningBackwards3() {
        LinkedList testList = new LinkedList();
        testList.insertAtHead(50);
        testList.insertAtHead(10);
        testList.insertAtHead(30);
        testList.insertAtHead(60);

        testList.runningBackwards(-1);
    }

    // test where k is greater than the list length - test has exception
    @Test(expected = IllegalArgumentException.class)
    public void testRunningBackwards4() {
        LinkedList testList = new LinkedList();
        testList.insertAtHead(50);
        testList.insertAtHead(30);
        testList.insertAtHead(60);

        testList.runningBackwards(9);
    }

    // ========== A Few Methods to Merge Linked Lists, Alternating Nodes  =========
    // Tests the Method: mergeAlternatingNodes()
    @Test
    public void testAlternatingLinkedList1() {

        LinkedList testListOne = new LinkedList();
        LinkedList testListTwo = new LinkedList();
        // list one
        testListOne.insertAtHead(3);
        testListOne.insertAtHead(2);
        testListOne.insertAtHead(1);
        // list two
        testListTwo.insertAtHead(0);
        testListTwo.insertAtHead(300);
        testListTwo.insertAtHead(200);
        testListTwo.insertAtHead(100);

        LinkedList.mergeAlternatingNodes(testListOne, testListTwo);

        assertEquals("should get 100 1 200 2 300 3 0",
                "100, 1, 200, 2, 300, 3, 0",
                testListTwo.toString());
        assertEquals("Third element of list should be 200",
                200,
                testListTwo.head.next.next.value);
        assertEquals("First element of list should be 100",
                100,
                testListTwo.head.value);
        assertEquals("Fourth element of list should be 2",
                2,
                testListTwo.head.next.next.next.value);
    }


    // Tests the method: mergeLinkedLists()
    @Test
    public void testMergeLinkedLists1() {
        LinkedList testListOne = new LinkedList();
        LinkedList testListTwo = new LinkedList();
        // list one
        testListOne.insertAtHead(2);
        testListOne.insertAtHead(3);
        testListOne.insertAtHead(1);
        // list two
        testListTwo.insertAtHead(4);
        testListTwo.insertAtHead(9);
        testListTwo.insertAtHead(5);

        LinkedList.mergeLinkedLists(testListOne, testListTwo);

        assertEquals("should get 1 5 3 9 2 4",
                "1, 5, 3, 9, 2, 4",
                testListOne.toString()
        );
    }

    // test unequal length lists with list one being longer
    @Test
    public void testMergeLinkedLists2() {
        LinkedList testListOne = new LinkedList();
        LinkedList testListTwo = new LinkedList();
        // list one
        testListOne.insertAtHead(2);
        testListOne.insertAtHead(3);
        testListOne.insertAtHead(1);
        testListOne.insertAtHead(6);
        // list two
        testListTwo.insertAtHead(4);
        testListTwo.insertAtHead(9);
        testListTwo.insertAtHead(5);

        LinkedList.mergeLinkedLists(testListOne, testListTwo);

        assertEquals("should get 6 5 1 9 3 4 2",
                "6, 5, 1, 9, 3, 4, 2",
                testListOne.toString()
        );
    }

    // test unequal length lists with list two being longer
    @Test
    public void testMergeLinkedLists3() {
        LinkedList testListOne = new LinkedList();
        LinkedList testListTwo = new LinkedList();
        // list one
        testListOne.insertAtHead(2);
        testListOne.insertAtHead(3);
        // list two
        testListTwo.insertAtHead(4);
        testListTwo.insertAtHead(9);
        testListTwo.insertAtHead(5);

        LinkedList.mergeLinkedLists(testListOne, testListTwo);

        assertEquals("should get 3 5 2 9 4",
                "3, 5, 2, 9, 4",
                testListOne.toString()
        );
    }

    // Tests the method: mergeLinkedLists()
    @Test
    public void testMergeLinkedLists4() {
        LinkedList testListOne = new LinkedList();
        LinkedList testListTwo = new LinkedList();
        // list one
        testListOne.insertAtHead(2);
        testListOne.insertAtHead(3);
        testListOne.insertAtHead(1);
        testListOne.insertAtHead(6);
        LinkedList.mergeLinkedLists(testListOne, testListTwo);

        assertEquals("should get 6 1 3 2",
                "6, 1, 3, 2",
                testListOne.toString()
        );
    }
}

/*
Remember these weird ones:
1. Check before head
2. Check what happens when inserting into an empty list
 */