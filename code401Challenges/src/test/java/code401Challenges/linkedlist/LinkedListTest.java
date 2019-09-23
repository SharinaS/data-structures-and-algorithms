package code401Challenges.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

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


}

